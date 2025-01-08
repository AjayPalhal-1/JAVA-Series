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
			// step 1

			// Driver Installation
			// for oracle :
			//
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2
			// protocol : subprotocol:db-specific information
			// oracle port no ; 1521
			// mysql port no : 3306

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3006/members", "root", "beliver012");

			// step 3
			String query = "select * from members";
			// step 4

			Statement stmt = con.createStatement();

//		step 5 

			ResultSet rs = stmt.executeQuery(query);
			// resultset does not conatain the actual data
			// it contains pointer to the actual data // curser  

			// step 6
			rs.next();
//			rs ref = rs.getMetaData();
			System.out.println(rs.getString(1));

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
