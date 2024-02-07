package com.xworkz.pencil.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.pencil.constant.ConnectionData;
import com.xworkz.pencil.dto.PencilDto;

public class PencilRepoImpl implements PencilRepo {

	@Override
	public boolean save(PencilDto dto) {
		System.out.println("this is repo");
		
		String query="INSERT INTO pencil_table(pencil_name,pencil_price,pencil_color)VALUES(?,?,?)";
		
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getData(),
				ConnectionData.USERNAME.getData(),ConnectionData.PASSWORD.getData());
		PreparedStatement preparestatement=connection.prepareStatement(query)){
		preparestatement.setString(1,dto.getName());
		preparestatement.setInt(2,dto.getPrice());
		preparestatement.setString(3,dto.getColor());
		
		preparestatement.executeUpdate();
		System.out.println("the data is saved in repo");
	}
	
	catch(SQLException exception) {
		exception.printStackTrace();
	}
		return true;
	}

}
