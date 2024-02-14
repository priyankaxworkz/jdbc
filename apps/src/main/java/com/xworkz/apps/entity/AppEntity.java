package com.xworkz.apps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="app_table")
public class AppEntity {

	@Id
	@Column(name="app_id")
	private int appId;
	@Column(name="app_name")
	private String appName;
	@Column(name="version")
	private String version;
	@Column(name="company_name")
	private String companyName;
	@Column(name="app_storage")
	private String storgae;
}
