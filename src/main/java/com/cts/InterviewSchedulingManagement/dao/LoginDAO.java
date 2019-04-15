package com.cts.InterviewSchedulingManagement.dao;

import com.cts.InterviewSchedulingManagement.bean.Candidate;

public interface LoginDAO {
	
	public Candidate authenticateCandidate(Candidate candidate);
	public String getUserType(Candidate candidate);
	public int getCandidateNumber(Candidate candidate);
}
