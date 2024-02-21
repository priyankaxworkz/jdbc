package com.xworkz.birds.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.birds.entity.BirdsEntity;

public class BirdsRunners {

	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
		Query query=entityManager.createNamedQuery("updateBylocation");
		query.setParameter("location","america");
		query.setParameter("color","brown");
		
	Object object=query.getSingleResult();
	BirdsEntity entity=(BirdsEntity)object;
	entityTransaction.commit();
	System.out.println(entity);
	
	
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
			
			System.out.println("close th connection");
		}
	}
}
