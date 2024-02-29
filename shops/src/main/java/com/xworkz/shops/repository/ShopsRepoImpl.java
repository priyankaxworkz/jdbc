package com.xworkz.shops.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.shops.entity.ShopsEntity;

public class ShopsRepoImpl implements ShopsRepository {

	List<ShopsEntity> read;
	@Override
	public List<ShopsEntity> read() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readAll");
			read=query.getResultList();
			entityTransaction.commit();
		}
		catch(PersistenceException exception ) {
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
		return read;
	}
	@Override
	public String readByName() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("readByName");
			query.setParameter("nameBy","Zudio");
			
			Object object=query.getSingleResult();
			ShopsEntity shopsEntity=(ShopsEntity) object;
			System.out.println(shopsEntity);
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
		}
		return null;
	}
	@Override
	public Object readPriceByLocation() {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("readnameByLocation");
			query.setParameter("location","manglore");
			
			Object object=query.getSingleResult();
			String location=(String)object;
			entityTransaction.commit();
			System.out.println(location);
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
		return null;
	}
	@Override
	public Object[] readpriceandNameById() {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("readpriceandNameById");
			query.setParameter("id", 3);
			Object[] object=(Object[])query.getSingleResult();
			int price=(Integer)object[0];
			String name=(String)object[1];
			
			entityTransaction.commit();
			System.out.println(price);
			System.out.println(name);
			
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
		return null;
	}
	@Override
	public List<Integer> findpriceByContactNumber() {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("findpriceByContactNumber");
			
			query.setParameter("contactNumber", 7896542345l);
			
			List<Integer> price=query.getResultList();
			entityTransaction.commit();
			System.out.println(price);
		}
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
				System.out.println("connected");
			}
		}
		
		finally {
			entityManager.close();
			entityManagerFactory.close();
			System.out.println("close the connection");
		}
		return null;
	}
	@Override
	public List<Object[]> findLocationAndNumberByPrice() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			Query query=entityManager.createNamedQuery("findLocationAndnumberByPrice");
			query.setParameter("price",10000);
			List<Object[]> list=query.getResultList();
			
			for(Object[] object:list) {
				String location=(String) object[0];
				long number=(Long) object[1];
				
				System.out.println("location is:"+location+"======="+"number is:"+number);
			}
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
		return null;
	}
	@Override
	public int findMaxPrice() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("maxPrice");
			int price=(Integer) query.getSingleResult();
			entityTransaction.commit();
			System.out.println(price);
			
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
		return 0;
	}
	@Override
	public long countContactNumber() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		try {
			entityTransaction.begin();
			
			Query query=entityManager.createNamedQuery("countByContact");
			long number=(Long)query.getSingleResult();
			entityTransaction.commit();
			System.out.println(number);
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
		return 0;
	}

	

}
