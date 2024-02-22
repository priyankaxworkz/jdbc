package com.xworkz.ipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@NamedQuery(name = "findByName", query = "select entity from IplEntity entity where entity.teamName=:teamName")
@NamedQuery(name="findcolorbyambasdor",query="select entity.dressColor from IplEntity entity where entity.ambasdorName=:ambasdorName")
@NamedQuery(name="findcolorandteambyname",query="select entity.totalTeam,entity.dressColor from IplEntity entity where entity.teamName=:teamName")
@Table(name="ipl_table")

public class IplEntity {

	@Id
	@Column(name="ipl_id")
	private int id;
	@Column(name="team_Name")
	private String teamName;
	@Column(name="captain_Name")
	private String captainName;
	@Column(name="ambasdor_Name")
	private String ambasdorName;
	@Column(name="dressColor")
	private String dressColor;
	@Column(name="total_team")
	private int totalTeam;
}
