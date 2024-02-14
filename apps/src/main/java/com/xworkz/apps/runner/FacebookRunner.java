package com.xworkz.apps.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.apps.entity.AppEntity;

public class FacebookRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			AppEntity entity=new AppEntity();
			entity.setAppId(3);
			entity.setAppName("whatsapp");
			entity.setCompanyName("Meta");
			entity.setStorgae("15GB");
			entity.setVersion("2.24.3.76");
			
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
			entityManagerFactory.close();
			
			System.out.println("connection is close");
		}
	}
}
