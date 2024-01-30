package com.xworkz.phone.runner;

public class PhoneRunner {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}
