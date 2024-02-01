package com.xworkz.countrys.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.countrys.constatnt.ConnectionData;

public class IndiaCountryRunner {
	public static void main(String[] args) {
		
		String query="update country_details set country_name=? where country_name=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		PreparedStatement preparedstatement=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedstatement.setString(1,"argentia");
			preparedstatement.setString(2,"india");
			
			preparedstatement.executeUpdate();
			
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}

}
