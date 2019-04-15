package com.cts.InterviewSchedulingManagement.service;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface CandidateRequirementService {
	
	public String addCandidateRequirement(CandidateRequirement candidateRequirement);
	
	public String setModeOfInterview(CandidateRequirement candidateRequirement);
	
    public String editCandidateRequirement(CandidateRequirement candidateRequirement);
	
	//public String setModeOfInterview(CandidateRequirement candidateRequirement);


}
