package com.kabira.sql_enjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SqlEnjection {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter MemberId ");
			int memberId = sc.nextInt();
			System.out.println("memId" + memberId);
			System.out.println("Enter Member Name: ");
			sc.nextLine();
			String memberName = sc.nextLine();
//			int memberId = 164;
//			String memberName = "Bm";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/Assignment_2?allowMultiQueries=true", "root", "beliver012");

			String query = "select * from members2 where memberId =" + memberId + " and member_name = '" + memberName
					+ "'";
			Statement stmt = con.createStatement();
			System.out.println(query);

			stmt.execute(query);

			ResultSet res = stmt.executeQuery(query);

			if (res.next()) {
				System.out.println("Valid User");
				System.out.println(res.getString(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
				System.out.println(res.getString(4));

			} else {
				System.out.println("::::::Invalid Users ::::::");
			}

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
