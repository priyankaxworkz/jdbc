package com.xworkz.states.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.states.constants.ConnectionData;
import com.xworkz.states.dto.StatesDto;

public class StatesRepoImpl implements StatesRepo {

	@Override
	public boolean save(StatesDto dto) {
		System.out.println("this is repo");
		
		String query="INSERT INTO state_details(state_name,state_noofdistrict,state_nooftaluks,state_population,state_tardition,"
				+ "state_capital,state_cmname,state_famousplace,state_specialfood)Values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement prepareStatement=connection.prepareStatement(query)){
			prepareStatement.setString(1,dto.getState_name());
			prepareStatement.setInt(2,dto.getState_noofdistrict());
			prepareStatement.setInt(3,dto.getState_nooftaluks());
			prepareStatement.setDouble(4,dto.getState_population());
			prepareStatement.setString(5,dto.getState_tardition());
			prepareStatement.setString(6,dto.getState_capital());
			prepareStatement.setString(7,dto.getState_cmname());
			prepareStatement.setString(8,dto.getState_famousplace());
			prepareStatement.setString(9,dto.getState_specialfood());
			
			prepareStatement.executeUpdate();
			System.out.println("this data stores in repo");
		}
		
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		return true;
	}

}
