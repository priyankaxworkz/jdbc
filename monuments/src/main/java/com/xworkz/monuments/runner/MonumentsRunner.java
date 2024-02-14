package com.xworkz.monuments.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.monuments.entity.MonumentEntity;

public class MonumentsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactroy.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			MonumentEntity entity=new MonumentEntity();
			entity.setId(1);
			entity.setName("Kanherl Fort");
			entity.setFounder("Buddhist monks");
			entity.setHeight(1550);
			entity.setLocation("mumbai");
			entity.setArealocated(20000);
			entity.setState("mahrastar");
			
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
			
			System.out.println("connection is closed");
		}
	}
}
