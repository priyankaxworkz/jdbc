package com.xworkz.ipl.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class IplsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("findcolorbyambasdor");
			
			query.setParameter("ambasdorName","Katrina Kaif");
			
		Object object=query.getSingleResult();
		String ambasdor=(String)object;
		entityTransaction.commit();
		System.out.println(ambasdor);
		
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
