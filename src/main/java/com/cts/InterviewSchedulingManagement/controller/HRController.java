package com.cts.InterviewSchedulingManagement.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;
import com.cts.InterviewSchedulingManagement.service.CandidateRequirementService;
import com.cts.InterviewSchedulingManagement.service.InterviewObservationService;
import com.cts.InterviewSchedulingManagement.service.InterviewScheduleService;



@Controller
public class HRController {
	
	

	@Autowired
	InterviewScheduleService interviewScheduleService;
	
	@Autowired
	CandidateRequirementService candidateRequirementService;
	
	/*@Autowired
	EditCandidateRequirementService editCandidateRequirementService;*/
	
	@Autowired
	InterviewObservationService interviewObservationService ;
	
	@RequestMapping(value="HrHome.html", method=RequestMethod.GET)
	public String getHrHomePage()
	{
		System.out.println("hr home this");
		return "hrHome";
	}
	
	@RequestMapping(value="addCandidateReq.html", method=RequestMethod.GET)
	public String getAddCandidateReqPage()
	{
		System.out.println("@GRT");
		return "addCandidateReq";
	}
	@RequestMapping(value="listCandidateReq.html", method=RequestMethod.GET)
	public String getListCandidateReqPage()
	{
		return "listCandidateReq";
	}
	@RequestMapping(value="alreadyScheduled.html", method=RequestMethod.GET)
	public String getAlreadyScheduledPage()
	{
		return "alreadyScheduled";
	}
	
	@RequestMapping(value="editCandidateReq.html", method=RequestMethod.GET)
	public String getEditCandidateReqPage()
	{
		return "editCandidateReq";
	}
	@RequestMapping(value="maxCandidateExceeded.html", method=RequestMethod.GET)
	public String getMaxCandidateExceededPage()
	{
		return "maxCandidateExceeded";
	}

	@RequestMapping(value="interviewSchedule.html", method=RequestMethod.GET)
	public String getinterviewSchedulePage(Model model,HttpSession httpSession)
	{
		List<CandidateRequirement> candidateRequirement =interviewScheduleService.getAllSchedule();
		httpSession.setAttribute("CandidateRequirement",candidateRequirement);
		return "interviewSchedule";
	}
	
	
	@RequestMapping(value="updateList2", method=RequestMethod.GET)
	public String updateList2(Model model,HttpSession httpSession, @RequestParam("order") int order)
	{
		List<CandidateRequirement> candidateRequirement =interviewScheduleService.getAllSchedule();
		int requirementId = order;
		httpSession.setAttribute("reqId", requirementId);
		String qualification = interviewScheduleService.getQualification(requirementId);
		httpSession.setAttribute("qualification",qualification);
		return "interviewSchedule";
	}
	
	
		@RequestMapping(value="updateList3", method=RequestMethod.GET)
		public String updateList3(Model model,HttpSession httpSession, @RequestParam("qualification1") String qualification1)
		{
			String filterByQualification = qualification1;
			httpSession.setAttribute("Candidate",interviewScheduleService.getNameById(filterByQualification));
			return "interviewSchedule";
		}
	
		@RequestMapping(value="updateList4", method=RequestMethod.GET)
		public String updateList4(Model model,HttpSession httpSession, @RequestParam("emailId") String emailId)
		{
			String getEmailId = emailId;
			httpSession.setAttribute("emailId",emailId);
			return "interviewSchedule";
		}
		
		@RequestMapping(value="interviewObservation.html", method=RequestMethod.GET)
		public String getinterviewObservationPage(Model model,HttpSession httpSession)
		{
			List<CandidateRequirement> candidateRequirement =interviewObservationService.getAllSchedule();
			httpSession.setAttribute("CandidateRequirement",candidateRequirement);
			return "interviewObservation";
		}
		 
		
		@RequestMapping(value="updateList5", method=RequestMethod.GET)
		public String updateList5(Model model,HttpSession httpSession, @RequestParam("order") int order)
		{
			List<CandidateRequirement> candidateRequirement =interviewObservationService.getAllSchedule();
			int requirementId = order;
			httpSession.setAttribute("reqId", requirementId);
			
			httpSession.setAttribute("candidate1",interviewObservationService.getNameById(requirementId));
			System.out.println("from get"+requirementId);
			System.out.println("from get"+interviewObservationService.getNameById(requirementId));
			return "interviewObservation";
		}
		
