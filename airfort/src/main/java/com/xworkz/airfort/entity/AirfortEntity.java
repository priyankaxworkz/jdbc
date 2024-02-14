package com.xworkz.airfort.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="airfort_table")
public class AirfortEntity {

	@Id
	@Column(name="airfort_id")
	private int airfortId;
	@Column(name="airfort_name")
	private String airfortName;
	@Column(name="airfort_location")
	private String location;
	@Column(name="noOfStaffs")
	private int noOfStaffs;
	@Column(name="manager_name")
	private String mangerName;
	
}
