package com.xworkz.army.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.army.constant.ConnectionData;

public class ArmysRunner {

	public static void main(String[] args) {
		
		String query="select * from army_table";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestaement=connection.prepareStatement(query)){
			preparestaement.getResultSet();
			
			ResultSet rs=preparestaement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
