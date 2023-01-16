package com.crudoperation.service;

import com.crudoperation.entities.Student;

public interface StudentService {
	Student findStudentById(int id);

	void addStudent(Student student);

	void updateStudent(Student student);

	void removeStudent(Student student);

}
