package com.xworkz.school.runner;

import java.sql.Connection;
import java.sql.DriverManager;

public class School {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/school";
		String userName="root";
		String password="root";
		
		try(Connection connection=DriverManager.getConnection(url,userName,password)){
			System.out.println("try with rsource");
			
			if(connection!=null) {
				System.out.println("connection saved successfully");
			}else {
				System.out.println("conncetion failed");
			}
		}
		catch(Exception exception) {
			System.out.println("Connection failes:"+exception.getMessage());
		 exception.printStackTrace();
		}
	}
}
