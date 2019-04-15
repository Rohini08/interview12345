package com.cts.InterviewSchedulingManagement.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.InterviewSchedulingManagement.bean.Candidate;

@Repository("registrationDAO")
@Transactional
public class RegistrationDAOImpl implements RegistrationDAO{

	@Autowired
	SessionFactory sessionFactory=null;
	

	public String registerCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(candidate);
		
		return "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
	}

}
