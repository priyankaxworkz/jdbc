package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constant.ConnectionData;

public class FruitRunner {
	
	public static void main(String[] args) {
		String query="insert into fruit_table(fruit_name,fruit_price,fruit_disscount,fruit_quality,fruit_type,fruit_color,fruit_place) values(?,?,?,?,?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparedStatement=connection.prepareStatement(query)){
			System.out.println("class is connected");
			preparedStatement.setString(1,"apple");
			preparedStatement.setInt(2,100);
			preparedStatement.setDouble(3,2.5);
			preparedStatement.setFloat(4, 4.2f);
			preparedStatement.setInt(5, 20);
			preparedStatement.setString(6,"red");
			preparedStatement.setString(7,"kashmir");
			
			preparedStatement.executeUpdate();
			}
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}

}
