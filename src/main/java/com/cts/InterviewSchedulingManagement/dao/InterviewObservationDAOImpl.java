package com.cts.InterviewSchedulingManagement.dao;

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
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;

@Repository("interviewObservationDAO")
@Transactional
public class InterviewObservationDAOImpl implements InterviewObservationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public String scheduleObservation(InterviewObservation interviewObservation) {
		// TODO Auto-generated method stub
		try{
		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().save(interviewObservation);
		return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "failure";
		}
	}
	
	
	
	public List<CandidateRequirement> getAllSchedule() {
		// TODO Auto-generated method stub
		 TypedQuery<CandidateRequirement> query = sessionFactory.getCurrentSession().createQuery("from CandidateRequirement");
		 
	      return query.getResultList();
	}
	
	public List<InterviewSchedule> getNameById(int requirementId) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			String query = "from InterviewSchedule where requirementId = ? ";
			Query<InterviewSchedule> query2 = null;
			query2=session.createQuery(query);
			query2.setParameter(0,requirementId);   
			List<InterviewSchedule> candidate= query2.getResultList();
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

	
	 public InterviewSchedule getSchedule(String interviewId)
     {
		 try
		 {
    	 Session session=sessionFactory.getCurrentSession();
    	 String query="from InterviewSchedule where interviewId=?";
    	 Query<InterviewSchedule> query2=null;
    	 query2=session.createQuery(query);
 		 query2.setParameter(0,interviewId);
    	 
 		InterviewSchedule interviewSchedule=query2.getSingleResult();
 		 return  interviewSchedule;
		 }
		 catch(Exception e)
		 {
			 return null;
		 }
    	
     }



	@Override
	public InterviewObservation getObservation(String intId) {
		// TODO Auto-generated method stub
		try
		 {
   	 Session session=sessionFactory.getCurrentSession();
   	 String query="from InterviewObservation where interviewId=?";
   	 Query<InterviewObservation> query2=null;
   	 query2=session.createQuery(query);
		 query2.setParameter(0,intId);
   	 
		 InterviewObservation interviewSchedule=query2.getSingleResult();
		 return  interviewSchedule;
		 }
		 catch(Exception e)
		 {
			 return null;
		 }
	}
	
//	public String interviewResult(InterviewObservation interviewObservation, String rank)
//	{
//		int marks=interviewObservation.getInterviewMarks();
//		
//		
//		if((marks<70 && marks >=50) && (rank=="R2"&&rank=="R3"))
//		{
//			interviewObservation.setCandidateStatus(0);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		if((marks<70 &&marks>=50) && rank=="R1")
//		{
//			interviewObservation.setCandidateStatus(1);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		if((marks>=70 && marks<80) && (rank=="R2" && rank=="R1"))
//		{
//			interviewObservation.setCandidateStatus(0);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		if((marks<80 &&marks>=70) && (rank=="R3"))
//		{
//			interviewObservation.setCandidateStatus(1);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		if(marks>80)
//		{
//			interviewObservation.setCandidateStatus(1);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		if(marks<50)
//		{
//			interviewObservation.setCandidateStatus(0);
//			sessionFactory.getCurrentSession().saveOrUpdate(interviewObservation);
//			return "success";
//
//		}
//		
//		return "success";
//	}
//	


}
