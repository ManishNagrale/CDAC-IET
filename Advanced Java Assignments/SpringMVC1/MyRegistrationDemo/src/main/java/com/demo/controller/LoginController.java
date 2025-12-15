package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.dto.RegistrationForm;
import com.demo.service.LoginService;
import com.demo.beans.*;
@Controller
@RequestMapping("/login")
public class LoginController {
    
	@Autowired
	LoginService lservice;
	
	@GetMapping("/loginuser")
	public String showLoginForm() {
		return "loginpage";
	}
	@PostMapping("/validateuser")
	public ModelAndView validateUser(HttpSession session , @RequestParam("uname") String uname , @RequestParam("password") String pwd ) {
		MyUser user = lservice.validateUser(uname,pwd);
		if(user!=null) {
			 session.setAttribute("user", user);
			   return new ModelAndView("redirect:/product/showproduct");
		}else {
			 return new ModelAndView("loginpage","message","Invalid credentials");
		}
	}
	@GetMapping("/registerme")
	public String RegisterForm(Model m) {
		m.addAttribute("register", new RegistrationForm());
		m.addAttribute("availableSkills", Arrays.asList("java","Hibernate","sql","spring","cpp"));
		m.addAttribute("city",List.of("Mumbai","pune","Nagpur","Delhi"));
		return "registerform";
	}
	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("registrationForm") @Valid RegistrationForm form, BindingResult br, Model model) throws IOException 
	{ 
		if (br.hasErrors()) 
		{ 
			model.addAttribute("availableSkills", Arrays.asList("Java","Spring","Hibernate","SQL","JS")); 
			
			return "registerform"; 
		} 
		    MultipartFile photo = form.getPhoto(); 
		    String uploadDir = System.getProperty("catalina.base") + File.separator + "user-photos"; 
		    File dir = new File(uploadDir); 
		    if (!dir.exists()) 
		    	dir.mkdirs(); 
		    String ext = FilenameUtils.getExtension(photo.getOriginalFilename());
            String savedName = form.getUsername() + "_profile." + ext; 
            File dest = new File(dir, savedName); 
            photo.transferTo(dest); 
            MyRegisterUser user = new MyRegisterUser(); 
            user.setUserId(form.getUserId()); 
            user.setName(form.getName()); 
            user.setGender(form.getGender()); 
            user.setDob(form.getDob()); 
            user.setUsername(form.getUsername()); 
            user.setPassword(form.getPassword()); // hash in real app 
            user.setSkills(String.join(",", form.getSkills())); 
            user.setPhotoPath(dest.getAbsolutePath()); 
            lservice.registerUser(user); 
            model.addAttribute("user", user); 
            return "register-success"; 
             
	
		}
	
	
	
	
	
	
	
	
	
	
}
