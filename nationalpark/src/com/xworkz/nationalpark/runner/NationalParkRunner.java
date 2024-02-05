package com.xworkz.nationalpark.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.nationalpark.constant.ConnectionData;

public class NationalParkRunner {

	public static void main(String[] args) {
		
		String query="insert into park_details(park_name,park_location,park_noofspecies,park_landmass,park_head,park_establishment)values(?,?,?,?,?,?)";
	try(Connection connection=DriverManager.getConnection(ConnectionData.URL.getValue(),
				ConnectionData.USERNAME.getValue(),ConnectionData.PASSWORD.getValue());
			PreparedStatement preparedstatement=connection.prepareStatement(query)){
		
		preparedstatement.setString(1,"corbettnationalpark");
		preparedstatement.setString(2,"uttarkanda");
		preparedstatement.setInt(3, 617);
		preparedstatement.setInt(4,1318);
		preparedstatement.setString(5,"nareshkumar");
		preparedstatement.setInt(6,1936);
		
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"ranthambore");
		preparedstatement.setString(2,"rajastan");
		preparedstatement.setInt(3,760);
		preparedstatement.setInt(4,1334);
		preparedstatement.setString(5,"seduramyadav");
		preparedstatement.setInt(6,1980);
		preparedstatement.executeBatch();
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"satpur");
		preparedstatement.setString(2,"madya pradesh");
		preparedstatement.setInt(3,250);
		preparedstatement.setInt(4,440);
		preparedstatement.setString(5,"krishnamurthy");
		preparedstatement.setInt(6,1981);
		preparedstatement.executeBatch();
		
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"pench");
		preparedstatement.setString(2,"madyapradesh");
		preparedstatement.setInt(3,100);
		preparedstatement.setInt(4,292);
		preparedstatement.setString(5,"sfd");
		preparedstatement.setInt(6,1975);
		preparedstatement.executeBatch();
	
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"rajaji");
		preparedstatement.setString(2,"uttarkanda");
		preparedstatement.setInt(3,300);
		preparedstatement.setInt(4,820);
		preparedstatement.setString(5,"sujana");
		preparedstatement.setInt(6,1983);
		preparedstatement.executeBatch();
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"periyar");
		preparedstatement.setString(2,"kerala");
		preparedstatement.setInt(3,100);
		preparedstatement.setInt(4,305);
		preparedstatement.setString(5,"sfd");
		preparedstatement.setInt(6,1982);
		preparedstatement.executeBatch();
		
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"bandipur");
		preparedstatement.setString(2,"karnataka");
		preparedstatement.setInt(3,200);
		preparedstatement.setInt(4,868);
		preparedstatement.setString(5,"sprabhakaran");
		preparedstatement.setInt(6,1973);
		preparedstatement.executeBatch();
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"kazaringa");
		preparedstatement.setString(2,"assam");
		preparedstatement.setInt(3,350);
		preparedstatement.setInt(4,400);
		preparedstatement.setString(5,"sanilgosh");
		preparedstatement.setInt(6,1974);
		preparedstatement.executeBatch();
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"kanha");
		preparedstatement.setString(2,"madyapradesh");
		preparedstatement.setInt(3,100);
		preparedstatement.setInt(4,202);
		preparedstatement.setString(5,"sksingh");
		preparedstatement.setInt(6,1955);
		preparedstatement.executeBatch();
		
		preparedstatement.addBatch();
		preparedstatement.setString(1,"sariska");
		preparedstatement.setString(2,"rajastan");
		preparedstatement.setInt(3,400);
		preparedstatement.setInt(4,302);
		preparedstatement.setString(5,"sfd");
		preparedstatement.setInt(6,1992);
		preparedstatement.executeBatch();
		preparedstatement.addBatch();
		
		preparedstatement.setString(1,"panna");
		preparedstatement.setString(2,"assam");
		preparedstatement.setInt(3,200);
		preparedstatement.setInt(4,542);
		preparedstatement.setString(5,"goi");
		preparedstatement.setInt(6,1981);
		preparedstatement.executeBatch();
		preparedstatement.executeUpdate();
		
		}
	
	catch(SQLException exception) {
		exception.printStackTrace();
	}
	}
}
