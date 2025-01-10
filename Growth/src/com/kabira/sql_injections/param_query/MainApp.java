package com.kabira.sql_injections.param_query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            // Step 1: Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Succesfully!!!!!!");

            // Step 2: Establish a connection to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Assignment_2?allowMultiQueries=true", "root", "beliver012");
            System.out.println("Connection Did Succesfully!!!!!!");


            // Step 3: Prepare the SQL query with placeholders  (? ) to prevent SQL injection
            String query = "select * from Books where Book_No =? and Book_Name = ?;";
            PreparedStatement pstmt = con.prepareStatement(query);
            System.out.println(query);

            // Step 4: Get user input for Book_No and Book_Name
            System.out.println("Enter Book No. ");
            int Book_No = sc.nextInt();
            System.out.println("Enter Book Name");
            sc.nextLine(); // Consume newline
            String Book_Name = sc.nextLine();

            // Step 5: Set the values for the placeholders in the query
            pstmt.setInt(1, Book_No); // Sets the first placeholder (?)
            pstmt.setString(2, Book_Name); // Sets the second placeholder (?)

            // Debugging: Print the prepared statement to check the query with parameters
            System.out.println(pstmt.toString());

            // Step 6: Execute the query and process the result set
            ResultSet res = pstmt.executeQuery();

            if (res.next()) {
                // If results are found, iterate through them and print the details
                do {
                    System.out.print("Valid User    ");
                    System.out.print(res.getString(1) + "  "); // Book_No
                    System.out.print(res.getString(2) + "  "); // Book_Name
                    System.out.print(res.getString(3) + "  "); // Author
                    System.out.print(res.getString(4) + "  "); // Publisher
                    System.out.print(res.getString(5) + "  "); // Price
                    System.out.println();

                } while (res.next());
            } else {
                // If no results are found, print "invalid"
                System.out.println("invalid Credentials ");
            }

            // Step 7: Close the database connection
            con.close();
            System.out.println("Connection Closed !!! ");

        } catch (ClassNotFoundException e) {
            // Handles exception if the JDBC driver class is not found
            e.printStackTrace();
        } catch (SQLException e) {
            // Handles SQL-related exceptions
            e.printStackTrace();
        }
    }
}
