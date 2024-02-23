package com.xworkz.shop.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class CropsRunner {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	System.out.println("connected");
	
	try {
		entityTransaction.begin();
		
	Query query=entityManager.createNamedQuery("findsizeandPriceById");
	query.setParameter("id",8);
	Object[] object=(Object[]) query.getSingleResult();
	char size=(Character) object[0];
	int price=(Integer) object[1];
    entityTransaction.commit();
		System.out.println("name is:"+size+"===="+"quality is:"+price);
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
