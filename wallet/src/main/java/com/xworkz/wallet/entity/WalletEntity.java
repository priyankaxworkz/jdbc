package com.xworkz.wallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "findByPrice", query = "select entity from WalletEntity entity where entity.price=:price")
@NamedQuery(name="findSizeByName", query="select entity.size from WalletEntity entity where entity.companyName=:companyName")
@NamedQuery(name="findnameandpriceByid",query="select entity.companyName,entity.price from WalletEntity entity where entity.id=:id")
@Table(name="wallet_table")
public class WalletEntity {
	
	@Id
	@Column(name="wallet_id")
	private int id;
	@Column(name="wallet_name")
	private String companyName;
	@Column(name="price")
	private int price;
	@Column(name="size")
	private char size;

}
