package parser;

import java.sql.*;

public class databaseConnection {
    private String url = "jdbc:mysql://localhost:3306/wordoccurences";
    private String user = "root";
    private String password = "#Arrow31";
    public static void main(String[] args) {

    }

    private void executeQuery(String SQL) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            try (Statement statement = connection.createStatement()) {
                String sql = "SELECT * FROM wordoccurences.word";
                try (ResultSet result = statement.executeQuery(sql)) {
                    while (result.next()) {
                        String word = result.getString("words");
                        int frequency = result.getInt("frequency");
                        System.out.println(word + frequency);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
