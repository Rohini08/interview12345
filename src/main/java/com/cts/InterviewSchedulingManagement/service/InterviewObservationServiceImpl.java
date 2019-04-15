package com.cts.InterviewSchedulingManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.InterviewSchedulingManagement.bean.CandidateRequirement;
import com.cts.InterviewSchedulingManagement.bean.InterviewObservation;
import com.cts.InterviewSchedulingManagement.bean.InterviewSchedule;
import com.cts.InterviewSchedulingManagement.dao.InterviewObservationDAO;

@Service("interviewObservationService")
@Transactional
public class InterviewObservationServiceImpl implements InterviewObservationService {
	
	@Autowired
	InterviewObservationDAO interviewObservationDAO;

	@Override
	public List<CandidateRequirement> getAllSchedule() {
		// TODO Auto-generated method stub
		return interviewObservationDAO.getAllSchedule();
	}

	@Override
	public List<InterviewSchedule> getNameById(int requirementId) {
		
		// TODO Auto-generated method stub
		return interviewObservationDAO.getNameById(requirementId);
	}

	@Override
	public String scheduleObservation(InterviewObservation interviewObservation) {
		// TODO Auto-generated method stub
		return interviewObservationDAO.scheduleObservation(interviewObservation);
	}

	@Override
	public InterviewSchedule getSchedule(String interviewId) {
		// TODO Auto-generated method stub
		return interviewObservationDAO.getSchedule(interviewId);
	}

	@Override
	public InterviewObservation getObservation(String intId) {
		// TODO Auto-generated method stub
		return interviewObservationDAO.getObservation(intId);
	}

//	@Override
//	public String interviewResult(InterviewObservation interviewObservation,String rank) {
//		// TODO Auto-generated method stub
//		return interviewObservationDAO.interviewResult(interviewObservation,rank);
//	}

}
