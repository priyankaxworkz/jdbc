package com.xworkz.college.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="college_table")
public class CollegeEntity {

	@Id
	@Column(name="college_id")
	private int collegeId;
	@Column(name="college_name")
	private String collegeName;
	@Column(name="college_email")
	private String emailId;
	@Column(name="college_location")
	private String location;
	@Column(name="noofdeaprtment")
	private int noOfDepartment;
}
