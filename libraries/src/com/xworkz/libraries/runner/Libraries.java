package com.xworkz.libraries.runner;

import java.sql.Connection;
import java.sql.DriverManager;

public class Libraries {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/libraries";
		String userName="root";
		String password="root";
		
		try(Connection connection=DriverManager.getConnection(url,userName,password)){
			System.out.println("try with resource");
			
			if(connection!=null) {
				System.out.println("connection saved successfully");
			}else {
				System.out.println("conncetion failed");
			}
		}
		catch(Exception exception) {
			System.out.println("connection failes:"+exception.getMessage());
			exception.printStackTrace();
		}
	}
}
