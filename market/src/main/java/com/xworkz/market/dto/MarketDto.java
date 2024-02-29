package com.xworkz.market.dto;

import javax.persistence.Id;

import com.xworkz.market.entity.MarketEntity;

import lombok.Data;

@Data
public class MarketDto {

	@Id
	private int id;
	private String name;
	private String location;
	private long contactNumber;
	private int price;
}
