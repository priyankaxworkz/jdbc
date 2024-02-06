package com.xworkz.states.service;

import com.xworkz.states.dto.StatesDto;
import com.xworkz.states.repository.StatesRepo;
import com.xworkz.states.repository.StatesRepoImpl;

public class StatesServiceImpl implements StatesService {

	@Override
	public boolean save(StatesDto dto) {
		System.out.println("this is service");
		
		StatesRepo repo=new StatesRepoImpl();
		boolean saved=repo.save(dto);
		System.out.println("the dats is saved in service:"+saved);
		return true;
	}

}
