package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {
    
	
	@RequestMapping(value="/sucess")
	public String  courseDetail()
	{
		return "courseDetail";
	}
	
}
