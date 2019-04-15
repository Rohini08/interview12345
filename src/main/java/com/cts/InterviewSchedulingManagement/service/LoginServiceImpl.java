package com.cts.InterviewSchedulingManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.dao.LoginDAO;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDAO loginDAO;
	@Override
	public Candidate authenticateCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateCandidate(candidate);
	}
	public String getUserType(Candidate candidate) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(candidate);
	}
	@Override
	public int getCandidateNumber(Candidate candidate) {
		// TODO Auto-generated method stub
		return loginDAO.getCandidateNumber(candidate);
	}
	

}
