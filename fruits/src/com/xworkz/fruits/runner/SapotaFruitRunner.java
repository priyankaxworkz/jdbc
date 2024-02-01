package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constant.ConnectionData;

public class SapotaFruitRunner {

public static void main(String[] args) {
		
		String query="update fruit_table set fruit_name=? where fruit_id=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
			
			System.out.println("class is connected");
			preparedstatement.setString(1,"sopata");
			preparedstatement.setInt(2, 2);
			
			preparedstatement.executeUpdate();
			}
		
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}
}
