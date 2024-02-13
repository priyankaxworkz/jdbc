package com.xworkz.mountain.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountain.constant.ConnectionData;
import com.xworkz.mountain.dto.MountainDto;

public class AnnapurnaMountainRunner {

	public static void main(String[] args) {
		
MountainDto dto= new MountainDto("annaporna",8091.0,"nepal");
		
		String query="insert into mountain_table(mountain_name,mountain_height,mountain_location)"
				+ "values(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			preparestatement.setString(1,dto.getMountainName());
			preparestatement.setDouble(2,dto.getHeight());
			preparestatement.setString(3,dto.getLocation());
			
			preparestatement.executeUpdate();
			System.out.println("data is inserted");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
