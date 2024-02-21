package com.xworkz.actress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="actress_table")
@NamedQuery(name ="updateByAge", query ="update ActressEntity entity set entity.age=:ageBy where entity.name=:nameBy")
@NamedQuery(name = "updateByName", query = "update ActressEntity entity set entity.name=:nameby where entity.contactNumber=:numberBy")
public class ActressEntity {

	@Id
	@Column(name="actress_id")
	private int id;
	
	@Column(name="actress_name")
	private String name;
	@Column(name="actress-age")
	private int age;
	@Column(name="contact_number")
	private long contactNumber;
}
