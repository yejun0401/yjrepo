package com.example.ckl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class CklApplication extends SpringBootServletInitializer {

	/**
	 * 응용프로그램을 구성한다.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CklApplication.class);
	}	
	
	public static void main(String[] args) {

		SpringApplication.run(CklApplication.class, args);
	}

}
