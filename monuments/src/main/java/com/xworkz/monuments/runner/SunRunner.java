package com.xworkz.monuments.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.monuments.entity.MonumentEntity;

public class SunRunner {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactroy.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			MonumentEntity entity=new MonumentEntity();
			entity.setId(3);
			entity.setName("Sun Temple");
			entity.setFounder("King Narasimadeva");
			entity.setHeight(225);
			entity.setLocation("konark");
			entity.setArealocated(26200);
			entity.setState("odisha");
			
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
