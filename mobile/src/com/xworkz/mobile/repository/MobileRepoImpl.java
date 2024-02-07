package com.xworkz.mobile.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mobile.constant.ConnectionData;
import com.xworkz.mobile.dto.MobileDto;

public class MobileRepoImpl implements MobileRepository {

	@Override
	public boolean save(MobileDto mobileDto) {
		System.out.println("this is repo");
		
		String query="INSERT INTO mobile_table(mobile_companyname,mobile_price,mobile_model)VALUES(?,?,?)";
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			preparestatement.setString(1,mobileDto.getCompanyName());
			preparestatement.setInt(2,mobileDto.getPrice());
			preparestatement.setString(3,mobileDto.getModel());
			
			preparestatement.executeUpdate();
			System.out.println("this is data saved in repo");
			
		}
		
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		return true;
	}

}
