package org.sephora.day4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresJDBC {
    // Step 1: Import the required packages

    // Before running this code, make sure you have the Postgres JDBC driver in your classpath if you don't have gradle or maven setup
    // You can download the driver from https://jdbc.postgresql.org/download/

    // If using gradle: Add dependency in build.gradle implementation("org.postgresql:postgresql:42.7.2")

    // Step 3: Create the connection object

    // Step 4: Run
        // check database name. if not exists - org.postgresql.util.PSQLException: FATAL: database "dbname" does not exist
        // Check user name and password
        // check the table name you are trying to access
    public static void main(String[] args) {
        System.out.println("Postgres JDBC Example");
        Connection connection = null;
        try {
            // Load the Postgres JDBC driver
//            Class.forName("org.postgresql.Driver");

            // Create the connection object
            // This is also called as opening a connection
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "password");

            // Create a statement object
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mst_users"); // use your table name

            // Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " "
                        + resultSet.getString(2) + " "
                        + resultSet.getString(3));
            }

            // Close the connection when the operation completed
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            // close
//            connection.close();
        }
    }
}
