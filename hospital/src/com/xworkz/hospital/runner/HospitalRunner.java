package com.xworkz.hospital.runner;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.HospitalServiceImpl;

public class HospitalRunner {

	public static void main(String[] args) {
		
		System.out.println("this is runner");
		HospitalDto dto=new HospitalDto();
		
		dto.setHospital_name("chinmaya");
		dto.setHospital_location("kudapura");
		dto.setHospital_noofdoctors(100);
		dto.setHospital_noofstaff(250);
		dto.setHospital_contactnumber(6787654534l);
		dto.setHospital_emailid("chinamaya@gmail.com");
		dto.setHospital_timeing(10);
		dto.setHospital_noofwards(100);
		dto.setHospital_noofbranches(10);
		
		HospitalService service=new HospitalServiceImpl();
		service.save(dto);
	}
}
