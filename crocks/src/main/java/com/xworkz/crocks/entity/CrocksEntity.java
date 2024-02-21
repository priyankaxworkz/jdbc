package com.xworkz.crocks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="crocks_table")
@NamedQuery(name="updateByPrice", query="select entity from CrocksEntity entity where entity.price=:price")
@NamedQuery(name="updatebyName",query="select entity from CrocksEntity entity where entity.name=:name AND entity.color=:color")
public class CrocksEntity {

	@Id
	@Column(name="crocks_id")
	private int id;
	@Column(name="companyName")
	private String name;
	@Column(name="ceoName")
	private String ceoName;
	@Column(name="price")
	private int price;
	@Column(name="color")
	private String color;
}
