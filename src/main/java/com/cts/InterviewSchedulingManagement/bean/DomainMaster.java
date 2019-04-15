package com.cts.InterviewSchedulingManagement.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table
public class DomainMaster {
	
	@Column
	@Id
	String domainId;
	@Column
	String domainName;

}
