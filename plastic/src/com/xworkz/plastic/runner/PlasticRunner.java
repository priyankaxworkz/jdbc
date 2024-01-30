package com.xworkz.plastic.runner;

public class PlasticRunner {
	
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(ClassNotFoundException exception) {
		exception.printStackTrace();
	}
}
}
