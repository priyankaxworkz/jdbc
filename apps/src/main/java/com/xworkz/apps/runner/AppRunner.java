package com.xworkz.apps.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class AppRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=null;
		
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			System.out.println("connected");
		}
		catch(PersistenceException exception) {
			System.out.println("not connected:"+exception);
		}
		finally {
			entityManagerFactory.close();
		}
	}
}
