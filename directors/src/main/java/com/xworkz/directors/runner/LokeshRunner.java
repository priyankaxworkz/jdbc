package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LokeshRunner {

	public static void main(String[] args) {
		
	String query="select * from directors_table where age between 20 and 80";
		
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/directors_db",
				"root","root");
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			
			preparestatement.getResultSet();
			
			System.out.println("read");
			ResultSet rs=preparestatement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getString(3)
				+""+rs.getInt(4)+""+rs.getInt(5));
			}
			
			
			
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
