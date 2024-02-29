package com.xworkz.shops.runner;

import com.xworkz.shops.service.ShopsService;
import com.xworkz.shops.service.ShopsServiceImpl;

public class ShopsRunner {

	public static void main(String[] args) {
		
		ShopsService service=new ShopsServiceImpl();
		//service.read();
		//service.readByName();
		//service.readNameByLocation();
		service.readpriceandNameById();
		
		ShopsService services=new ShopsServiceImpl();
		services.findpriceByContactNumber();
		
		ShopsService service1=new ShopsServiceImpl();
		service1.findLocationAndNumberByPrice();
		
		ShopsService service2=new ShopsServiceImpl();
		service2.findMaxPrice();
		
		ShopsService service3=new ShopsServiceImpl();
		service3.findCountContactNumber();
	}
}
