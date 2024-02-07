package com.xworkz.cricket.runner;

import com.xworkz.cricketer.Constants.ConnectionData;
import com.xworkz.cricketer.Dto.CricketerDto;
import com.xworkz.cricketer.Service.CricketerService;
import com.xworkz.cricketer.Service.CricketerServiceImplementation;

public class CricketRunner {

	public static void main(String[] args) {
		ConnectionData.URl.setValue("jdbc:mysql://localhost:3306/cricketer");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("root");
		
		CricketerDto dto=new CricketerDto();
		dto.setNationality("indian");
		dto.setName("viratKohli");
		dto.setNiceName("goat");
		dto.setAge(35);
		dto.setBirthPlace("delhi");
		dto.setDop(null);
		dto.setWifeName("anushkaSharma");
		dto.setJercyName(18);
		dto.setRole("batsman");
		
		CricketerService service=new CricketerServiceImplementation();
		service.save(dto);
	}
}
