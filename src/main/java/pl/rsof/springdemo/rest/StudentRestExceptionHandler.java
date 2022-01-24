/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 24 sty 2022  21:17:37
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * <p>Globalna obsluga bledow - AOP</p><p>24 sty 2022</p>
 * @author RS
 *
 */
@ControllerAdvice
public class StudentRestExceptionHandler {

	
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
	
}
