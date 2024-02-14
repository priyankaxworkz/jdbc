package com.xworkz.monuments.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="monument_table")
public class MonumentEntity {
@Id
@Column(name="monument_id")
	private int id;
@Column(name="monument_name")
	private String name;
@Column(name="monument_location")
	private String location;
@Column(name="monument_height")
	private double height;
@Column(name="monument_founder")
	private String founder;
@Column(name="monument_area")
	private double arealocated;
@Column(name="monument_state")
private String state;
}
