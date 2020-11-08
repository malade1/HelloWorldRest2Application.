package com.moses.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to the Database: " + jdbcUrl);

			Connection conn = (Connection) DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connection Successful!!!");
		} catch (Exception exc) {
			exc.printStackTrace();

		}
	}
}
