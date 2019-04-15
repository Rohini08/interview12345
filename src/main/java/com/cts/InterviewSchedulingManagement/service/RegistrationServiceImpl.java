package com.cts.InterviewSchedulingManagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.dao.RegistrationDAO;

@Service("registrationService")
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	RegistrationDAO registrationDAO;
	
	@Override
	public String registerCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return registrationDAO.registerCandidate(candidate);
	}

	

}
