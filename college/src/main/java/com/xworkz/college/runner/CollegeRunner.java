package com.xworkz.college.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class CollegeRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=null;
		
		try {
			entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
			System.out.println("connected");
		}
		catch(PersistenceException exception) {
			System.out.println("not connected:"+exception);
		}
		finally {
			entityManagerFactroy.close();
		}
	}
}
