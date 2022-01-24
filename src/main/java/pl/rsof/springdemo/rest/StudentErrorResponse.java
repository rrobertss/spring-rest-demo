/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 24 sty 2022  19:44:48
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

/**
 * <p>Obsluga bledu</p><p>24 sty 2022</p>
 * @author RS
 *
 */
public class StudentErrorResponse {

	private int status;
	private String message;
	private long timestamp;
	
	
	public StudentErrorResponse() {
		
	}


	public StudentErrorResponse(int status, String message, long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
