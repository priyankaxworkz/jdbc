package com.xworkz.bottle.constatnts;

public enum BottleConstant {
	
URL("jdbc:mysql://localhost:3306/bottle"),USERNAME("root"),PASSWORD("root");
	
	private String value;

	private BottleConstant(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
