package com.xworkz.apps.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.apps.entity.AppEntity;

public class AppsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManger=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManger.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			AppEntity entity=new AppEntity();
			entity.setAppId(1);
			entity.setAppName("playstore");
			entity.setVersion("39.6.25APK");
			entity.setCompanyName("Google Play");
			entity.setStorgae("25gb");
			
			entityManger.persist(entity);
			entityTransaction.commit();
			}
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
				System.out.println("it is not connected");
			}
		}
		finally {
			entityManger.close();
			entityManagerFactory.close();
		}
	}
}
