package com.xworkz.continents.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.continents.constant.ConnectionData;

public class MexicoCountryRunner {
	public static void main(String[] args) {
		String query="insert into continent_details(continent_name,continent_country,continent_population,continent_noofocean,continent_noofcity,continent_landmasses,continent_famousplaces,continent_leaders)values(?,?,?,?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),ConnectionData.USERNAME.getValue(),
					ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
					System.out.println("class is connected");
					
					preparestatement.setString(1,"antartica");
					preparestatement.setString(2,"america");
					preparestatement.setDouble(3,134.7);
					preparestatement.setInt(4,6);
					preparestatement.setInt(5,700);
					preparestatement.setFloat(6,12.53f);
					preparestatement.setInt(7,40);
					preparestatement.setString(8,"obbama");
					
					preparestatement.executeUpdate();
			
		}
				
				catch(SQLException exception) {
					System.out.println("class is not connected");
					exception.printStackTrace();
				}
	}

}
