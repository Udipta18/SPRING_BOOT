package com.smart.seviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.Dao.StudentDao;
import com.smart.model.Student;
import com.smart.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.createStudent(student);
	}

	@Override
	public void deleteStudent(int ID) {
		// TODO Auto-generated method stub
		
		 studentDao.deleteStudent(ID);
	}

	@Override
	public Student updateStudent(Student student, int ID) {
		// TODO Auto-generated method stub
		return studentDao.updateStudent(student, ID);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	@Override
	public Student getStudentById(int ID) {
		// TODO Auto-generated method stub
		return studentDao.getStudentById(ID);
	}

}
