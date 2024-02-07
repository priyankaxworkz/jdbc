package com.xworkz.zoo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.zoo.constant.ConnectionData;
import com.xworkz.zoo.dto.ZooDto;

public class ZooRepoImpl implements ZooRepository {

	@Override
	public boolean save(ZooDto zooDto) {
		System.out.println("this is repo");
		String query="INSERT INTO zoo_table(zoo_name,zoo_location,zoo_timming) VALUES(?,?,?)";
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			PreparedStatement preparestatement=connection.prepareStatement(query)){
		preparestatement.setString(1,zooDto.getName());
		preparestatement.setString(2,zooDto.getLocation());
		preparestatement.setDouble(3,zooDto.getTimming());
		
		preparestatement.executeUpdate();
		System.out.println("this data stored in repo");
	}
	
	catch(SQLException exception) {
		exception.printStackTrace();
	}
		return true;
	}

}
