package com.cts.InterviewSchedulingManagement.bean;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CandidateRequirement {
	
	
	String employeeId;
    int requirementId;
	String domain;
	int requiredVacancies;
	
	 /*@DateTimeFormat(pattern = "yyyy/MM/dd")
	LocalDate closingDate;*/
	Date closingDate;
	int priority;
	int minExperience;
	String modeOfInterview;
    String qualification;
	int maxNoCan;
	
	public CandidateRequirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateRequirement(String employeeId,int requirementId ,String domain, int requiredVacancies, Date closingDate, int priority,
			int minExperience, String modeOfInterview,int maxNoCan) {
		super();
		this.employeeId = employeeId;
		this.domain = domain;
		this.requiredVacancies = requiredVacancies;
		this.closingDate = closingDate;
		this.priority = priority;
		this.minExperience = minExperience;
		this.modeOfInterview = modeOfInterview;
		this.requirementId= requirementId;
		this.maxNoCan= maxNoCan;
	}
	
	
	
	
	@Column
	public int getMaxNoCan() {
		return maxNoCan;
	}

	public void setMaxNoCan(int maxNoCan) {
		this.maxNoCan = maxNoCan;
	}

	@Column
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Column
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	
	@Id
	@Column
	public int getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(int requirementId) {
		this.requirementId = requirementId;
	}

	@Column
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Column
	public int getRequiredVacancies() {
		return requiredVacancies;
	}

	public void setRequiredVacancies(int requiredVacancies) {
		this.requiredVacancies = requiredVacancies;
	}

	@Column
	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	
	@Column
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Column
	public int getMinExperience() {
		return minExperience;
	}

	public void setMinExperience(int minExperience) {
		this.minExperience = minExperience;
	}

	@Column
	public String getModeOfInterview() {
		return modeOfInterview;
	}

	public void setModeOfInterview(String modeOfInterview) {
		this.modeOfInterview = modeOfInterview;
	}

	@Override
	public String toString() {
		return "CandidateRequirement [employeeId=" + employeeId + ", requirementId=" + requirementId + ", domain="
				+ domain + ", requiredVacancies=" + requiredVacancies + ", closingDate=" + closingDate + ", priority="
				+ priority + ", minExperience=" + minExperience + ", modeOfInterview=" + modeOfInterview
				+ ", qualification=" + qualification + ", maxNoCan=" + maxNoCan + "]";
	}
	
	
	

}
