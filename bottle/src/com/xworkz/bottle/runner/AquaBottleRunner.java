package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constatnts.ConnectionData;

public class AquaBottleRunner {

	public static void main(String[] args) {
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="insert into bottle_info values('cello',250)";
			String querys="update bottle_info set bottle_name='stainlesssteel' where bottle_name='cello'";
			statement.execute(query);
		int rs=statement.executeUpdate(querys);
			if(rs>=2) {
				System.out.println("it is updated");
			}else {
				System.out.println("it is not updated");
			}
			
		}
		
		catch(SQLException exception) {
			System.out.println("class is not connected");
			exception.printStackTrace();
		}
	}
}
