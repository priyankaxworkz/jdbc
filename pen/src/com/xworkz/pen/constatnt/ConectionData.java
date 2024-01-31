package com.xworkz.pen.constatnt;

public enum ConectionData {
	
URL("jdbc:mysql://localhost:3306/pen"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private ConectionData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
