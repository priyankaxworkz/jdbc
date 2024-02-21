package com.xworkz.camera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="camera_table")
@NamedQuery(name = "updateByPrice", query = "update CameraEntity entity set entity.price=:priceBy where entity.CompanyName=:nameBy")
@NamedQuery(name = "updateByName", query = "update CameraEntity entity set entity.name=:cameraNameBy where entity.CompanyName=:nameBy")
public class CameraEntity {

	@Id
	@Column(name="camera_id")
	private int id;
	
	@Column(name="camera_name")
	private String name;
	@Column(name="camera_lens")
	private String lens;
	@Column(name="company_name")
	private String CompanyName;
	@Column(name="price")
	private int price;
	
	
}
