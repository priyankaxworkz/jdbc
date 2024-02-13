package com.xworkz.ocean.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.ocean.constant.ConnectionData;

public class TahitiOceanRunner {

	public static void main(String[] args) {
		
		String query="update ocean_table set ocean_located=? where ocean_located=?";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			preparestatement.setString(1,"EasterIsland");
			preparestatement.setString(2,"tahiti");
			
			preparestatement.executeUpdate();
			
			System.out.println("updated");
		}
		
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
