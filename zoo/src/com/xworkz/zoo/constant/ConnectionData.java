package com.xworkz.zoo.constant;

public enum ConnectionData {
	
	URL,USERNAME,PASSWORD;
	
	private String value;
	
	
	public void setValue(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}

	
}
