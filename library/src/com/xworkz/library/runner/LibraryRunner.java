package com.xworkz.library.runner;

public class LibraryRunner {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException exception) {
			exception.printStackTrace();
		}
	}
}
