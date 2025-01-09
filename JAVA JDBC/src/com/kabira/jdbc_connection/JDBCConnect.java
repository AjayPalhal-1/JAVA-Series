package com.kabira.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment_2", "root", "beliver012");

			// Define the DML query (Insert example)
//			String queryString = "INSERT INTO users (name, email) VALUES ('ankush pawar', 'ankushpawar@example.com')";
			String queryString = "select * from members";
			// Create a statement
			Statement stmt = con.createStatement();

			// Execute the query
//			int rowsAffected = stmt.executeUpdate(queryString);
			ResultSet resultSet = stmt.executeQuery(queryString);

//			resultSet.next();
			while (resultSet.next()) {

				System.out
						.println(resultSet.getString(2) + "  " + resultSet.getString(5) + " " + resultSet.getString(4));
			}
			// Print the number of rows affected
//			System.out.println(rowsAffected + " row(s) inserted.");

			// Close the resources
			stmt.close();
			con.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQL Exception: " + e.getMessage());
		}

	}

}
