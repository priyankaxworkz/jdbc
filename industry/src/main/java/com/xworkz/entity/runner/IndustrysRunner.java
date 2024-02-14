package com.xworkz.entity.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.entity.IndustryEntity;

public class IndustrysRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			IndustryEntity entity=new IndustryEntity();
			entity.setIndustryId(1);
			entity.setIndustryName("Food processing");
			entity.setLocation("Canada");
			entity.setEmailId("subhodikumar10@gamil.com");
			entity.setNoOfEmployees(193000);
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
