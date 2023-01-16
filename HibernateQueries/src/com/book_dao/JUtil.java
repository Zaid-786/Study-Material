package com.book_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JUtil {
	
	private  static EntityManagerFactory factory;      // develop connection with database
	private  static EntityManager em;					// develop communication with database
	
	static
	{
		factory=Persistence.createEntityManagerFactory("JPA-PU");
	}

	
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
	}
	
	
}
