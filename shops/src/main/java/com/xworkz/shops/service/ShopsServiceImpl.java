package com.xworkz.shops.service;

import java.util.List;


import com.xworkz.shops.entity.ShopsEntity;
import com.xworkz.shops.repository.ShopsRepoImpl;
import com.xworkz.shops.repository.ShopsRepository;

public class ShopsServiceImpl implements ShopsService{

	ShopsRepository repo= new ShopsRepoImpl();
	@Override
	public void read() {
		
		ShopsRepository repo= new ShopsRepoImpl();
		
		
		List<ShopsEntity> entity=repo.read();
		for(ShopsEntity shopsEntity:entity) {
			System.out.println(shopsEntity);
		}
		
	}
	@Override
	public void readByName() {
		repo.readByName();
		
	}
	
	@Override
	public void readNameByLocation() {
		repo.readPriceByLocation();
		
	}
	@Override
	public void readpriceandNameById() {
		repo.readpriceandNameById();
		
	}
	@Override
	public void findpriceByContactNumber() {
		repo.findpriceByContactNumber();
		
	}
	@Override
	public void findLocationAndNumberByPrice() {
		repo.findLocationAndNumberByPrice();
		
	}
	@Override
	public void findMaxPrice() {
		repo.findMaxPrice();
		
	}
	@Override
	public void findCountContactNumber() {
		repo.countContactNumber();
		
	}
	

}
