package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ConnectionData;

public class ProductRunner {

	public static void main(String[] args) {
		

		
		String query="select product_name,product_price from product_table where product_price=100 ";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			preparestatement.setString(1,"cosmetic");
			preparestatement.setInt(2,500);
			preparestatement.setString(3,"cosmetic345");
			preparestatement.setString(4,"4.3");
			
			preparestatement.addBatch();
			preparestatement.setString(1,"book");
			preparestatement.setInt(2,500);
			preparestatement.setString(3,"book34");
			preparestatement.setString(4,"4.5");
			preparestatement.executeBatch();
			
		ResultSet rs=preparestatement.getResultSet();
			
		while(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		}
		
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
