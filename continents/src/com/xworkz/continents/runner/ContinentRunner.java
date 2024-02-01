package com.xworkz.continents.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.continents.constant.ConnectionData;

public class ContinentRunner {

	public static void main(String[] args) {
		String query="insert into continent_details(continent_name,continent_country,continent_population,continent_noofocean,continent_noofcity,continent_landmasses,continent_famousplaces,continent_leaders)values(?,?,?,?,?,?,?,?)";
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
				ConnectionData.PASSWORD.getValue());
			PreparedStatement preparestatement=connection.prepareStatement(query)){
				System.out.println("class is connected");
				
				preparestatement.setString(1,"asia");
				preparestatement.setString(2,"bangladesh");
				preparestatement.setDouble(3,4.75);
				preparestatement.setInt(4,5);
				preparestatement.setInt(5,30);
				preparestatement.setFloat(6,5.2f);
				preparestatement.setInt(7,6);
				preparestatement.setString(8,"abdul hamid");
				
				preparestatement.executeUpdate();
		
	}
			
			catch(SQLException exception) {
				System.out.println("class is not connected");
				exception.printStackTrace();
			}
				
}
}
