package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constatnt.ConnectionData;

public class ChargerRunner {
	
	public static void main(String[] args) {
		String query="insert into charger_details(charger_name,charger_type,charger_companyname,charger_code,charger_price,charger_color,charger_quality) values(?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedStatement.setString(1,"usb");
			preparedStatement.setInt(2,3);
			preparedStatement.setString(3,"galco");
			preparedStatement.setInt(4,8504);
			preparedStatement.setDouble(5,342.2);
			preparedStatement.setInt(6,3);
			preparedStatement.setFloat(7,4.8f);
			
			preparedStatement.executeUpdate();
			}
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}
}