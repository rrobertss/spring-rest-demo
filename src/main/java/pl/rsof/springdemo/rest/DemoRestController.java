/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 18 sty 2022  21:17:18
 *  Author:  RS 		
 */
package pl.rsof.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p><p>18 sty 2022</p>
 * @author RS
 *
 */
@RestController
@RequestMapping("/test")
public class DemoRestController {

	
	// add code for the "/hello" endpoint
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
}
