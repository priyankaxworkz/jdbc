package com.xworkz.pencil.service;

import com.xworkz.pencil.dto.PencilDto;
import com.xworkz.pencil.repository.PencilRepo;
import com.xworkz.pencil.repository.PencilRepoImpl;

public class PencilServiceImpl implements PencilService{

	@Override
	public boolean save(PencilDto dto) {
		System.out.println("this is service");
		
		PencilRepo repo=new PencilRepoImpl();
		boolean saved=repo.save(dto);
		
		System.out.println("the data saved in service:"+saved);
		return true;
	}

}
