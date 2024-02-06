package com.xworkz.states.runner;

import com.xworkz.states.dto.StatesDto;
import com.xworkz.states.service.StatesService;
import com.xworkz.states.service.StatesServiceImpl;

public class StatesRunner {
	
	public static void main(String[] args) {
		
		System.out.println("this is runner");
		StatesDto dto=new StatesDto();
		dto.setState_name("karnataka");
		dto.setState_noofdistrict(31);
		dto.setState_nooftaluks(240);
		dto.setState_population(6.78);
		dto.setState_tardition("yakshagana");
		dto.setState_capital("bengaluru");
		dto.setState_cmname("siddarmaya");
		dto.setState_famousplace("aihole");
		dto.setState_specialfood("mysorepak");
		
		StatesService service=new StatesServiceImpl();
		service.save(dto);
	}

}
