package com.xworkz.branch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@NamedQuery(name="findByHodName",query="select entity from BranchEntity entity where entity.hodName=:hodName")
@NamedQuery(name="findbranchNameById",query="select entity.branchName from BranchEntity entity where entity.id=:id")
@NamedQuery(name="findsubjectandHodNamebylabs",query="select entity.noOfSubject,entity.hodName from BranchEntity entity where entity.totalLabs=:totalLabs  ")
@Table(name="branch_table")
public class BranchEntity {

	
	@Id
	@Column(name="branch_id")
	private int id;
	@Column(name="branch_name")
	private String branchName;
	@Column(name="no_of_subject")
	private int noOfSubject;
	@Column(name="hod_name")
	private String hodName;
	@Column(name="no_of_labs")
	private int totalLabs;
}
	
	