	@RequestMapping(value="addCandidateReq.html", method=RequestMethod.POST)
	public ModelAndView addCandidateRequirement(@ModelAttribute CandidateRequirement candidateReq ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		httpSession.setAttribute("candidateReq", candidateReq);
		int req=candidateReq.getRequirementId();
		System.out.println(candidateReq);
		if("success".equals(candidateRequirementService.setModeOfInterview(candidateReq)))
		{
		System.out.println(candidateReq);
		if("success".equals(candidateRequirementService.addCandidateRequirement(candidateReq)))
		{
			
			System.out.println("candidate added");
			
			
			
			
			
			modelAndView.setViewName("hrHome");
		}
		}
		return modelAndView;
	}
	
	
	////done
	@RequestMapping(value="editCandidateReq.html", method=RequestMethod.POST)
	public ModelAndView editCandidateRequirement(@ModelAttribute CandidateRequirement candidateReq ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("@");
		if("success".equals(candidateRequirementService.editCandidateRequirement(candidateReq)))
		{
			
			candidateRequirementService.setModeOfInterview(candidateReq);
			
			modelAndView.setViewName("hrHome");
		}
		
		return modelAndView;
	}
	

	//done
	@RequestMapping(value="interviewSchedule.html", method=RequestMethod.POST)
	public ModelAndView interviewSchedule(@ModelAttribute InterviewSchedule interviewSchedule ,HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();

		  try {
			Candidate can = new Candidate();
		CandidateRequirement candidateRequirement=new CandidateRequirement();
		
	    String interviewId=httpSession.getAttribute("reqId")+":"+httpSession.getAttribute("emailId");
	    int req=Integer.parseInt(""+httpSession.getAttribute("reqId"));
		
		candidateRequirement=interviewScheduleService.getRequirement(req);
		
		interviewSchedule.setInterviewId(interviewId);
		interviewSchedule.setRequirementId(req);
		
		
		Date date1=interviewScheduleService.closingDate(req);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	     Date date = new Date();  
	    String date2=formatter.format(date);
	  
	    Date date3 = formatter.parse(date2);
		
	    
	    
	    int maxNoCan=candidateRequirement.getMaxNoCan();
	    
	    maxNoCan=interviewScheduleService.getMaxNoCan(req);
	    
	    int reqVac=interviewScheduleService.getMaxNoCan(req);
	   
	    
	    
	   if("true".equals(interviewScheduleService.checkStatus(interviewSchedule.getInterviewId())))
        {
	    	if (date1.compareTo(date3) > 0)
	    	{
              if(maxNoCan<=(3*reqVac))
              {
            	 System.out.println(interviewSchedule);
            	  if("success".equals(interviewScheduleService.scheduleInterview(interviewSchedule)))
            	  {
		     
            		  	maxNoCan=maxNoCan+1;
            		    candidateRequirement.setMaxNoCan(maxNoCan);
            		    System.out.println(candidateRequirement.getMaxNoCan());
            		    interviewScheduleService.setMaxNoCan(candidateRequirement);
            		    
            		  modelAndView.setViewName("hrHome");
            	  }
            	  else
            	  {
            		  return modelAndView;
            	  }
	    	
              }
              else
              {
            	  modelAndView.setViewName("MaxCandidateExceeded");
              }
	    	
           }
           else
           {
        	   modelAndView.setViewName("dateExpired");
           }
	   }
          
        else
	    {
	    	modelAndView.setViewName("alreadyScheduled");
	    }
          
	    } catch (ParseException e)
	    {
				// TODO Auto-generated catch block
	    	
				e.printStackTrace();
	     }
	
		
		 
		 
		
		  return modelAndView;
	}
	
