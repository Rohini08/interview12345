package com.cts.InterviewSchedulingManagement.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

@Repository("candidateRequirementDAO")
@Transactional
public class CandidateRequirementDAOImpl implements CandidateRequirementDAO {

	@Autowired
	SessionFactory sessionFactory=null;
	
	@Override
	public String addCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		try {
			System.out.println("add");
			sessionFactory.getCurrentSession().save(candidateRequirement);
			System.out.println("add1");
			System.out.println(candidateRequirement.getRequirementId());
			System.out.println(candidateRequirement.getMinExperience());
			System.out.println(candidateRequirement.getRequiredVacancies());
			
			return "success";
			
		} catch (Exception e) {
			
			return null;
			// TODO: handle exception
		}
		
		
	}

	@Override
	public String setModeOfInterview(CandidateRequirement candidateReq) {
		// TODO Auto-generated method stub
		try{
		Session session = sessionFactory.getCurrentSession();
		System.out.println(candidateReq.getRequiredVacancies());
		System.out.println(candidateReq.getMinExperience());
		
		if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=3)
		{
			
			candidateReq.setModeOfInterview("OnlineTest");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=6 && candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("InPerson");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()>6 )
		{
			candidateReq.setModeOfInterview("Telephonic");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		
		else if(candidateReq.getRequiredVacancies()>3 && candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=6 &&candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("InPerson");
			//sessionFactory.getCurrentSession().update(candidateReq);
		//	sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>5 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>5 &&candidateReq.getMinExperience()<=6 &&candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().update(candidateReq.getModeOfInterview(),candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>5 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("InPerson");
			//sessionFactory.getCurrentSession().update(candidateReq);
			//sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
			
		}
		
		return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public String editCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println("edit");
		sessionFactory.getCurrentSession().update(candidateRequirement);
		System.out.println(candidateRequirement.getRequirementId());
		System.out.println(candidateRequirement.getMinExperience());
		
		return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}

	/*@Override
	public String setModeOfInterview(CandidateRequirement candidateReq) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()<=6 && candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("InPerson");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()<=3 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("Telephonic");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 && candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()<=6 &&candidateReq.getMinExperience()>3)
		{
			candidateReq.setModeOfInterview("OnlineTest");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		else if(candidateReq.getRequiredVacancies()>3 &&candidateReq.getRequiredVacancies()<=5 &&candidateReq.getMinExperience()>6)
		{
			candidateReq.setModeOfInterview("InPerson");
			sessionFactory.getCurrentSession().saveOrUpdate(candidateReq);
		}
		
		return "success";*/
		
	}

	
	


