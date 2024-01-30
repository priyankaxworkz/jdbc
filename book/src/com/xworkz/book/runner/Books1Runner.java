package com.xworkz.book.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.book.constant.BookConstant;

public class Books1Runner {
	public static void main(String[] args) {
		
		try(Connection connection=DriverManager.getConnection(BookConstant.URL.getValue(),
				BookConstant.USERNAME.getValue(),BookConstant.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			
			System.out.println("class is connected");
			String query="insert into book_details values('githanjali',300)";
			
			statement.execute(query);
			int rs=statement.executeUpdate(query);
			if(rs==1) {
				System.out.println("it is connected");
			}else {
				System.out.println("it is not connected");
			}
			
			
		}
		catch(SQLException e) {
			System.out.println("class is not connected");
			e.printStackTrace();
		}
	}

}
