package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="industry_table")
public class IndustryEntity {
	
	@Id
	@Column(name="industry_id")
	private int industryId;
	@Column(name="industry_name")
	private String industryName;
	@Column(name="industry_location")
	private String location;
	@Column(name="email_id")
	private String emailId;
	@Column(name="noof_employes")
	private int noOfEmployees;

}
