package com.xworkz.wallet.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.wallet.entity.WalletEntity;

public class WalletRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		
		try {
			entityTransaction.begin();
			
		Query query=entityManager.createNamedQuery("findByPrice");
		
		query.setParameter("price",10000);
		
		Object object=query.getSingleResult();
		
		WalletEntity entity=(WalletEntity) object;
		
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
