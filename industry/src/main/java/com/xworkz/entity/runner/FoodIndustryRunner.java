package com.xworkz.entity.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.entity.IndustryEntity;

public class FoodIndustryRunner {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			IndustryEntity entity=new IndustryEntity();
			entity.setIndustryId(2);
			entity.setIndustryName("Reliance Industry");
			entity.setLocation("mumbai");
			entity.setEmailId("info@rll.com");
			entity.setNoOfEmployees(81092);
			
			entityManager.persist(entity);
			entityTransaction.commit();
		}
		
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			
			System.out.println("not connected:"+exception);
			}
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
			
			System.out.println("connection is closed");
		}
	}
}
