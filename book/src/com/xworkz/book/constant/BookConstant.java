package com.xworkz.book.constant;


public enum BookConstant {

	URL("jdbc:mysql://localhost:3306/book"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private BookConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
