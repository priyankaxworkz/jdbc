package com.xworkz.employees.constant;

public enum ConnectionsData {

URL("jdbc:mysql://localhost:3306/employees"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private ConnectionsData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
