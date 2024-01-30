package com.xworkz.bikes.runner;

import java.sql.Connection;
import java.sql.DriverManager;


public class BikesRunner {	
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/bike";
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
	catch(Exception e) {
		System.out.println("connection failes:"+e.getMessage());
		e.printStackTrace();
	}
}

}
