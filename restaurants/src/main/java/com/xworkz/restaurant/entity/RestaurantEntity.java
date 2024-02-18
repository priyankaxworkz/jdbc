package com.xworkz.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="restaurants_table")
public class RestaurantEntity {

	@Id
	@Column(name="restaurants_id")
	private int id;
	
	@Column(name="restaurants_name")
	private String name;
	@Column(name="restaurants_location")
	private String location;
	@Column(name="no_of_chief")
	private int noOfChief;
	@Column(name="total_VarietiesOfFood")
	private int varitiesOfFood;
}
