package com.xworkz.restaurant.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.restaurant.constants.ConnectionData;
import com.xworkz.restaurant.dto.RestaurantDto;

public class RestaurantRepoImpl implements RestaurantRepo {

	@Override
	public boolean save(RestaurantDto dto) {
		System.out.println("this is repo");
		String query="INSERT INTO restaurant_details(restaurant_name,restaurant_noofcheff,restaurant_location,restaurant_specialfood,"
				+ "restaurant_managername,restaurant_contactnumber,restaurant_revivews,restaurant_opentimings,restaurant_closetimings)VALUES(?,?,?,?,?,?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			
			preparestatement.setString(1,dto.getRestaurant_name());
			preparestatement.setInt(2,dto.getRestaurant_noofcheff());
			preparestatement.setString(3,dto.getRestaurant_location());
			preparestatement.setString(4,dto.getRestaurant_specialfood());
			preparestatement.setString(5,dto.getRestaurant_managername());
			preparestatement.setLong(6,dto.getRestaurant_contactnumber());
			preparestatement.setDouble(7,dto.getRestaurant_revivews());
			preparestatement.setDouble(8,dto.getRestaurant_opentimings());
			preparestatement.setDouble(9,dto.getRestaurant_closetimings());
			
			preparestatement.executeUpdate();
			System.out.println("this is data store in the repo");
			
		}
		catch(SQLException exception) {
			exception.printStackTrace();
		}
		return true;
	}

}
