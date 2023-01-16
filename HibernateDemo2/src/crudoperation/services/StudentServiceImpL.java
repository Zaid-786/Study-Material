package crudoperation.services;

import crudoperation.dao.StudentDao;
import crudoperation.dao.StudentDaoImpL;
import crudoperation.entities.Student;




public class StudentServiceImpL implements StudentService{
	
	private StudentDao dao;
	
	
	public StudentServiceImpL()
	{
		dao=new StudentDaoImpL();
	}
	
	
	

	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student student=dao.getStudentById(id);
		return student;
		
	}

	
	
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		dao.beginTranscation();
		dao.addStudent(student);
		dao.commitTranscation();
		
	}

	
	
	
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
		dao.beginTranscation();
		dao.removeStudent(student);
		dao.commitTranscation();

	}

	
	
	
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

		dao.beginTranscation();
		dao.updateStudent(student);
		dao.commitTranscation();

	}

}
