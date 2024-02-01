package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constatnt.ConnectionData;

public class ReadmiChargerRunner {

	public static void main(String[] args) {
		
	String query="update charger_details set charger_name=? where charger_id=?";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedStatement.setString(1,"apple");
			preparedStatement.setInt(2, 4);
			
			preparedStatement.executeUpdate();
			}
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}

	}
}
