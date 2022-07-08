package com.smart.controllerr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.model.Student;
import com.smart.service.StudentService;
import java.util.*;


@RestController
@RequestMapping("/dummy")
public class studentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public String createStudent(@RequestBody Student student) {
		Student st=studentService.createStudent(student);
		System.out.println("Student data enlisted successfully");
	    return "SUCCESS";
	}
	
	@DeleteMapping("/{ID}")
	public String deleteStudent(@PathVariable int ID) {
		studentService.deleteStudent(ID);
		return "SUCCESSFULLY DELETED";
	}
	
	@PutMapping("/{ID}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int ID) {
		Student st=studentService.updateStudent(student,ID);
		System.out.println("Student data updated successfully");
		return st;
	}
	@GetMapping("/")
	public List<Student> getAllStudent(){
		List<Student> list=studentService.getAllStudent();
		System.out.println("SUCCESSFULLY GET ALL STUDET DETAILS");
		return list;
	}
	@GetMapping("/{ID}")
	public Student getStudentById(@PathVariable int ID) {
		Student st=studentService.getStudentById(ID);
		System.out.println("SUCCESSFULLY FETCHED");
		return st;
	}
	
	
}
