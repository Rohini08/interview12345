package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Candidate {
	
	
	int candidateNumber;
	String  firstName;
	String lastName;
	int age;
	String gender;
	String contactNumber;
	String emailId;
	String password;
	String qualification;
	String companyName;
	String userType;
	
	

	public Candidate(String firstName, String lastName, int age, String gender, String contactNumber, String emailId,
			String password, String qualification, String companyName, String userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.password = password;
		this.qualification = qualification;
		this.companyName = companyName;
		this.userType = userType;
	}

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Column
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	@Column
	public int getCandidateNumber() {
		return candidateNumber;
	}

	public void setCandidateNumber(int candidateNumber) {
		this.candidateNumber = candidateNumber;
	}

	
	@Column
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	@Column
	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
	@Id
	@Column
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Column
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	
	@Column
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Candidate [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", password=" + password
				+ ", qualification=" + qualification + ", companyName=" + companyName + ", userType=" + userType + "]";
	}
	

	
	
	
	 

}
