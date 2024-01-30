package com.xworkz.laptop.runner;

public class LaptopRunner {

	public static void main(String[] args) {
		
		try{Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
}
}
