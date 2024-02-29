package com.xworkz.shops.repository;

import java.util.List;

import com.xworkz.shops.entity.ShopsEntity;

public interface ShopsRepository {

	List<ShopsEntity> read();
	
	String readByName();
	
	Object readPriceByLocation();
	
	Object[] readpriceandNameById();
	
	List<Integer> findpriceByContactNumber();
	
	List<Object[]> findLocationAndNumberByPrice();
	
	int findMaxPrice();
	
	long countContactNumber();
	
}
