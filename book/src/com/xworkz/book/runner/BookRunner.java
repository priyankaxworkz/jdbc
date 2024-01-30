package com.xworkz.book.runner;

public class BookRunner {

	public static void main(String[] args) {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
