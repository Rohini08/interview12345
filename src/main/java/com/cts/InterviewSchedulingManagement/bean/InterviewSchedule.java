package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class InterviewSchedule {
	
	
	int requirementId;
	String candidateName;
	String qualification;
	String rank;
	String venue;
	String interviewId;
	
	
	public InterviewSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public InterviewSchedule(int requirementId, String candidateName, String qualification, String rank,
			String venue, String interviewId) {
		super();
		this.requirementId = requirementId;
		this.candidateName = candidateName;
		this.qualification = qualification;
		this.rank = rank;
		this.venue = venue;
		this.interviewId = interviewId;
	}

	@Column
	public int getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}
	
	@Column
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	
	@Column
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Column
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Column
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	@Id
	@Column
	public String getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(String interviewId) {
		this.interviewId = interviewId;
	}

	@Override
	public String toString() {
		return "InterviewSchedule [requirementId=" + requirementId + ", candidateName=" + candidateName
				+ ", qualification=" + qualification + ", rank=" + rank + ", venue=" + venue + ", interviewId="
				+ interviewId + "]";
	}
	

}
