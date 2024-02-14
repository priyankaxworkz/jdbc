package com.xworkz.airfort.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.airfort.entity.AirfortEntity;

public class IndiraGandhiAirfortRunner {
		
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			
			EntityTransaction entityTransaction=entityManager.getTransaction();
			
			System.out.println("connected");
			
			try {
				entityTransaction.begin();
				AirfortEntity entity=new AirfortEntity();
				
				entity.setAirfortId(2);
				entity.setAirfortName("Swami Vivekanda Airfort");
				entity.setLocation("Raipur");
				entity.setNoOfStaffs(200);
				entity.setMangerName("Payal Sahu");
				
				entityManager.persist(entity);
				entityTransaction.commit();
			}
			
			catch(PersistenceException exception) {
				if(entityTransaction.isActive()) {
					entityTransaction.rollback();
					
					System.out.println("it is not connected");
				}
			}
			finally {
				entityManager.close();
				entityManagerFactory.close();
				
				System.out.println("connection is closed");
			}
		}
	}

