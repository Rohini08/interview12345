package com.cts.InterviewSchedulingManagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.Candidate;
import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;
import com.cts.InterviewSchedulingManagement.dao.InterviewScheduleDAO;

@Service("interviewScheduleService")
@Transactional
public class InterviewScheduleServiceImpl implements InterviewScheduleService{
	
	@Autowired
	InterviewScheduleDAO interviewScheduleDAO;

	@Override
	public String scheduleInterview(InterviewSchedule interviewSchedule) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.scheduleInterview(interviewSchedule);
	}

	@Override
	public List<CandidateRequirement> getAllSchedule() {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getAllSchedule();
	}

	@Override
	public String getQualification(int requirementId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getQualification(requirementId);
	}

	/*@Override
	public String getInterviewId(InterviewSchedule interviewSchedule, Candidate can) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getInterviewId(interviewSchedule, can);
	}*/

	@Override
	public List<Candidate> getNameById(String qualification) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getNameById(qualification);
	}

	@Override
	public Candidate getCandidate(String id) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getCandidate(id);
	}

	@Override
	public Date closingDate(int requiremntId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.closingDate(requiremntId);
	}

	@Override
	public String checkStatus(String interviewId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.checkStatus(interviewId);
	}

	@Override
	public String setMaxNoCan(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.setMaxNoCan(candidateRequirement);
	}

	@Override
	public int getMaxNoCan(int requirementId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getMaxNoCan(requirementId);
	}

	@Override
	public int getRequiredVacancies(int requirementId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getRequiredVacancies(requirementId);
		
	}

	@Override
	public CandidateRequirement getRequirement(int req) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getRequirement(req);
	}

	@Override
	public String updateRequiredVacancy(CandidateRequirement candidateRequirement) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.updateRequiredVacancy(candidateRequirement);
	}

	@Override
	public InterviewSchedule retrieveCandidate(String emailId) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.retrieveCandidate(emailId);
	}

	@Override
	public CandidateRequirement getCandidateData(int i) {
		// TODO Auto-generated method stub
		return interviewScheduleDAO.getCandidateData(i);
	}

	
	
}
