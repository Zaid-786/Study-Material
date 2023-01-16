package crudoperation.dao;

import crudoperation.entities.Student;

public interface StudentDao {

	Student getStudentById(int id);
	void addStudent(Student student);
	void removeStudent(Student student);
	void updateStudent(Student student);

	void commitTranscation();		//starts communication in database
	void beginTranscation();		//ends communication in database

}
