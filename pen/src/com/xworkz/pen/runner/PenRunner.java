package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constatnt.PenConstatnt;

public class PenRunner {
public static void main(String[] args) {
		
		try(Connection connection=DriverManager.getConnection(PenConstatnt.URL.getValue(),
				PenConstatnt.USERNAME.getValue(),PenConstatnt.PASSWORD.getValue());
				Statement statement=connection.createStatement()){
			
			System.out.println("class is connected");
			String query="insert into pen_info values('blacky',20)";
			statement.execute(query);
			}
		catch(SQLException e) {
			System.out.println("class is not connected");
			e.printStackTrace();
		}
}
}
