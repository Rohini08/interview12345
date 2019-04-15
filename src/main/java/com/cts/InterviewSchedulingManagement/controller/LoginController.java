package com.cts.InterviewSchedulingManagement.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;
import com.cts.InterviewSchedulingManagement.service.InterviewObservationService;
import com.cts.InterviewSchedulingManagement.service.InterviewScheduleService;
import com.cts.InterviewSchedulingManagement.service.LoginService;
import com.cts.InterviewSchedulingManagement.service.LoginServiceImpl;



@Controller
public class LoginController {
	
//	@RequestMapping(value="Login.html", method=RequestMethod.GET)
//	public String getLoginPage()
//	{
//		return "Login";
//	}
	
	@RequestMapping(value="CandidateHome.html", method=RequestMethod.GET)
	public String getCandidatePage()
	{
		return "candidateHome";
	}
	@Autowired
	LoginService loginService;
	
	@Autowired
	InterviewScheduleService interviewSchedule;
	
	@Autowired 
	InterviewObservationService interviewObservationService;
	
	@RequestMapping(value="Login.html", method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Candidate candidate, HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
		
		Candidate can  = loginService.authenticateCandidate(candidate);
		if(can != null)
		{
			
			
			if(loginService.getUserType(candidate).equals("CANDIDATE"))
				{
		
			    httpSession.setAttribute("can",can);
				
				System.out.println(can.getEmailId());
				//Candidate can1 = (Candidate) httpSession.getAttribute("can");
				InterviewSchedule is = interviewSchedule.retrieveCandidate(can.getEmailId());
				

				httpSession.setAttribute("is", is);
				String intId = is.getInterviewId(); 
				
				
				System.out.println(intId);

				
				InterviewObservation io = interviewObservationService.getObservation(intId);
				
				System.out.println(io);
				
				httpSession.setAttribute("io", io);
				
				
				CandidateRequirement cr = interviewSchedule.getCandidateData((is.getRequirementId()));
				httpSession.setAttribute("cr", cr);
				modelAndView.setViewName("candidateHome");
				
				}
				else
				{
					if((loginService.getUserType(candidate)).equals("HIRER"))
					{
						//System.out.println(loginService.getCandidateNumber(candidate));
				    httpSession.setAttribute("can",can);
				    httpSession.setAttribute("candidateId", loginService.getCandidateNumber(candidate));
				    System.out.println("rrrr");
				    modelAndView.setViewName("hrHome");
					}
				}
		
		}
		else
		{
			System.out.println("4");
			modelAndView.setViewName("Login");
		}
		
		return modelAndView;	
	}
	

}
