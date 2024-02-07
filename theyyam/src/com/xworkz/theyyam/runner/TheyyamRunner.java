package com.xworkz.theyyam.runner;

import com.xworkz.theyyam.Constants.ConnectionData;
import com.xworkz.theyyam.Dto.TheyyamDto;
import com.xworkz.theyyam.Service.TheyyamService;
import com.xworkz.theyyam.Service.TheyyamServiceImplementation;

public class TheyyamRunner {

	public static void main(String[] args) {
		
		System.out.println("this is runner");
		ConnectionData.URl.setValue("jdbc:mysql://localhost:3306/theyyam");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("root");
		
		TheyyamDto dto=new TheyyamDto();
		dto.setOrigin("Northkerala");
		dto.setCountry("india");
		dto.setTypesOfTheyyam(400);
		dto.setAnotherName("Tira");
		dto.setStartMonth("october");
		dto.setEndMonth("may");
		dto.setBelongsFamilyName("brahmin");
		dto.setOriginatedPeriods("neolthic");
		dto.setDevoteeOf("parshurama");
		
		TheyyamService service=new TheyyamServiceImplementation();
		service.save(dto);
	}
}
