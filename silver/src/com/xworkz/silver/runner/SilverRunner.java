package com.xworkz.silver.runner;

import com.xworkz.zoo.constant.ConnectionData;
import com.xworkz.zoo.dto.ZooDto;
import com.xworkz.zoo.service.ZooService;
import com.xworkz.zoo.service.ZooServiceImpl;

public class SilverRunner {

	public static void main(String[] args) {
		ConnectionData.URL.setValue("jdbc:mysql://localhost:3306/zoo");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("root");
		
		ZooDto dto=new ZooDto("xxx","banglore",11.00);
		
		ZooService service=new ZooServiceImpl();
		service.save(dto);
		
	}
}
