package com.xworkz.market.repository;


import com.xworkz.market.entity.MarketEntity;

public interface MarketRepo {

	boolean update(MarketEntity entity,String name);
	
	boolean updateByPrice(MarketEntity entity,int price);
	
	boolean updateById(MarketEntity entity,String location);
	
	boolean updateLocationByNameAndPrice(MarketEntity entity,long contactNumber);
}
