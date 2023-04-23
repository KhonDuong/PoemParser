package parser;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PoemParser {
    /**
     * HTML can't be used with scanner directly,
     * so get it into a string format using BufferedReader.
     *
     * @param file      the file that the poem belongs in
     * @return          returns the raw text of the poem itself with HTML characters and punctuation intact
     */
    public String getHTMLAsString(String file)
    {
        String output = "";

        try {
            String nextLine;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                while((nextLine = bufferedReader.readLine()) != null) {
                    output = output + nextLine + "\n";
                }

            } catch (IOException e) {
                System.out.print("Unable to read file.");
            }
        } catch (FileNotFoundException e){
            System.out.print("File not found.");
        }
        return output;
    }

    /**
     * Filter out any content inside <html tags> and any non-text content
     * Only returns content between the start of the poem and the end of the poem.
     *
     *
     * @param unfilteredPoem    the raw text of the poem itself with HTML characters and punctuation intact
     * @param poemStart         the first line of the poem
     * @param poemEnd           the last line of the poem
     * @return                  returns only the formatted text of the poem in uppercase, no punctuation or HTML
     */
    public String filterToPoem(String unfilteredPoem, String poemStart, String poemEnd)
    {
        String output = "";

        // Create RegEx patterns to filter text to only what's desired
        Pattern poemStartPattern = Pattern.compile("^" + poemStart + "$"); // Line should only contain the title from start to end of line.
        Pattern poemEndPattern = Pattern.compile("^" + poemEnd + "$"); // Line should only contain the end from start to end of line.
        Matcher matcher;


        Scanner scanner = new Scanner(unfilteredPoem);
        boolean isPoemContent = false;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            nextLine = TextFormatter.formatText(nextLine); // Filter out unwanted characters before identifying start and end of poem

            // Append start of content to end of content to the output
            if (isPoemContent) {
                // System.out.println(nextLine);
                output = output + nextLine + " ";

                matcher = poemEndPattern.matcher(nextLine);
                if (matcher.matches()) {
                    break; // end of poem, break out of while loop
                }
            } else {
                matcher = poemStartPattern.matcher(nextLine);
                if (matcher.matches()) {
                    isPoemContent = true; // start of poem, begin appending to output
                    // System.out.println(nextLine);
                    output = output + nextLine + " ";
                }
            }
        }

        output = output.toUpperCase(); // Make entire poem upper case so that array keys are the same
        return output; // Output will be the entire poem, uppercased, on a single line so it can be split by " "
    }


    /**
     * Splits the poem string by " "
     * Counts occurrences using a hashmap
     * Sorts values of hashmap using an arraylist
     * Prints out top 20 most used words
     *
     * @param filteredPoem      the formatted text of the poem in uppercase, no punctuation or HTML
     * @return                  returns an ArrayList of the most used words and how many times used as KV pair
     */
    public ArrayList<Map.Entry<String, Integer>> mostUsedWords(String filteredPoem)
    {
        HashMap<String, Integer> wordOccurrenceMap = new HashMap<>();

        String[] wordArray = filteredPoem.split(" ");
        for (String word : wordArray) { // Get word usage into a HashMap containing key->word and value->count
            if (wordOccurrenceMap.containsKey(word)) {
                Integer wordMapCount = wordOccurrenceMap.get(word);
                wordOccurrenceMap.put(word, wordMapCount + 1); // Increment the count by 1 if word already exists.
            } else {
                wordOccurrenceMap.put(word, 1); // Start the count at 1 for each new word.
            }
        }

        // To sort, convert HashMap to ArrayList
        // HashMaps aren't sortable, ArrayLists are.
        ArrayList<Map.Entry<String, Integer>> wordOccurrenceList = new ArrayList<>(wordOccurrenceMap.entrySet());
        Collections.sort(wordOccurrenceList, Map.Entry.comparingByValue(Comparator.reverseOrder())); // Reverse order for DESC. Normally ASC.

        // System.out.println(wordOccurrenceList.get(0));
        return wordOccurrenceList;
    }

    public ArrayList<Map.Entry<String, Integer>> mostUsedWordsDBConnection(String filteredPoem)
    {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.deleteWords();

        String[] wordArray = filteredPoem.split(" ");
        for (String word : wordArray) {
            if (databaseConnection.wordExists(word)) {
                databaseConnection.updateWordFrequency(word, databaseConnection.getWordFrequency(word) + 1);
            } else {
                databaseConnection.addNewWord(word);
            }
        }

        return databaseConnection.getTopTwentyWords();
    }

    public void createUI()
    {
        // Create frame
        JFrame frame = new JFrame("Find out the top 20 used words in your poem!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        // Create instructions for how to use the program
        JLabel instructionLabel = new JLabel();
        instructionLabel.setBounds(100, 25, 400, 25);
        instructionLabel.setVerticalAlignment(JLabel.CENTER);
        instructionLabel.setHorizontalAlignment(JLabel.CENTER);
        instructionLabel.setText("Choose the HTM, HTML, or txt file of your poem, then write out");
        frame.add(instructionLabel);

        JLabel instructionLabel2 = new JLabel();
        instructionLabel2.setBounds(100, 50, 400, 25);
        instructionLabel2.setVerticalAlignment(JLabel.CENTER);
        instructionLabel2.setHorizontalAlignment(JLabel.CENTER);
        instructionLabel2.setText("the entire starting and ending line of the poem.");
        frame.add(instructionLabel2);

        // Choose file, but only when the openFileButton is pressed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("HTML File", "htm", "html", "txt");
        chooser.setFileFilter(filter);

        // Don't let the user try to parse a poem without even selecting a file first
        JButton parsePoemButton = new JButton();
        parsePoemButton.setBounds(232, 250, 132, 25);
        parsePoemButton.setText("Parse Poem");
        parsePoemButton.setEnabled(false);

        // If file is chosen, disable the button and let them know they picked a proper HTML file.
        JButton openFileButton = new JButton();
        openFileButton.setBounds(200, 75, 200, 45);
        openFileButton.setText("HTM, HTML, or txt File");
        openFileButton.addActionListener(e -> {
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                openFileButton.setText("File picked!");
                openFileButton.setEnabled(false);
                parsePoemButton.setEnabled(true);
            }
        });
        frame.add(openFileButton);

        // Labels and fields for the start and end of the poem
        JLabel poemTitleFieldLabel = new JLabel();
        poemTitleFieldLabel.setBounds(126, 130, 100, 25);
        poemTitleFieldLabel.setText("Poem Title: ");
        frame.add(poemTitleFieldLabel);

        JTextField poemTitleField = new JTextField();
        poemTitleField.setBounds(200, 130, 200, 30);
        frame.add(poemTitleField);

        JLabel poemEndFieldLabel = new JLabel();
        poemEndFieldLabel.setBounds(126, 170, 100, 25);
        poemEndFieldLabel.setText("Poem End: ");
        frame.add(poemEndFieldLabel);

        JTextField poemEndField = new JTextField();
        poemEndField.setBounds(200, 170, 200, 30);
        frame.add(poemEndField);

        // Final text label uses HTML to make use of <br> to create newlines.
        JLabel displayTopTwentyLabel = new JLabel();
        displayTopTwentyLabel.setBounds(25, 0, 400, 380);

        parsePoemButton.addActionListener(e -> {
            if (poemTitleField.getText() != null && !poemTitleField.getText().trim().isEmpty() && poemEndField.getText() != null && !poemEndField.getText().trim().isEmpty()) {
                // This order of functions used to be in main to get the file, filter it down to just the contents of the poem, and then to output the most used words in the poem.
                String output = this.getHTMLAsString(chooser.getSelectedFile().getName());
                output = this.filterToPoem(output, TextFormatter.formatText(poemTitleField.getText()), TextFormatter.formatText(poemEndField.getText()));
                ArrayList<Map.Entry<String, Integer>> wordOccurrenceList = this.mostUsedWordsDBConnection(output);

                // Create the text that goes into the final label of top twenty words.
                String htmlText = "<html>Here are the top twenty most used words in your poem.<br><br>";
                for (int i = 0; i < 20; i++) {
                    htmlText = htmlText.concat(Integer.toString(i + 1) + ". " + wordOccurrenceList.get(i) + "<br>");
                    // System.out.println(wordOccurrenceList.get(i)); // Output top 20 most used words.
                }
                htmlText = htmlText.concat("</html>");
                displayTopTwentyLabel.setText(htmlText);

                // Hide all the old instructions and display the output.
                instructionLabel.setVisible(false);
                instructionLabel2.setVisible(false);
                parsePoemButton.setVisible(false);
                openFileButton.setVisible(false);
                poemTitleFieldLabel.setVisible(false);
                poemTitleField.setVisible(false);
                poemEndFieldLabel.setVisible(false);
                poemEndField.setVisible(false);

                frame.add(displayTopTwentyLabel);
                frame.repaint();
                frame.revalidate();
            }
        });
        frame.add(parsePoemButton);

        frame.repaint();
        frame.revalidate();
    }
}