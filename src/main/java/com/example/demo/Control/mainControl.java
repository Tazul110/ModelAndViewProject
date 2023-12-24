package com.example.demo.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainControl {

	@RequestMapping("/home")
	 public String homePage()
	 {
		return "HomePage.html";
	 }
	
	@RequestMapping("/User_info")
	 public ModelAndView User_information(@RequestParam int id,
			 @RequestParam String name,@RequestParam String lang)	 
	 {
		ModelAndView mv=new ModelAndView();
		 
		mv.setViewName("User_info.html");
		mv.addObject("Id",id);
		mv.addObject("Name",name);
		mv.addObject("Lang", lang);
		return mv;
	 }
	
}
