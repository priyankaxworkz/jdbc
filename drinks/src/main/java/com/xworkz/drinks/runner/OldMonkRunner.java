package com.xworkz.drinks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class OldMonkRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactroy.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("it is connected");
		
		try {
			entityTransaction.begin();
			
			DrinksEntity entity=new DrinksEntity();
			entity.setId(4);
			entity.setName("magicalMoment");
			entity.setDrinksPrice(250);
			entity.setBrandName("vodka");
			
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
			entityManagerFactroy.close();
			System.out.println("connection is close");
		}
	}
}
