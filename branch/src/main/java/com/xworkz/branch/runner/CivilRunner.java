package com.xworkz.branch.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.branch.entity.BranchEntity;

public class CivilRunner {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
		Query query=entityManager.createNamedQuery("findbranchNameById");
		
		query.setParameter("id",5);
		
		Object object=query.getSingleResult();
		
		String name=(String) object;
		entityTransaction.commit();
		System.out.println(name);
		}
		
		catch(PersistenceException exceptiion) {
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
