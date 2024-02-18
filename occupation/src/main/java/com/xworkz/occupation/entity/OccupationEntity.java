package com.xworkz.occupation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="occupation_table")
public class OccupationEntity {

	@Id
	@Column(name="occuaption_id")
	private int id;
	@Column(name="occupation_name")
	private String occupationName;
	@Column(name="location")
	private String location;
	@Column(name="annual_income")
	private String annualIncome;
	@Column(name="type_of_occupation")
	private String OccupationType;
	
}
