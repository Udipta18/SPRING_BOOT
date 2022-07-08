package com.smart.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.smart.helper.StudentRowMapper;
import com.smart.model.Student;

@Repository
public class StudentDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Student createStudent(Student student) {
		String query="insert into student(name,ID,college) value(?,?,?)";
		int ans=jdbcTemplate.update(query, student.getName(),student.getID(),student.getName());
		System.out.println(ans+"row updated");
		return student;
	}
	public void deleteStudent(int ID) {
		String query="delete  from student where ID=?";
		int del=jdbcTemplate.update(query, ID);
		System.out.println(del+"row effected");
	}
	
	public Student updateStudent(Student student,int ID) {
		String query="update student set name=?,college=? where ID=?";
		int update=jdbcTemplate.update(query, student.getName(),student.getCollege(), ID);
		student.setID(ID);
		System.out.println(update+"row effected");
		return student;
	}
	
	public List<Student> getAllStudent() {
		String query="select * from student";
		List<Student> student=(List<Student>) jdbcTemplate.query(query, new StudentRowMapper());
		return student;
		
	}
	
	public Student getStudentById(int ID) {
		String query="select * from student where ID=?";
		Student st=jdbcTemplate.queryForObject(query, new StudentRowMapper(),ID);
		return st;
	}
}
