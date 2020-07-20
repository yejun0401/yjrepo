package jqka.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("jqka.rest")
public class CklApplication extends SpringBootServletInitializer {

	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CklApplication.class);
	}	
	
	public static void main(String[] args) {

		SpringApplication.run(CklApplication.class, args);
		System.out.println("run master end");
        System.out.println("run master end");
        System.out.println("run master end");
	}

}
