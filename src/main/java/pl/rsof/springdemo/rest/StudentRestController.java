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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		int size = students.size();
		if (studentId < 0 || studentId >= size) {
			throw new StudentNotFoundException("Student id not found - id: " + studentId);
		}
		
		return students.get(studentId);
	}
	
	/**
	 * przeniesione do globalnej obslugi - StudentRestExcepionHandler
	 * 
	// add a exception handler
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse>handleException(StudentNotFoundException exc){
		
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.NOT_FOUND);
	}
	
	
	// add another exception handler to catch any exception
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse>handleExcepion(Exception exc){
		StudentErrorResponse error = new StudentErrorResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		
		return new ResponseEntity<StudentErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	*/
	
}
