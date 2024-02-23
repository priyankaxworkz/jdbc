package com.xworkz.shop.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class ReadListRunner {

	public static void main(String[] args) {
		
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		
		try {
			entityTransaction.begin();
			
		Query query=entityManager.createNamedQuery("findSizeByPrice");
		query.setParameter("price", 3000);
		List<Character> size=query.getResultList();
		entityTransaction.commit();
		System.out.println("name is:"+size);
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
		}
	}
}
