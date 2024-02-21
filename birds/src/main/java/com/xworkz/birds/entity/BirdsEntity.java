package com.xworkz.birds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="birds_table")
@NamedQuery(name = "updateByName", query = "select entity from BirdsEntity entity where entity.name=:name")
@NamedQuery(name="updateBylocation",query="select entity from BirdsEntity entity where entity.location=:location AND entity.color=:color")
public class BirdsEntity {

	@Id
	@Column(name="birds_id")
	private int id;
	@Column(name="birds_name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="birds_color")
	private String color;
	
}
