package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constant.ConnectionData;

public class BookssRunner {
	public static void main(String[] args) {
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			
			System.out.println("class is connected");
			String query="insert into book_details values('githanjali',300)";
			String query1="update book_details set book_name='sleeping beauty'where book_name='githanjali'";
			statement.execute(query);
			
	    	int rs=statement.executeUpdate(query1);
			if(rs>=1) {
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
