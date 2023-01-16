package com.inheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestSingleInheritance {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");   //developed connnection with database
		EntityManager em = factory.createEntityManager();//operation on database//create update insert delete got object for communication
		
		em.getTransaction().begin();//start communication
		
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Mansi");
		e1.setEmpSalary(10000);
		em.persist(e1);				//started to doing operation like (create , update and insert etc) ;
		
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("zain");
		e2.setEmpSalary(20000);
		em.persist(e2);
		
		
		Manager m = new Manager();
		m.setEmpId(3);
		m.setEmpName("Vikas");
		m.setEmpSalary(30000);
		m.setDepartmentName("Training");
		em.persist(m);
		
		
		em.getTransaction().commit();//end of communication
		System.out.println("Rows Inserted");
		
		em.close();//communication
		factory.close();//connection
		
	}
}
