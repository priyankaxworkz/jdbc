package com.xworkz.market.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.market.entity.MarketEntity;

public class MarketRepoImpl implements MarketRepo {

	@Override
	public boolean update(MarketEntity entity, String name) {
	
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updateByName");
			query.setParameter("name",name);
			query.setParameter("location","England");
			query.executeUpdate();
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
			System.out.println("close the connection");
		}
		return false;
	}

	@Override
	public boolean updateByPrice(MarketEntity entity, int price) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("updateByPrice");
			query.setParameter("price",price);
			query.setParameter("name","anfalSuperMarket");
			query.executeUpdate();
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
			System.out.println("close the connection");
		}
		return false;
	}

	@Override
	public boolean updateById(MarketEntity entity,String location) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updateById");
			query.setParameter("location",location);
			query.setParameter("id", 4);
			query.executeUpdate();
			
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
		System.out.println("close the connection");
	}
		return false;
	}

	@Override
	public boolean updateLocationByNameAndPrice(MarketEntity entity, long contactNumber) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("updatecontactumberByPriceAndName");
			query.setParameter("contactumber",contactNumber);
			query.setParameter("price",20000);
			query.setParameter("name","USA");
			query.executeUpdate();
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
			System.out.println("close the connection");
		}
		return false;
	}

}
