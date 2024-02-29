package com.xworkz.market.runner;

import com.xworkz.market.dto.MarketDto;
import com.xworkz.market.service.MarketService;
import com.xworkz.market.service.MarketServiceImpl;

public class MarketRunner {

	public static void main(String[] args) {
		
		MarketDto dto=new MarketDto();
		MarketService service=new MarketServiceImpl();
		service.updateByName(dto,"zumba");
		
		service.updateByPrice(dto,4000);
		
		service.updateById(dto,"karwar");
		
		service.updateLocationByPriceAndName(dto,5678987651l);
	}
}
