package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.directors.dto.DirectorsDto;

public class DirectorsRunner {

	public static void main(String[] args) {
		
		DirectorsDto dtos=new DirectorsDto();
		dtos.setDirectorName("neel");
		dtos.setMovieName("kgf");
		dtos.setNoOfMovies(5);
		dtos.setAge(35);
		
		String query="insert into directors_table(directors_name,movie_name,noof_movie,age)"
				+ "values(?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/directors_db",
				"root","root");
				PreparedStatement preparestatement=connection.prepareStatement(query)){
			
			preparestatement.setString(1,dtos.getDirectorName());
			preparestatement.setString(2,dtos.getMovieName());
			preparestatement.setInt(3,dtos.getNoOfMovies());
			preparestatement.setInt(4,dtos.getAge());
			
			preparestatement.executeUpdate();
			System.out.println("inserted");
		}
				catch(SQLException exception) {
					exception.printStackTrace();
				}
	}
}
