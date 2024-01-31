package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.bottle.constatnts.ConnectionData;

public class PlasticBottleRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
		Statement statement=connection.createStatement()){
			System.out.println("class is connected");
			String query="insert into bottle_info values('aluminium',30)";
			String query1="update bottle_info set bottle_name='kuber' where bottle_name='aluminium'";
			statement.execute(query);
			int rs=statement.executeUpdate(query1);
			if(rs>=1) {
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
