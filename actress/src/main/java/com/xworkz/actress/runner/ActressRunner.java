package com.xworkz.actress.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class ActressRunner {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	System.out.println("connected");
	
	try {
		entityTransaction.begin();
		Query query=entityManager.createQuery("update ActressEntity entity set entity.contactNumber=:numberBy where entity.name=:nameby");
		
		query.setParameter("numberBy",897656434l);
		query.setParameter("nameby","Radhika");
		
		query.executeUpdate();
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
