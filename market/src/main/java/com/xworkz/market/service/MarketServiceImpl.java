package com.xworkz.market.service;

import com.xworkz.market.dto.MarketDto;
import com.xworkz.market.repository.MarketRepo;
import com.xworkz.market.repository.MarketRepoImpl;

public class MarketServiceImpl implements MarketService {

	MarketRepo repository=new MarketRepoImpl();
	@Override
	public boolean updateByName(MarketDto dto, String name) {
		MarketRepo repository=new MarketRepoImpl();
		boolean updates=repository.update(null, name);
		if(updates) {
			System.out.println("not updated");
		}else {
			System.out.println("updated succesfully");
		}
		return false;
	}
	@Override
	public boolean updateByPrice(MarketDto dto, int price) {
		repository.updateByPrice(null, price);
		return false;
	}
	@Override
	public boolean updateById(MarketDto dto, String location) {
		repository.updateById(null, location);
		return false;
	}
	@Override
	public boolean updateLocationByPriceAndName(MarketDto dto, long contactNumber) {
		repository.updateLocationByNameAndPrice(null, contactNumber);
		return false;
	}

}
