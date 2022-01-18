/*
 *  Company: RS
 *  Project: spring-rest-demo
 *  Created: 18 sty 2022  21:11:46
 *  Author:  RS 		
 */
package pl.rsof.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>Konfiguracja Springa</p><p>18 sty 2022</p>
 * @author RS
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("pl.rsof.springdemo")
public class DemoAppConfig {

}
