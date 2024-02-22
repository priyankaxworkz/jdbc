package com.xworkz.branch.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class MechRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("findsubjectandHodNamebylabs");
			
			query.setParameter("totalLabs",3);
			
			Object[] object=(Object[]) query.getSingleResult();
			
			int subject=(Integer) object[0];
			String name=(String) object[1];
			entityTransaction.commit();
			System.out.println(subject+"===="+name);
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
