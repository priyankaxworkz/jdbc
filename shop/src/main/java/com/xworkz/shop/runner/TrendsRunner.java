package com.xworkz.shop.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.shop.entity.ShopEntity;

public class TrendsRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connceted");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("findByContactNumber");
			query.setParameter("contactNumber",9876543212l);
			
		Object object=query.getSingleResult();
		ShopEntity entity=(ShopEntity) object;
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
