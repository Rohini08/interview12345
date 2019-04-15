package com.cts.InterviewSchedulingManagement.service;

import java.util.Date;
import java.util.List;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;

public interface InterviewScheduleService {
	
	public String scheduleInterview(InterviewSchedule interviewSchedule );
	public List<CandidateRequirement> getAllSchedule() ;
	public String getQualification( int requirementId);
	//public String getInterviewId(InterviewSchedule interviewSchedule,Candidate can);
	public List<Candidate> getNameById(String Qualification);
	public Candidate getCandidate(String id);
	public Date closingDate(int requiremntId);
	public String checkStatus(String interviewId);
	public String setMaxNoCan(CandidateRequirement candidateRequirement);
	 public int getMaxNoCan(int requirementId);
	 public int getRequiredVacancies(int requirementId);
	 public CandidateRequirement getRequirement(int req);
	 public String updateRequiredVacancy(CandidateRequirement candidateRequirement);
	public InterviewSchedule retrieveCandidate(String emailId);
	public CandidateRequirement getCandidateData(int i);

}
