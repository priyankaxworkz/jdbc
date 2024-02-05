package com.xworkz.nationalpark.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.nationalpark.constant.ConnectionData;

public class BannerghataNationalParkRunner {

	public static void main(String[] args) throws Exception {
		
		String query="select park_head,park_location,park_landmass from park_details where park_id=?";
		
		Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		PreparedStatement preparestatement=connection.prepareStatement(query);

		preparestatement.setInt(1,1);


	ResultSet resultSet=preparestatement.executeQuery();

	while(resultSet.next()) {
		System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
	}
	}
}
