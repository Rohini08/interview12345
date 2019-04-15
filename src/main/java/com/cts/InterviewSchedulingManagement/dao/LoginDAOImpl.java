package com.cts.InterviewSchedulingManagement.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.InterviewSchedulingManagement.bean.Candidate;


@Repository("loginDAO")
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public Candidate authenticateCandidate(Candidate candidate) {
		
		// TODO Auto-generated method stub
		try{
			String emailId = candidate.getEmailId();
			String password = candidate.getPassword();
			
			Session session = sessionFactory.getCurrentSession();
			String query = "from Candidate where emailId = ? and password = ?";
			Query<Candidate> query2 = null;
			
			System.out.println(emailId);
			System.out.println(password);
			query2=session.createQuery(query);
			query2.setParameter(0,emailId);  
			query2.setParameter(1,password);  
			Candidate can= query2.getSingleResult();
			
			if(can!=null)
			{
				
			return can;
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
	public String getUserType(Candidate candidate) {
		// TODO Auto-generated method stub
		
		try {
		Session session = sessionFactory.getCurrentSession();
		String emailId = candidate.getEmailId();
		String query="select userType from Candidate where emailId= ?";
		Query<String> query2 = null;
		
		query2=session.createQuery(query);
		query2.setParameter(0,emailId); 
		
		String can=query2.getSingleResult();
		return can;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public int getCandidateNumber(Candidate candidate) {
		// TODO Auto-generated method stub
		try {
		Session session = sessionFactory.getCurrentSession();
		String emailId = candidate.getEmailId();
		String query="select candidateNumber from Candidate where emailId= ?";
		Query<Integer> query2 = null;
		
		query2=session.createQuery(query);
		query2.setParameter(0,emailId); 
		
		int candidateNumber=query2.getSingleResult();
		return candidateNumber;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		
	}

	

}
