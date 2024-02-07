package com.xworkz.pencil.constant;

public enum ConnectionData {

	URL,USERNAME,PASSWORD;
	
	private String data;
	
	public void setData(String data) {
		this.data=data;
	}
	public String getData() {
		return data;
	}
}
