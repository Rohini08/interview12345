package com.cts.InterviewSchedulingManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.dao.CandidateRequirementDAO;

@Service("candidateRequirementService")
@Transactional
public class CandidateRequirementServiceImpl implements  CandidateRequirementService{
 
	@Autowired
	CandidateRequirementDAO candidateRequirementDAO;
	
	@Override
	public String addCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return candidateRequirementDAO.addCandidateRequirement(candidateRequirement);
		
	}

	@Override
	public String setModeOfInterview(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return candidateRequirementDAO.setModeOfInterview(candidateRequirement);
	}
	@Override
	public String editCandidateRequirement(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		
		return candidateRequirementDAO.editCandidateRequirement(candidateRequirement);
	}

	/*@Override
	public String setModeOfInterview(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return editCandidateRequirementDAO.setModeOfInterview(candidateRequirement);
	}*/
	
}
