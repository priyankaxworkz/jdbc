package com.xworkz.wallet.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class PumaRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
		Query query=entityManager.createNamedQuery("findnameandpriceByid");
		query.setParameter("id",3);
		
		Object[] object=(Object[]) query.getSingleResult();
		String name=(String)object[0];
		int price=(Integer) object[1];
		entityTransaction.commit();
		
		System.out.println(name+"====="+price);
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
