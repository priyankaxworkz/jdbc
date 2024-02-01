package com.xworkz.fruits.constant;

public enum ConnectionData {

	URL("jdbc:mysql://localhost:3306/fruits"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private ConnectionData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
