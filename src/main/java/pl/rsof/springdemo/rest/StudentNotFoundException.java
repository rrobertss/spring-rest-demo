/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 24 sty 2022  19:55:43
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

/**
 * <p></p><p>24 sty 2022</p>
 * @author RS
 *
 */
public class StudentNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;

	
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentNotFoundException(String message) {
		super(message);
	}

	public StudentNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
