package com.cts.InterviewSchedulingManagement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@RequestMapping("UserRegistration.html")
	public String getRegistrationPage()
	{
		System.out.println("!");
		return "userRegistration";
	}
	
	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping(value="UserRegistration.html",method=RequestMethod.POST)
	public ModelAndView registerCandidate(@ModelAttribute Candidate candidate,HttpSession httpSession)
	{
		System.out.println("yes");  
		ModelAndView modelAndView=new ModelAndView();
		
		if("success".equals(registrationService.registerCandidate(candidate)))
				
		{
		    System.out.println("no");  
		    httpSession.setAttribute("candidate",candidate);
			modelAndView.setViewName("Login");
		      
			
		}
		System.out.println("y");  
		
		return modelAndView;
	}

}
