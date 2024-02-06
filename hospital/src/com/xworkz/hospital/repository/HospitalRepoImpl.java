package com.xworkz.hospital.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.hospital.constant.ConnectionData;
import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRepoImpl implements HospitalRepo {

	@Override
	public boolean save(HospitalDto dto) {
		System.out.println("this is repo ");
		String querry="insert into hospital_details(hospital_name,hospital_location,hospital_noofdoctors,hospital_noofstaff,"
				+ "hospital_contactnumber,hospital_emailid,hospital_timeing,hospital_noofwards,hospital_noofbranches)values(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(querry)){
			preparestatement.setString(1,dto.getHospital_name());
			preparestatement.setString(2,dto.getHospital_location());
			preparestatement.setInt(3,dto.getHospital_noofdoctors());
			preparestatement.setInt(4,dto.getHospital_noofstaff());
			preparestatement.setLong(5,dto.getHospital_contactnumber());
			preparestatement.setString(6, dto.getHospital_emailid());
			preparestatement.setInt(7,dto.getHospital_timeing());
			preparestatement.setInt(8,dto.getHospital_noofwards());
			preparestatement.setInt(9,dto.getHospital_noofbranches());
			
			preparestatement.executeUpdate();
			System.out.println("dto is saved in repo");
		}
		
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		return true;
	}

}
