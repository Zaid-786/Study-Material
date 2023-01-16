
package com.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crudoperation.entities.Student;
import com.crudoperation.service.AdminService;
import com.crudoperation.service.AdminServiceImpl;
import com.crudoperation.service.CertificateService;
import com.crudoperation.service.CertificateServiceImpl;
import com.crudoperation.service.CollegeService;
import com.crudoperation.service.CollegeServiceImpl;
import com.crudoperation.service.PlacementService;
import com.crudoperation.service.PlacementServiceImpl;
import com.crudoperation.service.StudentService;
import com.crudoperation.service.StudentServiceImpl;
import com.crudoperation.service.UserService;
import com.crudoperation.service.UserServiceImpl;



public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		StudentService ss = new StudentServiceImpl();
		AdminService as = new AdminServiceImpl();
		CollegeService cs = new CollegeServiceImpl();
		UserService us = new UserServiceImpl();
		CertificateService Cs = new CertificateServiceImpl();
		PlacementService ps = new PlacementServiceImpl();

//// FOR STUDENT..............................................................
//		
//Student Row1
//		Student s1=new Student();
//		s1.setName("Abhishek");
//		s1.setRoll(10);
//		s1.setQualification("MSC");
//		s1.setCourse("Webdevelopment");
//		s1.setYear(2021);
//		s1.setHallTicketNo(101010);
//
////Student Row2
//			Student s2=new Student();
//			s2.setName("Chetan");
//			s2.setRoll(20);
//			s2.setQualification("B.E mech");
//			s2.setCourse("A.I development");
//			s2.setYear(2021);
//			s2.setHallTicketNo(202020);
//			
////Student Row3
		Student s3 = new Student();
		s3.setName("Roshan ");
		s3.setRoll(30);
		s3.setQualification("B.E elect");
		s3.setCourse("Cloud Computing");
		s3.setYear(2021);
		s3.setHallTicketNo(303030);
//			
//		
//		
////________________ CRUD Create operation _____________________________//
//				
//		
//		Student s4=new Student();
//		s4.setName("Naha");
//		s4.setRoll(50);
//		s4.setQualification("B.E comp");
//		s4.setCourse("MSCit");
//		s4.setYear(2021);
//		s4.setHallTicketNo(505050);
//		
//		Certificate c4=new Certificate();
//		c4.setCertificate_ID(400400);
//		c4.setPassing_year(2021);
//		
//		s4.setStudentCertificate(c4);
//		ss.addStudent(s4);
//		
//		System.out.println("Row inserted");
//////		

