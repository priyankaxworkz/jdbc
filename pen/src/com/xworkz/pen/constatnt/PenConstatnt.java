package com.xworkz.pen.constatnt;

public enum PenConstatnt {
	
URL("jdbc:mysql://localhost:3306/pen"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private PenConstatnt(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
