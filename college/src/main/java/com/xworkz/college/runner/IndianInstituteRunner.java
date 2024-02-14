package com.xworkz.college.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.college.entity.CollegeEntity;

public class IndianInstituteRunner {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactroy=Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager entityManager=entityManagerFactroy.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		System.out.println("connected");
		
		try {
			entityTransaction.begin();
			CollegeEntity entity=new CollegeEntity();
			entity.setCollegeId(3);
			entity.setCollegeName("Indian Institute Of Technology");
			entity.setLocation("Delhi");
			entity.setEmailId("indianinstitue2@gmail.com");
			entity.setNoOfDepartment(25);
			
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