	/*
	@RequestMapping(value="updateList6", method=RequestMethod.GET)
	public String updateList6(Model model,HttpSession httpSession, HttpServletRequest request)
	{
		
		httpSession=request.getSession(false);
		InterviewSchedule interview = (InterviewSchedule) httpSession.getAttribute("candidate1");
		String candidateName = interview.getCandidateName();
		httpSession.setAttribute("candidateName",candidateName);
		return "interviewObservation";
	}
	
	
	@RequestMapping(value="interviewObservation.html", method=RequestMethod.POST)
	public ModelAndView interviewObservation(@ModelAttribute InterviewObservation interviewObservation, HttpSession httpSession, HttpServletRequest request,@RequestParam("order") int order,@RequestParam("candidateName") String candidateName ) 
	{
		ModelAndView modelAndView = new ModelAndView();
		
//		 int marks = Integer.parseInt(request.getParameter("interviewMarks"));
//		 String toj = request.getParameter("toj");
//		 int requirementId  = Integer.parseInt(request.getParameter("requirementId").substring(request.getParameter("requirementId").indexOf("=")+1));
//		 String name = request.getParameter("candidateName");
//		 
//		 System.out.println(marks+toj+requirementId+name);
		
		String name = candidateName;
		int id = order;
		System.out.println(candidateName);
		System.out.println(id);
		List<CandidateRequirement> candidateRequirement =interviewObservationService.getAllSchedule();
		int requirementId = order;
		httpSession.setAttribute("reqId", requirementId);
		
		httpSession.setAttribute("candidate1",interviewObservationService.getNameById(requirementId));
		/*httpSession=request.getSession(false);
		List<InterviewSchedule> interview = (List<InterviewSchedule>) httpSession.getAttribute("candidate1");
		
		System.out.println(interview);
		String candidateName = interview.getCandidateName();
		httpSession.setAttribute("candidateName",candidateName);
		
		  String interviewId = httpSession.getAttribute("reqId")+":"+candidateName;
		 
		  System.out.println("iD;"+interviewId);
		
		  int req=Integer.parseInt((String)httpSession.getAttribute("reqId"));
		 
		  interviewObservation.setInterviewId(interviewId);
		  InterviewSchedule interviewSchedule=new InterviewSchedule();
		  CandidateRequirement candidateRequirement=new CandidateRequirement();
		  int reqVac=candidateRequirement.getRequiredVacancies();
		  interviewSchedule=interviewObservationService.getSchedule(interviewId);
		  candidateRequirement=interviewScheduleService.getRequirement(req);
		  String rank= interviewSchedule.getRank();
		
		  if("success".equals(interviewObservationService.scheduleObservation(interviewObservation)))
		  {
			  interviewObservationService.interviewResult(interviewObservation, rank);
			  if(interviewObservation.getCandidateStatus()==1)
			  {
				  candidateRequirement.setRequiredVacancies(reqVac-1);
			  }
		  }
		
		return modelAndView;
	}
	*/
	@RequestMapping(value="updateList5.html", method=RequestMethod.POST)
	public ModelAndView updateList7(Model model,HttpSession httpSession,@RequestParam("candidateName") String candidateName,HttpServletRequest request)
	{
		ModelAndView modelAndView = new ModelAndView();
		//System.out.println(interviewObservation);
		
		InterviewObservation interviewObservation=new InterviewObservation();
	
	String name = candidateName.substring(candidateName.indexOf("candidateName")+14);

	int id = (int) httpSession.getAttribute("reqId");
	
	int marks = Integer.parseInt((String)request.getParameter("interviewMarks"));
//	Date toj = request.getParameter("toj");
	interviewObservation.setInterviewMarks(marks);
	interviewObservation.setCandidateName(name);
	interviewObservation.setRequirementId(id);
//	interviewObservation.setToj(toj);
	String interviewId = httpSession.getAttribute("reqId")+":"+name;
	
	interviewObservation.setInterviewId(interviewId);
	
	 InterviewSchedule interviewSchedule=new InterviewSchedule();
	
	  CandidateRequirement candidateRequirement=new CandidateRequirement();
	 
	 // int reqVac=candidateRequirement.getRequiredVacancies();
	  interviewSchedule=interviewObservationService.getSchedule(interviewId);
	  System.out.println("interviewId to getSchedule: "+interviewId);
	  candidateRequirement=interviewScheduleService.getRequirement(id);
	 
	  String rank= interviewSchedule.getRank();
	  interviewObservation.setRank(rank);
	
	  System.out.println("rank"+rank);
	  
	  
	  if((marks<70 && marks >=50) && (rank=="R2"&&rank=="R3"))
		{
		  
		  interviewObservation.setCandidateStatus(0);
//			interviewObservation.setCandidateStatus(0);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
			//return "success";

		}
		if((marks<70 &&marks>=50) && rank=="R1")
		{
			
			  interviewObservation.setCandidateStatus(1);

//			interviewObservation.setCandidateStatus(1);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";

		}
		if((marks>=70 && marks<80) && (rank=="R2" && rank=="R1"))
		{
			
			  interviewObservation.setCandidateStatus(0);
		}
		if((marks<80 &&marks>=70) && (rank=="R3"))
		{
			
			  interviewObservation.setCandidateStatus(1);
		}
		if(marks>=80)
		{
			
			  interviewObservation.setCandidateStatus(1);

		}
		if(marks<50)
		{
			  interviewObservation.setCandidateStatus(0);

		}
	  

		 int reqVac=candidateRequirement.getRequiredVacancies();
		if("success".equals(interviewObservationService.scheduleObservation(interviewObservation)))
		{
			
			if(interviewObservation.getCandidateStatus()==1)
				  {
					  //System.out.println("9876");
					  candidateRequirement.setRequiredVacancies(reqVac-1);
					  interviewScheduleService.updateRequiredVacancy(candidateRequirement);
				  }
			
		}
	modelAndView.setViewName("hrHome");
		return modelAndView;
	}
	
	

}
