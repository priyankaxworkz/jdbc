package com.xworkz.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="market_table")
@NamedQuery(name="updateByName",query="update MarketEntity entity set entity.name=:name where entity.location=:location")
@NamedQuery(name="updateByPrice",query="update MarketEntity entity set entity.price=:price where entity.name=:name")
@NamedQuery(name="updateById",query="update MarketEntity entity set entity.location=:location where entity.id=:id ")
@NamedQuery(name="updatecontactumberByPriceAndName",query="update MarketEntity entity set entity.contactumber=:contactumber where entity.price=:price AND entity.name=:name")
public class MarketEntity {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="market_name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="contactNumber")
	private long contactumber;
	@Column(name="price")
	private int price;
	
}
