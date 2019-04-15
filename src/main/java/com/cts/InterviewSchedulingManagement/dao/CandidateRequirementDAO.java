package com.cts.InterviewSchedulingManagement.dao;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;

public interface CandidateRequirementDAO {
	
	public String addCandidateRequirement(CandidateRequirement candidateRequirement);
	public String setModeOfInterview(CandidateRequirement candidateRequirement);
    public String editCandidateRequirement(CandidateRequirement candidateRequirement);
	
	//public String setModeOfInterview(CandidateRequirement candidateRequirement);


}
