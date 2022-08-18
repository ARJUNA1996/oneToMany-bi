package com.ty.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class SaveProductBrand {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		Brand brand=new Brand();
		brand.setBrand("LG");
		
		Product product=new Product();
		product.setName("MOBILE");
		product.setProductId("JDH53623");
		product.setWeight("180gm");
		product.setColor("WHITE");
		product.setCost(19999);
		product.setBrand(brand);
		
		
	
		Product product1=new Product();
		product1.setName("FREDGE");
		product1.setProductId("JDH53623");
		product1.setWeight("70KGS");
		product1.setColor("WHITE");
		product1.setCost(15000);
		product1.setBrand(brand);
		
		Product product2=new Product();
		product2.setName("LAPTOP");
		product2.setProductId("JDLP3623");
		product2.setWeight("2.3kg");
		product2.setColor("BLACK");
		product2.setCost(59999);
		product2.setBrand(brand);
		
		transaction.begin();
		manager.persist(brand);
		manager.persist(product);
		manager.persist(product1);
		manager.persist(product2);
		transaction.commit();
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
