import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        // Change file to poem requested
        String file = "The Project Gutenberg eBook of The Raven, by Edgar Allan Poe.htm";
        String output;

        Main main = new Main();
        output = main.getHTMLAsString(file);
        output = main.filterToPoem(output, "The Raven", "Shall be lifted nevermore");
        main.mostUsedWords(output);
    }

    /* HTML can't be used with scanner directly,
    so get it into a string format using BufferedReader. */
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
                System.out.println("Unable to read file.");
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
        return output;
    }

    /* Filter out any content inside <html tags> and any non-text content
    * Only returns content between the start of the poem and the end of the poem. */
    public String filterToPoem(String unfilteredPoem, String poemStart, String poemEnd)
    {
        String output = "";

        // Create RegEx patterns to filter text to only what's desired
        Pattern excludeHTMLTagPattern = Pattern.compile("<[^>]*>");
        Pattern excludeNonTextOrSpacesPattern = Pattern.compile("[^a-zA-Z *]+");
        Pattern normalizeWhiteSpacePattern = Pattern.compile(" {2,}"); // Sometimes there are multiple spaces between words, only 1 allowed
        Pattern poemStartPattern = Pattern.compile("^" + poemStart + "$");
        Pattern poemEndPattern = Pattern.compile("^" + poemEnd + "$");
        Matcher matcher;


        Scanner scanner = new Scanner(unfilteredPoem);
        boolean isPoemContent = false;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            matcher = excludeHTMLTagPattern.matcher(nextLine);
            nextLine = matcher.replaceAll(" ");
            matcher = excludeNonTextOrSpacesPattern.matcher(nextLine);
            nextLine = matcher.replaceAll(" ");
            nextLine = nextLine.trim(); // Important to trim excess whitespace at beginning or end, else match won't work.

            if (isPoemContent) {
                output = output + nextLine + " ";

                matcher = poemEndPattern.matcher(nextLine);
                if (matcher.matches()) {
                    break; // end of poem, break out of while loop
                }
            } else {
                matcher = poemStartPattern.matcher(nextLine);
                if (matcher.matches()) {
                    isPoemContent = true; // start of poem, begin appending to output
                    output = output + nextLine + " ";
                }
            }
        }

        matcher = normalizeWhiteSpacePattern.matcher(output);
        output = matcher.replaceAll(" "); // Get rid of any extra spaces
        output = output.toUpperCase(); // Make entire poem upper case so that array keys are the same
        return output; // Output will be the entire poem, uppercased, on a single line so it can be split by " "
    }

    /* Splits the poem string by " "
    * Counts occurrences using a hashmap
    * Sorts values of hashmap using an arraylist
    * Prints out top 20 most used words
    */
    public void mostUsedWords(String filteredPoem)
    {
        HashMap<String, Integer> wordOccurrenceMap = new HashMap<>();

        String[] wordArray = filteredPoem.split(" ");
        for (String word : wordArray) { // Get word usage into a HashMap containing key->word and value->count
            if (wordOccurrenceMap.containsKey(word)) {
                Integer wordMapValue = wordOccurrenceMap.get(word);
                wordOccurrenceMap.put(word, wordMapValue + 1);
            } else {
                wordOccurrenceMap.put(word, 1);
            }
        }

        // To sort, convert HashMap to ArrayList
        ArrayList<Map.Entry<String, Integer>> wordOccurrenceList = new ArrayList<>(wordOccurrenceMap.entrySet());

        Collections.sort(wordOccurrenceList, Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (int i = 0; i < 20; i++) {
            System.out.println(wordOccurrenceList.get(i));
        }
    }
}