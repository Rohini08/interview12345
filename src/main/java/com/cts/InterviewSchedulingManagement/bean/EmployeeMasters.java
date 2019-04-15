package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table
public class EmployeeMasters {
	
	@Column
	@Id
	String employeeId;
	@Column
	String employeeName;

}
