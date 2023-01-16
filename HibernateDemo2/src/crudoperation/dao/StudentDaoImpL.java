package crudoperation.dao;

import javax.persistence.EntityManager;
import crudoperation.entities.Student;




public class StudentDaoImpL implements StudentDao{

	private EntityManager em;

	
	public StudentDaoImpL()
	{
		em=JUtil.getEntityManager();
	}
	
	
	
	
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student student= em.find(Student.class, id);
		
		return student;
	}

	
	
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		em.persist(student);
		
	}

	
	
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
	
		em.remove(student);
	}

	
	
	
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
		em.merge(student);
	}

	
	public void beginTranscation() {
		// TODO Auto-generated method stub
		
		em.getTransaction().begin();
	}

	public void commitTranscation() {
		// TODO Auto-generated method stub
		
		em.getTransaction().commit();
	}

	
	
}