////________________ CRUD Retrieve operation _____________________________//
//
//		Student stud=ss.findStudentById(1);
//		System.out.println("Id="+stud.getId());
//	    System.out.println("name="+stud.getName());
//	    System.out.println(stud);
//
//	    System.out.println("Row Retrieve");
//
////_________________ CRUD Update operation ____________________________//
//	 		Student stud=ss.findStudentById(3);
//	 		stud.setName("Ansari");
//	 		ss.updateStudent(stud);
//	 		
//	 		System.out.println(stud);
//	 	    System.out.println("Row Updated");
////
////_________________ CRUD Remove operation __________________________//
//
//         Student stud=ss.findStudentById(4);
//         System.out.println(stud);
//         ss.removeStudent(stud);      
//         System.out.println("Row Deleted");	    
////	    
//	 
//	    
//	    
////// FOR CERTIFICATE..............................................................
////
////Certificate Row1
//			Certificate c1=new Certificate();
//			c1.setCertificate_ID(100100);
//			c1.setPassing_year(2022);
//			
//			
////Certificate Row2
//			Certificate c2=new Certificate();
//			c2.setCertificate_ID(200200);
//			c2.setPassing_year(2022);
//			
//
////Certificate Row3
//			Certificate c3=new Certificate();
//			c3.setCertificate_ID(300300);
//			c3.setPassing_year(2022);
//
//
////		Retrieve Operation..............
////		Certificate certi=Cs.findByCertificateId(100100);
////		System.out.println("certificate_id ="+certi.getCertificate_ID());
////		System.out.println("certificate_year ="+certi.getPassing_year());
////		System.out.println(certi);
//// 
////		System.out.println("data row retrieve...");
//	
////			
////			
////// FOR COLLEGE..............................................................
////
////College Row1
//		College g1=new College();
//		g1.setCollegeId(5010);
//		g1.setCollegeName("Jamia Islamia College");
//		g1.setLocation("Dehli");
//		
//
////College Row2
//		College g2=new College();
//		g2.setCollegeId(5020);
//		g2.setCollegeName("Xavier College");
//		g2.setLocation("Mumbai");
//				
//
////College Row3
//		College g3=new College();
//		g3.setCollegeId(5030);
//		g3.setCollegeName("Naga Arjun College");
//		g3.setLocation("Banglore");
////						
////		
////		
////		
////		
//// FOR USER..............................................................
//
////User Row1
//		User u1=new User();
//		u1.setUserId(9010);
//		u1.setUserName("Abhi");
//		u1.setUserType("student");
//		u1.setUserPassword("Abhi@123");
//	
////User Row2
//		User u2=new User();
//		u2.setUserId(9020);
//		u2.setUserName("chiko");
//		u2.setUserType("Teacher");
//		u2.setUserPassword("chiko@123");
//				
//		
////User Row3
//		User u3=new User();
//		u3.setUserId(9030);
//		u3.setUserName("ronak");
//		u3.setUserType("student");
//		u3.setUserPassword("ronak@123");
//				
//		
//		
//		
//// FOR ADMIN..............................................................
//
//// Admin Row1 
//		Admin a1=new Admin();
//		a1.setAdminId(8010);
//		a1.setAdminName("manshi");
//		a1.setAdminPassword("manshi@123");
//		
//		em.persist(a1);
//		
//		
//// Admin Row2
//		Admin a2=new Admin();
//		a2.setAdminId(8020);
//		a2.setAdminName("Vikas");
//		a2.setAdminPassword("vikas@123");
//		
//		em.persist(a2);
//
//// Admin Row3 
//		Admin a3=new Admin();
//		a3.setAdminId(8030);
//		a3.setAdminName("Omkar");
//		a3.setAdminPassword("omkar@123");
//
//		em.persist(a3);
//
////		
//// FOR PLACEMENT..............................................................
//
//// Placement Row1
//		LocalDate date1= LocalDate.of(2022, 6, 4);
//		Placement p1=new Placement();
//		p1.setPlacementId(7010);
//		p1.setName("java hiring");
//		p1.setQualification("Graduation");
//		p1.setYear(2022);
//		p1.setDate(date1);
//		
//		
//// Placement Row2
//		LocalDate data2= LocalDate.of(2022, 6, 10);
//		Placement p2=new Placement();
//		p2.setPlacementId(7020);
//		p2.setName("Python hiring");
//		p2.setQualification("Graduation");
//		p2.setYear(2022);
//		p2.setDate(data2);
//				
//// Placement Row3
//		LocalDate data3= LocalDate.of(2022, 6, 30);
//		Placement p3=new Placement();
//		p3.setPlacementId(7030);
//		p3.setName("java hiring");
//		p3.setQualification("Graduation");
//		p3.setYear(2022);
//		p3.setDate(data3);
//				
//		
//		
//	
////****************************** Association Mapping ***************************************//
//
//		s1.setStudentCertificate(c1);  // 1 : 1 mapping   Student to Certificate
//		s1.setCollege(g1);			   // M : 1  mapping   Student to College
//		em.persist(s1);
//		
//		s2.setStudentCertificate(c2);
//		s2.setCollege(g2);
//		em.persist(s2);
//		
//		s3.setStudentCertificate(c3);
//		s3.setCollege(g3);
//		em.persist(s3);
////.........................................................................................
//
//// 1 : 1 mapping   College to User
//		g1.setUserid(u1);				
//		em.persist(g1);
//		g2.setUserid(u2);
//		em.persist(g2);
//		g3.setUserid(u3);
//		em.persist(g3);
//		
//// 1 : 1 mapping   User to Admin		
//		u1.setStudentAdmin(a1);			
//		em.persist(u1);
//		u2.setStudentAdmin(a2);
//		em.persist(u2);
//		u3.setStudentAdmin(a3);
//		em.persist(u3);
//		
//
//// M : 1  mapping   Certificate to College
//		c1.setCollege(g1);				
//		em.persist(c1);
//		c2.setCollege(g2);
//		em.persist(c2);
//		c3.setCollege(g3);
//		em.persist(c3);
//		
//		
//// M : 1  mapping   Placement to College	
//		p1.setCollege(g1);
//		em.persist(p1);
//		p2.setCollege(g2);
//		em.persist(p2);
//		p3.setCollege(g3);
//		em.persist(p3);
//		
//				
//		System.out.println("Tables Created Successfully...");

		em.getTransaction().commit();
		em.close();
		factory.close();

	}

}
