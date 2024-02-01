package com.xworkz.continents.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.continents.constant.ConnectionData;

public class NigeriaContinentRunner {

	public static void main(String[] args) {
		
		String query="update continent_details set continent_country=? where continent_country=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
			PreparedStatement preparestatement=connection.prepareStatement(query)){
				System.out.println("class is connected");
				
				preparestatement.setString(1,"nigeria");
				preparestatement.setString(2,"egypt");
				
				
				preparestatement.executeUpdate();
		
	}
			
			catch(SQLException exception) {
				System.out.println("class is not connected");
				exception.printStackTrace();
			}
	}
}
