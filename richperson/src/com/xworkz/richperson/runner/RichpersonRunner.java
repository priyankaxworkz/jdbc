package com.xworkz.richperson.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.richperson.constant.ConnectionData;

public class RichpersonRunner {
	public static void main(String[] args) {
		
		String query="insert into richperson_details (richperson_name,richperson_noofestate,richperson_totalamount,richperson_place,richperson_age,richperson_totalshare,richperson__sourceofwealth)"
				+ "values(?,?,?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query);){
			System.out.println("class is connected");
			preparestatement.setString(1,"elonmusk");
			preparestatement.setInt(2,700);
			preparestatement.setInt(3,210);
			preparestatement.setString(4,"southafrica");
			preparestatement.setInt(5,52);
			preparestatement.setDouble(6,120.0);
			preparestatement.setString(7,"tesla");
			
			preparestatement.executeUpdate();
			
		}
		
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}

}
