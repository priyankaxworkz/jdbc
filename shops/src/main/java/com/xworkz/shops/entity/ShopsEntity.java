package com.xworkz.shops.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="shops_table")
@NamedQuery(name="readAll", query="select entity from ShopsEntity entity")
@NamedQuery(name="readByName",query="select entity from ShopsEntity entity where entity.shopName=:nameBy")
@NamedQuery(name="readnameByLocation",query="select entity.shopName from ShopsEntity entity where entity.location=:location")
@NamedQuery(name="readpriceandNameById",query="select entity.price,entity.shopName from ShopsEntity entity where entity.id=:id")
@NamedQuery(name="findpriceByContactNumber",query="select entity.price from ShopsEntity entity where entity.contactNumber=:contactNumber")
@NamedQuery(name="findLocationAndnumberByPrice", query="select entity.location,entity.contactNumber from ShopsEntity entity where entity.price=:price")
@NamedQuery(name="maxPrice",query="select max(entity.price) from ShopsEntity entity")
@NamedQuery(name="countByContact",query="select count(entity.contactNumber) from ShopsEntity entity")
public class ShopsEntity {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="shops_name")
	private String shopName;
	@Column(name="cost")
	private int price;
	@Column(name="location")
	private String location;
	@Column(name="contact_number")
	private long contactNumber;
}
