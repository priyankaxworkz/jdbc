package com.xworkz.nationalpark.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.nationalpark.constant.ConnectionData;

public class KazaringaParkRunner {
	public static void main(String[] args) throws Exception {
String query="select * from park_details order by  park_landmass  asc ";
		
		Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		PreparedStatement preparestatement=connection.prepareStatement(query);


	ResultSet resultSet=preparestatement.executeQuery();

	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getInt(4)+
				" "+resultSet.getInt(5)+" "+resultSet.getString(6)+" "+resultSet.getInt(7));
	}
	}
		
	}


