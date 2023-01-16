package crudoperation.services;

import crudoperation.entities.Student;

public interface StudentService {

	Student findStudentById(int id);				// retrieve data
	void addStudent(Student student);				// create   
	void removeStudent(Student student);			// delete	data
	void updateStudent(Student student);			// update   data

	
}
