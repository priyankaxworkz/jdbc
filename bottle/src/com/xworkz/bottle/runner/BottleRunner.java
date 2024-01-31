package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constatnts.ConnectionData;


public class BottleRunner {
public static void main(String[] args) {
	
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
			ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			Statement statement=connection.createStatement()){
		
		System.out.println("class is connected");
		String query="insert into bottle_info values('giftan',450)";
		statement.execute(query);
		}
	catch(SQLException e) {
		System.out.println("class is not connected");
		e.printStackTrace();
	}
}
}
