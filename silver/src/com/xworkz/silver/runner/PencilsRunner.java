package com.xworkz.silver.runner;

import com.xworkz.pencil.constant.ConnectionData;
import com.xworkz.pencil.dto.PencilDto;
import com.xworkz.pencil.service.PencilService;
import com.xworkz.pencil.service.PencilServiceImpl;


public class PencilsRunner {

	public static void main(String[] args) {
		
		ConnectionData.URL.setData("jdbc:mysql://localhost:3306/pencil");
		ConnectionData.USERNAME.setData("root");
		ConnectionData.PASSWORD.setData("root");
		
		PencilDto dto=new PencilDto("natraja",5,"red");
		
		PencilService service=new PencilServiceImpl();
		service.save(dto);
	}
}
