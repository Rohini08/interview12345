package com.cts.InterviewSchedulingManagement.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class InterviewObservation {
	
	
	int interviewMarks;
	int requirementId;
	@DateTimeFormat(pattern = "yyyy/MM/dd") // This is for bind Date with @ModelAttribute
	private LocalDate toj;
	String rank;
	int candidateStatus;
	String interviewId;
	String candidateName;
	
	public InterviewObservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Column
	public int getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	
	
	
	
	@Column
	public LocalDate getToj() {
		return toj;
	}
	
	
	public void setToj(LocalDate toj) {
		this.toj = toj;
	}


	@Column
	public int getInterviewMarks() {
		return interviewMarks;
	}
	public void setInterviewMarks(int interviewMarks) {
		this.interviewMarks = interviewMarks;
	}
	
	
	
	
	
	@Column
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
	@Column
	public int getCandidateStatus() {
		return candidateStatus;
	}
	public void setCandidateStatus(int candidateStatus) {
		this.candidateStatus = candidateStatus;
	}
	
	@Id
	@Column
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}
	
	
	@Column
	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}


	public InterviewObservation(int interviewMarks, int requirementId, LocalDate toj, String rank, int candidateStatus,
			String interviewId, String candidateName) {
		super();
		this.interviewMarks = interviewMarks;
		this.requirementId = requirementId;
		this.toj = toj;
		this.rank = rank;
		this.candidateStatus = candidateStatus;
		this.interviewId = interviewId;
		this.candidateName = candidateName;
	}


	@Override
	public String toString() {
		return "InterviewObservation [interviewMarks=" + interviewMarks + ", requirementId=" + requirementId + ", toj="
				+ toj + ", rank=" + rank + ", candidateStatus=" + candidateStatus + ", interviewId=" + interviewId
				+ ", candidateName=" + candidateName + "]";
	}


	
	

}
