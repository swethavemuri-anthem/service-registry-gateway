/**
 * 
 */
package com.atlas.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.antheminc.oss.nimbus.domain.session.HttpSessionProvider;
import com.antheminc.oss.nimbus.domain.session.SessionProvider;

/**
 * @author Jayant Chaudhuri
 *
 */
@Configuration
@SpringBootApplication(scanBasePackageClasses=LoginController.class)
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){ 
		return application.sources(Application.class);
	} 
	public static void main(String[] args) throws Exception { 
		SpringApplication.run(Application.class, args);
	} 
	
	@Bean
	public SessionProvider sessionProvider() { 
		return new HttpSessionProvider();
	} 

}