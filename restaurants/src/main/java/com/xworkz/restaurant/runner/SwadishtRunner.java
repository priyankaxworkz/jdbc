package com.xworkz.restaurant.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.restaurant.entity.RestaurantEntity;

public class SwadishtRunner {

public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	System.out.println("connected");
	
	try {
		entityTransaction.begin();
		RestaurantEntity entity=new RestaurantEntity();
		
		entity.setId(3);
		entity.setName("tcf");
		entity.setLocation("Udupi");
		entity.setNoOfChief(15);
		entity.setVaritiesOfFood(50);
		
		entityManager.persist(entity);
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
		System.out.println("connection is closed");
	}
}
}
