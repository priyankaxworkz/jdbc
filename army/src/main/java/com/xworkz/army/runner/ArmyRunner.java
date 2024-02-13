package com.xworkz.army.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.army.constant.ConnectionData;
import com.xworkz.army.dto.ArmyDto;

public class ArmyRunner {

	public static void main(String[] args) {
		
		ArmyDto dto=new ArmyDto("manoje pande","Gorkha Rifles");
		
		String query="insert into army_table(army_commandName,army_battalion)values(?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			
			preparestatement.setString(1,dto.getCommandName());
			preparestatement.setString(2,dto.getBattalion());
			
			preparestatement.executeUpdate();
			
		}
			catch(SQLException exception) {
				exception.printStackTrace();
			}

	}
}
