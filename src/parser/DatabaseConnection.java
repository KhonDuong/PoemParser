package parser;

import java.sql.*;
import java.util.*;

public class DatabaseConnection {
    private String url = "jdbc:mysql://localhost:3306/wordoccurences";
    private String user = "root";
    private String password = "#Arrow31";

    public boolean wordExists(String word) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = String.format("SELECT * FROM word WHERE words = '%s'", word);
                try (ResultSet result = statement.executeQuery(sql)) {
                    while (result.next()) {
                        System.out.println("the word '" + word + "' exists in the database.");
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("the word '" + word + "' does not exist in the database.");
        return false;
    }

    public int getWordFrequency(String word) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = String.format("SELECT frequency FROM word WHERE words = '%s'", word);
                try (ResultSet result = statement.executeQuery(sql)) {
                    while (result.next()) {
                        int frequency = result.getInt("frequency");
                        System.out.println("the frequency of the word '" + word + "' is " + frequency);
                        return frequency;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("the word '" + word + "' does not exist in the database.");
        return 0;
    }

    public void addNewWord(String word) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = String.format("INSERT INTO word VALUES ('%s', 1)", word);
                statement.execute(sql);
                System.out.println("'" + word + "' was added to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateWordFrequency(String word, int frequency) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = String.format("UPDATE word SET frequency = %d WHERE words = '%s'", frequency, word);
                statement.execute(sql);
                System.out.println("'" + word + "' frequency was set to " + frequency + ".");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteWords() {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = ("DELETE FROM word");
                statement.execute(sql);
                System.out.println("Deleted all existing words in table.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Map.Entry<String, Integer>> getTopTwentyWords() {
        HashMap<String, Integer> wordOccurrenceMap = new HashMap<>();

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = String.format("SELECT * FROM word ORDER BY frequency DESC LIMIT 20");
                try (ResultSet result = statement.executeQuery(sql)) {
                    while (result.next()) {
                        wordOccurrenceMap.put(result.getString("words"), result.getInt("frequency"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ArrayList<Map.Entry<String, Integer>> wordOccurrenceList = new ArrayList<>(wordOccurrenceMap.entrySet());
        Collections.sort(wordOccurrenceList, Map.Entry.comparingByValue(Comparator.reverseOrder())); // Reverse order for DESC. Normally ASC.
        return wordOccurrenceList;
    }
}
