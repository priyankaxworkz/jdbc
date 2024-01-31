package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constant.ConnectionData;

public class TextBooksRunner {
	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			
			String query="insert into book_details values('ramayana',250)";
			String query1="update book_details set book_name='the city' where book_name='ramayana'";
			
			statement.execute(query);
			int rs=statement.executeUpdate(query1);
			if(rs>=2) {
				System.out.println("it is updated");
			}else {
				System.out.println("it is not updated");
			}
			
		}
		
	catch(SQLException exception) {
		System.out.println("class is not connected");
		exception.printStackTrace();
	}
	}
	}


