package com.xworkz.crocks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.crocks.entity.CrocksEntity;

public class CrocksRunners {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
		Query query=entityManager.createNamedQuery("updatebyName");
		query.setParameter("name","kocks");
		query.setParameter("color","black");
		Object obj=query.getSingleResult();
		CrocksEntity entity=(CrocksEntity)obj;
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
			System.out.println("connection is close");
		}
	}

}
