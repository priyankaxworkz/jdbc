package com.xworkz.ocean.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.ocean.constant.ConnectionData;
import com.xworkz.ocean.dto.OceanDto;

public class IndianOceanRunner {

	public static void main(String[] args) {
		
		OceanDto dto=new OceanDto("pacific","tahiti");
		String query="insert into ocean_table(ocean_name,ocean_located)values(?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			preparestatement.setString(1,dto.getOceanName());
			preparestatement.setNString(2,dto.getLocated());
			
			preparestatement.executeUpdate();
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
