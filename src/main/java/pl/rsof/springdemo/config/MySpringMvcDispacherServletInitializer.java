/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 18 sty 2022  21:14:27
 *  Author:  RS 		
 */
package pl.rsof.springdemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * <p>Konfiguracja Dispachera</p><p>18 sty 2022</p>
 * @author RS
 *
 */
public class MySpringMvcDispacherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {DemoAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"}; // root
	}

}
