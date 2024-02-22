package com.xworkz.ipl.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.ipl.entity.IplEntity;

public class IplRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
		Query query=entityManager.createNamedQuery("findByName");
		query.setParameter("teamName", "RCB");
		
		Object object=query.getSingleResult();
		IplEntity entity=(IplEntity)object;
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
			System.out.println("close the connection");
		}
		
	}
}
