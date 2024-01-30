package com.xworkz.fan.runner;

public class FanRunner {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(ClassNotFoundException exception) {
		exception.printStackTrace();
	}
}
}
