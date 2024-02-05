package com.xworkz.nationalpark.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.nationalpark.constant.ConnectionData;

public class BandipurNationalParkRunner {
	
public static void main(String[] args) throws Exception {
		
		String query="select park_name from park_details";
		
		Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		PreparedStatement preparestatement=connection.prepareStatement(query);
	
	
	ResultSet resultSet=preparestatement.executeQuery();
	
	while(resultSet.next()) {
		System.out.println(resultSet.getString(1));
	}
}
}
