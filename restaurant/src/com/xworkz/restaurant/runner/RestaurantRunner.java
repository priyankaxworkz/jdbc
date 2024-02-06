package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.dto.RestaurantDto;
import com.xworkz.restaurant.service.RestaurantService;
import com.xworkz.restaurant.service.RestaurantServiceImpl;

public class RestaurantRunner {

	public static void main(String[] args) {
		
		System.out.println("this is runner");
		RestaurantDto dto=new RestaurantDto();
		dto.setRestaurant_name("indraprsta");
		dto.setRestaurant_noofcheff(50);
		dto.setRestaurant_location("murdeswara");
		dto.setRestaurant_specialfood("fishcurry");
		dto.setRestaurant_managername("annanya");
		dto.setRestaurant_contactnumber(6756453423l);
		dto.setRestaurant_revivews(4.8);
		dto.setRestaurant_opentimings(10.30);
		dto.setRestaurant_closetimings(11.00);
		
		RestaurantService service=new RestaurantServiceImpl();
		service.save(dto);
	}
}
