package com.xworkz.bike.runner;

public class BikeRunner {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(ClassNotFoundException e) {
		      e.printStackTrace();
		}
			
		}
}
