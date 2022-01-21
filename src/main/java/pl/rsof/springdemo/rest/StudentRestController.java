/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 21 sty 2022  13:18:06
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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


	// define endpoint for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudentsList() {
		
		List<Student>list = new LinkedList<>();
		Student s1 = new Student("Maria", "Nowak"); list.add(s1);
		Student s2 = new Student("Irena", "Bąk"); list.add(s2);
		Student s3 = new Student("Ireneusz", "Kowalski"); list.add(s3);
	
		return list;
	}
	
}
