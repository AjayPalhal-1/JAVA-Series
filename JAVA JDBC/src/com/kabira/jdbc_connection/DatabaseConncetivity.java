package com.kabira.jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConncetivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// Step 1 : Load the Driver According to our databases 

			// for oracle  and mysql its gonna differ:
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded....");

			// step 2 : Make a Connection: Connect to the database using the driver.
			
			// protocol : subprotocol:db-specific information
			// oracle port no ; 1521
			// mysql port no : 3306
//			jdbc:mysql://localhost:3306/Assignment_2", "root", "beliver012"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment_2", "root","beliver012");
			System.out.println("connection sucess....");
			
			
			// Step 3 : Create a Statement: Use the connection to create a SQL statement.
			String query = "select * from members";
			
			
			// Step 4 :Execute Queries: Run SQL queries and retrieve results.

			Statement stmt = con.createStatement();

//		    Step 5 Process Results: Iterate through the result set to process the data.

			ResultSet rs = stmt.executeQuery(query);
			// resultset does not conatain the actual data
			// it contains pointer to the actual data // curser

			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

			}
			
//			rs ref = rs.getMetaData();

			// Step 6 : Close Resources: Always close the connection, statement, and result set to free resources.

			rs.close();
			stmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// bydeafult sql can provide 50  connection 
