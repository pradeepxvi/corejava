package com.corejava.jdbc;

import java.sql.*;

public class Main {

    private static final String username = "jeena";
    private static final String password = "jeena";
    private static final String url = "jdbc:mysql://localhost:3306/coursedb";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery("select * from course");

            // while (resultSet.next()) {
            // int id = resultSet.getInt("id");
            // System.out.println(id);
            // }

            String query = "insert into course(id, name, price) values (4, 'cyber security', 5000.0)";

            statement.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}