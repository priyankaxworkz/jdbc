package com.xworkz.countrys.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.countrys.constatnt.ConnectionData;

public class CountryRunner {

	public static void main(String[] args) {
		
		String query="insert into country_details (country_name,country_population,country_noofstate,country_capital,country_nooftaluk,country_flagcolor,country_pincode) values(?,?,?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedstatement.setString(1,"india");
			preparedstatement.setDouble(2,140.76);
			preparedstatement.setInt(3,29);
			preparedstatement.setString(4,"delhi");
			preparedstatement.setInt(5,5650);
			preparedstatement.setInt(6,3);
			preparedstatement.setInt(7,19101);
			
			preparedstatement.executeUpdate();
			
		}
		
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}
}
