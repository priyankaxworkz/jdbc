package com.xworkz.chair.runner;

public class ChairRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}
