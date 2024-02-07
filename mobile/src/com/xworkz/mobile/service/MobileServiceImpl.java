package com.xworkz.mobile.service;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.repository.MobileRepoImpl;
import com.xworkz.mobile.repository.MobileRepository;

public class MobileServiceImpl implements MobileService{

	@Override
	public boolean save(MobileDto dto) {
		System.out.println("this is service");
		
		MobileRepository repo=new MobileRepoImpl();
		boolean saved=repo.save(dto);
		System.out.println("the data saved succesfully in service:"+saved);
		return true;
	}

}
