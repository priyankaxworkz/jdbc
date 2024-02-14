package com.xworkz.college.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.college.entity.CollegeEntity;

public class CollegesRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactroy.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			CollegeEntity entity=new CollegeEntity();
			entity.setCollegeId(1);
			entity.setCollegeName("mgm");
			entity.setLocation("udupi");
			entity.setEmailId("mgm@gmail.com");
			entity.setNoOfDepartment(35);
			
			entityManager.persist(entity);
			entityTransaction.commit();
		}
		catch(PersistenceException exception) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
				System.out.println("not conncted:"+exception);
			}
		}
		finally {
			entityManager.close();
			entityManagerFactroy.close();
			
			System.out.println("connection is closed");
		}
	}
}
