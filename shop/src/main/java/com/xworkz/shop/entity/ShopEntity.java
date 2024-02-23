package com.xworkz.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name ="findByShopName", query ="select entity from ShopEntity entity where entity.shopName=:shopName")
@NamedQuery(name="findByClothName",query="select entity from ShopEntity entity where entity.clothName=:clothName")
@NamedQuery(name="findByContactNumber",query="select entity from ShopEntity entity where entity.contactNumber=:contactNumber")

@NamedQuery(name="findClothNameByPrice", query="select entity.clothName from ShopEntity entity where entity.price=:price")
@NamedQuery(name="findPriceByLocation",query="select entity.price from ShopEntity entity where entity.location=:location")
@NamedQuery(name="findsizeByQuality",query="select entity.size from ShopEntity entity where entity.quality=:quality")

@NamedQuery(name="findClothandQualityByNumber",query="select entity.clothName,entity.quality from ShopEntity entity where entity.contactNumber=:contactNumber")
@NamedQuery(name="findShopNameandDisscountByLocation",query="select entity.shopName,entity.disscount from ShopEntity entity where entity.location=:location")
@NamedQuery(name="findsizeandPriceById", query="select entity.size,entity.price from ShopEntity entity where entity.id=:id")

@NamedQuery(name="findByQuality",query="select entity from ShopEntity  entity where entity.quality=:quality")
@NamedQuery(name="findByshopName",query="select entity from ShopEntity entity where entity.shopName=:shopName")
@NamedQuery(name="findByPrice", query="select entity from ShopEntity entity where entity.price=:price")

@NamedQuery(name="findNumberByQuality", query="select entity.contactNumber from ShopEntity entity where entity.quality=:quality ")
@NamedQuery(name="findshopById", query="select entity.shopName from ShopEntity entity where entity.id=:id")
@NamedQuery(name="findSizeByPrice",query="select entity.size from ShopEntity entity where entity.price=:price")

@NamedQuery(name="findPriceandnameByShopName",query="select entity.price,entity.clothName from ShopEntity entity where entity.shopName=:shopName")
@NamedQuery(name="findQualityandsizeByClothName", query="select entity.quality,entity.size from ShopEntity entity where entity.clothName=:clothName")
@NamedQuery(name="findlocationAndpriceByQuality",query="select entity.location,entity.price from ShopEntity entity where entity.quality=:quality")

@NamedQuery(name="findByprice",query="select  max(entity.price) from ShopEntity entity ")
@NamedQuery(name="countByContact", query="select  count(entity.contactNumber) from ShopEntity entity")
@Table(name="shop_table")
public class ShopEntity {

	@Id
	@Column(name="shop_id")
	private int id;
	@Column(name="shop_name")
	private String shopName;
	@Column(name="cloth_name")
	private String clothName;
	@Column(name="quality")
	private double quality;
	@Column(name="contact_number")
	private long contactNumber;
	@Column(name="price")
	private int price;
	@Column(name="size")
	private char size;
	@Column(name="location")
	private String location;
	@Column(name="disscount")
	private float disscount;
	
}
