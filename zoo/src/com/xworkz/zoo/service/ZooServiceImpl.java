package com.xworkz.zoo.service;

import com.xworkz.zoo.dto.ZooDto;
import com.xworkz.zoo.repository.ZooRepoImpl;
import com.xworkz.zoo.repository.ZooRepository;

public class ZooServiceImpl implements ZooService{

	@Override
	public boolean save(ZooDto dto) {
		System.out.println("this is service");
	ZooRepository repo=new ZooRepoImpl();
	
	boolean saved=repo.save(dto);
	System.out.println("the data stored:"+saved);
		return true;
	}

}
