package com.xworkz.mountain.constant;

public enum ConnectionData {

	URL("jdbc:mysql://localhost:3306/mountains"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private ConnectionData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
