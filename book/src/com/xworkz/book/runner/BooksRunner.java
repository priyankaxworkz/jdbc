package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BooksRunner {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/book";
		String userName="root";
		String password="root";
		
	try(Connection connection=DriverManager.getConnection(url, userName, password)){
		System.out.println("this is try with resource");
		if(connection!=null) {
			System.out.println("connection is saved successfully");
		}else {
			System.out.println("connection is not saved");
		}
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}
}
