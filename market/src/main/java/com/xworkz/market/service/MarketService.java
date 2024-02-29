package com.xworkz.market.service;

import com.xworkz.market.dto.MarketDto;

public interface MarketService {

	boolean updateByName(MarketDto dto,String name);
	
	boolean updateByPrice(MarketDto dto,int price);
	
	boolean updateById(MarketDto dto,String location);
	
	boolean updateLocationByPriceAndName(MarketDto dto,long contactNumber);
}
