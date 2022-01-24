/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 21 sty 2022  13:18:06
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.rsof.springdemo.entity.Student;

/**
 * <p></p><p>21 sty 2022</p>
 * @author RS
 *
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	
	private List<Student>students;
	
	// load only once
	@PostConstruct
	public void loadData() {
		students = new LinkedList<>();
		Student s1 = new Student("Maria", "Nowak"); students.add(s1);
		Student s2 = new Student("Irena", "Bąk"); students.add(s2);
		Student s3 = new Student("Ireneusz", "Kowalski"); students.add(s3);
	}
	
	
	

	// define endpoint for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudentsList() {
	
		return students;
	}
	
	
	// endpoint for /student/{studentId} - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudentById(@PathVariable int studentId) {
		return students.get(studentId);
	}
	
	
}
