/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 21 sty 2022  13:15:44
 *  Author:  RS 		
 */
package pl.rsof.springdemo.entity;

/**
 * <p></p><p>21 sty 2022</p>
 * @author RS
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	
		
	public Student() {
	
	}


	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
