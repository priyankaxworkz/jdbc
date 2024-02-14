package com.xworkz.entity.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.entity.IndustryEntity;

public class BajaAutoLimited {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			IndustryEntity entity=new IndustryEntity();
			entity.setIndustryId(4);
			entity.setIndustryName("Baja Auto Limited");
			entity.setLocation("pune");
			entity.setEmailId("customerservice@gmail.com");
			entity.setNoOfEmployees(10000);
			
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
