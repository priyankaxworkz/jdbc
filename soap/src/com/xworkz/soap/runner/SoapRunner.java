package com.xworkz.soap.runner;

import com.xworkz.soap.Constants.ConnectionData;
import com.xworkz.soap.Dto.SoapDto;
import com.xworkz.soap.Service.SoapService;
import com.xworkz.soap.Service.SoapServiceImplementation;

public class SoapRunner {

	public static void main(String[] args) {
		
		ConnectionData.URl.setValue("jdbc:mysql://localhost:3306/soap");
		ConnectionData.USERNAME.setValue("root");
		ConnectionData.PASSWORD.setValue("root");
		
		SoapDto dto=new SoapDto();
		dto.setName("santhor");
		dto.setCompanyName("wipro consumer care");
		dto.setPrice(25);
		dto.setHeadQuater("mubai");
		dto.setOwner("K.Chabbra");
		dto.setFoundedDate("4th century");
		dto.setWebsite("www.santhoor");
		dto.setColor("orange");
		dto.setFlavour("sandal");
		
		SoapService service=new SoapServiceImplementation();
		service.save(dto);
		
	}
}
