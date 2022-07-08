package com.smart.service;

import com.smart.model.Student;
import java.util.*;

public interface StudentService {

	
	public Student createStudent(Student student);
	public void deleteStudent(int ID);
	public Student updateStudent(Student student,int ID);
	public List<Student> getAllStudent();
	public Student getStudentById(int ID);
}
