package com.xworkz.monuments.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class MonumentRunner {

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
