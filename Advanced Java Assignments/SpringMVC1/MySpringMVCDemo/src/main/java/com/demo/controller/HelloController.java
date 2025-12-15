package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";   
		
	}
	
	@GetMapping("/welcome")
	public ModelAndView sayWelcome() {
		String msg="welcome message from controller";
		return new ModelAndView("welcome","message",msg);   
		
	}
	
	@GetMapping("/testdata")
	public String testdata(Model mymodel) {
		mymodel.addAttribute("name","manish");
		mymodel.addAttribute("email","mmm@gmail.com");
		return "testdata";  
		
	}
	
	
	

}
