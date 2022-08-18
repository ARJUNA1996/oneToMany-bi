package com.ty.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Mobile;
import com.ty.dto.Sim;

public class SaveMobile {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		
		Mobile mobile=new Mobile();
		mobile.setName("SONY");
		mobile.setCost(56232);
		
		
		Sim sim=new Sim();
		sim.setName("Airtel");
		sim.setImrc(123);
		sim.setMobile(mobile);
		
		Sim sim2=new Sim();
		sim2.setName("TATA DOCOMO");
		sim2.setImrc(5623);
		sim2.setMobile(mobile);
		
		Sim sim3=new Sim();
		sim3.setName("IDEA");
		sim3.setImrc(5623);
		
		sim3.setMobile(mobile);
		
		
		transaction.begin();
		manager.persist(mobile);
		manager.persist(sim);
		manager.persist(sim2);
		manager.persist(sim3);
		transaction.commit();
		
		
		
		
	}

}
