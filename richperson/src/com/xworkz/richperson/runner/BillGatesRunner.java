package com.xworkz.richperson.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.richperson.constant.ConnectionData;

public class BillGatesRunner {
	public static void main(String[] args) {
		
		String query="update richperson_details set richperson_totalamount=? where richperson_totalamount=?";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query);){
			System.out.println("class is connected");
			preparestatement.setInt(1,21085);
			preparestatement.setInt(2, 210);
			
			preparestatement.executeUpdate();
	}

		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}
}
