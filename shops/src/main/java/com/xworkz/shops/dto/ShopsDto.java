package com.xworkz.shops.dto;

import javax.persistence.Id;

import lombok.Data;

@Data
public class ShopsDto {

	@Id
	private int id;
	private String shopName;
	private int cost;
	private String location;
	private long contactNumber;
	
}
