package com.xworkz.restaurant.repository;

import com.xworkz.restaurant.dto.RestaurantDto;

public interface RestaurantRepo {

	boolean save(RestaurantDto dto);
}
