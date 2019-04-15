package com.cts.InterviewSchedulingManagement.service;

import com.cts.InterviewSchedulingManagement.bean.Candidate;

public interface LoginService {
	
	public Candidate authenticateCandidate(Candidate candidate);
	public String getUserType(Candidate candidate);
	public int getCandidateNumber(Candidate candidate);

}
