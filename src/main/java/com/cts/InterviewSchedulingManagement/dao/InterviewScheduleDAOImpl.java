package com.cts.InterviewSchedulingManagement.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;


@Repository("interviewScheduleDAO")
@Transactional
public class InterviewScheduleDAOImpl implements InterviewScheduleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public String scheduleInterview(InterviewSchedule interviewSchedule) {
		// TODO Auto-generated method stub
		try
		{
			String email = interviewSchedule.getCandidateName().substring((interviewSchedule.getCandidateName().indexOf("emailId"))+8) ;
		
		String qualification = interviewSchedule.getQualification().substring((interviewSchedule.getQualification().indexOf("qualification"))+15);
		
		interviewSchedule.setCandidateName(email);
		interviewSchedule.setQualification(qualification);
		
		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().save(interviewSchedule);
		
	
		return "success";
		}
		catch(Exception e)
		{
			return null;
		}
	}
	
	public String getQualification( int requirementId)
	{
		Session session = sessionFactory.getCurrentSession();
		 //int requirementId=candidateRequirement.getRequirementId();
			String query = "select qualification from CandidateRequirement where requirementId = ?";
			Query<String> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,requirementId);  
			String qualf= query2.getSingleResult();
		return qualf;
	}
	
	public List<CandidateRequirement> getAllSchedule() {
		// TODO Auto-generated method stub
		 TypedQuery<CandidateRequirement> query = sessionFactory.getCurrentSession().createQuery("from CandidateRequirement");
		 
	      return query.getResultList();
	}
	
	public List<Candidate> getNameById(String qualification) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from Candidate where qualification = ? ";
			Query<Candidate> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,qualification);   
			List<Candidate> candidate= query2.getResultList();
			if(candidate!=null)
			{
				
			return candidate;
			}
			else
			{
				
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;

	}

	
	@Override
	public Candidate getCandidate(String id) {
		System.out.println(id);
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from Candidate where emailId = ? ";
			Query<Candidate> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,id);   
			Candidate candidate= query2.getSingleResult();
			System.out.println(candidate);
			if(candidate!=null)
			{
				
			return candidate;
			}
			else
			{
				
				return null;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
	}
	
	public Date closingDate(int req)
	{
		Session session = sessionFactory.getCurrentSession();
		String query = "select closingDate from CandidateRequirement where requirementId = ? ";
		Query<Date> query2 = null;
		query2=session.createQuery(query);
		query2.setParameter(0,req);
		
		Date date2=query2.getSingleResult();
		
		
		return date2;
	}
	 public String checkStatus(String interviewId)
	 {
	try{
		 System.out.println("daoI:"+interviewId);
		 Session session = sessionFactory.getCurrentSession();
		 String query = " from InterviewSchedule where interviewId = ? ";
			Query<InterviewSchedule> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,interviewId);
			InterviewSchedule interview =query2.getSingleResult();
			System.out.println("dao"+interview);
			if(interview==null)
			{
				return "true";
			}
			else
			{
				
				 return "false";
			}
	}
	catch (Exception e) {
		return "true";
		// TODO: handle exception
	}
		
	 }
	 
	 public String setMaxNoCan(CandidateRequirement candidateRequirement )
	 {
		 Session session=sessionFactory.getCurrentSession();
		 session.update(candidateRequirement);
		 
		return "success";
	 }
	 
	 public int getMaxNoCan(int requirementId)
	 {
		Session session=sessionFactory.getCurrentSession();
		String query="select maxNoCan from CandidateRequirement where requirementId=?";
		Query<Integer> query2=null;
		
		query2=session.createQuery(query);
		query2.setParameter(0,requirementId);
		int maxNoCan=query2.getSingleResult();
		System.out.println("dao1"+ maxNoCan);
		
		return maxNoCan;
	 }
	 
	 public int getRequiredVacancies(int requirementId)
	 {
		Session session=sessionFactory.getCurrentSession();
		String query="select requiredVacancies from CandidateRequirement where requirementId=?";
		Query<Integer> query2=null;
		
		query2=session.createQuery(query);
		query2.setParameter(0,requirementId);
		int requiredVacancies=query2.getSingleResult();
		
		return requiredVacancies;
	 }
     public CandidateRequirement getRequirement(int req)
     {
    	 try{
    	 Session session=sessionFactory.getCurrentSession();
    	 String query="from CandidateRequirement where requirementId=?";
    	 Query<CandidateRequirement> query2=null;
    	 query2=session.createQuery(query);
 		 query2.setParameter(0,req);
    	 
    	 CandidateRequirement candidateRequirement = query2.getSingleResult();
    	 return  candidateRequirement;
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    		 return null;
    	 }
    	 //return  candidateRequirement;
     }

	@Override
	public String updateRequiredVacancy(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		
		 Session session=sessionFactory.getCurrentSession();
		 session.update(candidateRequirement);
		 
		return "success";
	}

	@Override
	public InterviewSchedule retrieveCandidate(String emailId) {
		// TODO Auto-generated method stub
		 try{
	    	 Session session=sessionFactory.getCurrentSession();
	    	 String query="from InterviewSchedule where candidateName = ?";
	    	 Query<InterviewSchedule> query2=null;
	    	 query2=session.createQuery(query);
	 		 query2.setParameter(0,emailId);
	    	 
	 		InterviewSchedule is = query2.getSingleResult();
	    	 return  is;
	    	 }
	    	 
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return null;
	    	 }
		
		
	}

	@Override
	public CandidateRequirement getCandidateData(int i) {
		// TODO Auto-generated method stub
		 try{
	    	 Session session=sessionFactory.getCurrentSession();
	    	 String query="from CandidateRequirement where requirementId = ?";
	    	 Query<CandidateRequirement> query2=null;
	    	 query2=session.createQuery(query);
	 		 query2.setParameter(0,i);
	    	 
	 		CandidateRequirement is = query2.getSingleResult();
	    	 return  is;
	    	 }
	    	 
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    		 return null;
	    	 }
		
	}
	
	

}
