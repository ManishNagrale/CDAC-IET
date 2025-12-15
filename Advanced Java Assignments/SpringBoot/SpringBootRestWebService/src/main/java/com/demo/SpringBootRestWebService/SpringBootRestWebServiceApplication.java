package com.demo.SpringBootRestWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;




@SpringBootApplication
public class SpringBootRestWebServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootRestWebServiceApplication.class, args);
		/*for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	}

}
