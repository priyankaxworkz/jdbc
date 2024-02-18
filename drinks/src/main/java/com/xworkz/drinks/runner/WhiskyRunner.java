package com.xworkz.drinks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class WhiskyRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			DrinksEntity entity=entityManager.find(DrinksEntity.class, 2);
			entityManager.remove(entity);
			entityTransaction.commit();
		}
		
		catch(PersistenceException exception) {
       if(entityTransaction.isActive()) {
    	   entityTransaction.rollback();
    	   System.out.println("not connected");
       }
		}
		
		finally {
			entityManager.close();
			entityManagerFactory.close();
			
			System.out.println("close the connection");
		}
	}
}
