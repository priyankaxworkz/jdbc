package com.xworkz.employees.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.employees.constant.ConnectionsData;


public class Employee {
	
public static void main(String[] args) {
	
	String query="update employees_table set salary=? where department=?";
	try(Connection connection=DriverManager.getConnection(ConnectionsData.URL.getValue(),
			ConnectionsData.USERNAME.getValue(),ConnectionsData.PASSWORD.getValue());
			PreparedStatement preparestatement=connection.prepareStatement(query)){
		
		preparestatement.setInt(1,50000);
		preparestatement.setString(2,"IT");
		
		preparestatement.executeUpdate();
		
	}
	catch(SQLException exception) {
		exception.printStackTrace();
	}
	

}}
