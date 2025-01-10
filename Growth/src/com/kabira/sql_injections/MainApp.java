package com.kabira.sql_injections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Book No. ");
			int Book_No = sc.nextInt();
			System.out.println("Enter Book Name");
			sc.nextLine();
			String Book_Name = sc.nextLine();
			
			// ' or '1'='1  injection bolte !!!
			

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment_2?allowMultiQueries=true",
					"root", "beliver012");

//			String query = "select * from Books where Book_No =" + Book_No + " and Book_Name = '" + Book_Name
//					+ "'";
			String query = "select * from Books where Book_No =" + Book_No + " and Book_Name = '" + Book_Name + "'";
			Statement stmt = con.createStatement();
			System.out.println(query);

			stmt.execute(query);

			ResultSet res = stmt.executeQuery(query);
			
			if(res.next())
			{
				do {
					System.out.print("Valid User    ");
					System.out.print(res.getString(1)+"  ");
					System.out.print(res.getString(2)+"  ");
					System.out.print(res.getString(3)+"  ");
					System.out.print(res.getString(4)+"  ");
					System.out.print(res.getString(5)+"  ");
					System.out.println();

				}while(res.next());
			}
			
			else
				System.out.println("invalid");
			
			con.close();
			System.out.println("Connection Closed ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
