package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constatnt.ConectionData;

public class PenspRunner {
	public static void main(String[] args) {
		
		try(Connection connection=DriverManager.getConnection(ConectionData.URL.getValue(),
				ConectionData.USERNAME.getValue(),ConectionData.PASSWORD.getValue());
			Statement statement=connection.createStatement()){
		System.out.println("class is connected");
		String query="insert into pen_info values('apsara',5)";
		String query1="update pen_info set pen_name='doms'where pen_name='apsara'";
		
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
