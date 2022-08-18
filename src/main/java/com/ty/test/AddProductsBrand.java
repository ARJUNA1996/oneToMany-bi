package com.ty.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Brand;
import com.ty.dto.Product;

public class AddProductsBrand {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		
		
		
		Product product=new Product();
		product.setName("OVEN");
		product.setProductId("JOV53623");
		product.setWeight("500gm");
		product.setColor("RED");
		product.setCost(290000);
		
		
		
		Product product1=new Product();
		product1.setName("OVEN");
		product1.setProductId("JOV53623");
		product1.setWeight("500gm");
		product1.setColor("RED");
		product1.setCost(290000);
		
		
		
		
		
		
		Brand brand=manager.find(Brand.class, 1);
		
		if(brand!=null) {
			
		  System.out.println(brand);
		  List<Product> list= brand.getProducts();
		  list.add(product);
		  list.add(product1);
		  brand.setProducts(list);
		  
		  transaction.begin();
		  manager.persist(brand);
		  manager.persist(product);
		  manager.persist(product1);
		  transaction.commit();
		  
		  
		  
		}
		
		
	}

}
