package client;

import crudoperation.entities.Student;
import crudoperation.services.StudentServiceImpL;

public class Client {


	public static void main(String[] args) {

		StudentServiceImpL ss=new StudentServiceImpL();
		

//// create operation of CRUD ..........................................
		// row 1
//		Student student=new Student();
//		student.setStudentName("Ansari");
//		student.setStudentMarks(50);
//		ss.addStudent(student);
//		
//		
//		// row 2
//		Student student1=new Student();
//		student1.setStudentName("khan");
//		student1.setStudentMarks(100);
//		ss.addStudent(student1);
//		
//		
//		// row 3
//		Student student2=new Student();
//		student2.setStudentName("Sayyed");
//		student2.setStudentMarks(150);
//		ss.addStudent(student2);
		
//		System.out.println("row inserted");

		
		
		
//// retrieve operation of CRUD..................................
		
	Student studentc=ss.findStudentById(3);				//we passed perticular ID for fetching data from database
	
	System.out.println("student_id="+studentc.getStudentId());
	System.out.println("student_name="+studentc.getStudentName());
	System.out.println(studentc);
		
	
	
		
		
////update operation of CRUD...............................................

//	student=ss.findStudentById(3);					////we passed perticular ID for update data into database
//	
//	student.setStudentName("taufique");
//	student.setStudentMarks(100);
//	
//	ss.updateStudent(student);
//	
//	System.out.println("row updated");
//	System.out.println(student);

	
		
		
		
//// delete operation of CRUD...............................................
	
//	student=ss.findStudentById(2);					////we passed perticular ID for update data into database
//
//	ss.removeStudent(student);
//	
//	System.out.println("row deleted");
//	System.out.println(student);
//
		
	}

}
