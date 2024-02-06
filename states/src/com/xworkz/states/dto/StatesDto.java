package com.xworkz.states.dto;

public class StatesDto {

	private String state_name;
	private int state_noofdistrict;
	private int state_nooftaluks;
	private double state_population;
	private String state_tardition;
	private String state_capital;
	private String state_cmname;
	private String state_famousplace;
	private String state_specialfood;
	
	public StatesDto() {
		System.out.println("no args constructor");
	}

	public StatesDto(String state_name, int state_noofdistrict, int state_nooftaluks, double state_population,
			String state_tardition, String state_capital, String state_cmname, String state_famousplace,
			String state_specialfood) {
		super();
		this.state_name = state_name;
		this.state_noofdistrict = state_noofdistrict;
		this.state_nooftaluks = state_nooftaluks;
		this.state_population = state_population;
		this.state_tardition = state_tardition;
		this.state_capital = state_capital;
		this.state_cmname = state_cmname;
		this.state_famousplace = state_famousplace;
		this.state_specialfood = state_specialfood;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public void setState_noofdistrict(int state_noofdistrict) {
		this.state_noofdistrict = state_noofdistrict;
	}

	public void setState_nooftaluks(int state_nooftaluks) {
		this.state_nooftaluks = state_nooftaluks;
	}

	public void setState_population(double state_population) {
		this.state_population = state_population;
	}

	public void setState_tardition(String state_tardition) {
		this.state_tardition = state_tardition;
	}

	public void setState_capital(String state_capital) {
		this.state_capital = state_capital;
	}

	public void setState_cmname(String state_cmname) {
		this.state_cmname = state_cmname;
	}

	public void setState_famousplace(String state_famousplace) {
		this.state_famousplace = state_famousplace;
	}

	public void setState_specialfood(String state_specialfood) {
		this.state_specialfood = state_specialfood;
	}

	public String getState_name() {
		return state_name;
	}

	public int getState_noofdistrict() {
		return state_noofdistrict;
	}

	public int getState_nooftaluks() {
		return state_nooftaluks;
	}

	public double getState_population() {
		return state_population;
	}

	public String getState_tardition() {
		return state_tardition;
	}

	public String getState_capital() {
		return state_capital;
	}

	public String getState_cmname() {
		return state_cmname;
	}

	public String getState_famousplace() {
		return state_famousplace;
	}

	public String getState_specialfood() {
		return state_specialfood;
	}

	@Override
	public String toString() {
		return "StatesDto [state_name=" + state_name + ", state_noofdistrict=" + state_noofdistrict
				+ ", state_nooftaluks=" + state_nooftaluks + ", state_population=" + state_population
				+ ", state_tardition=" + state_tardition + ", state_capital=" + state_capital + ", state_cmname="
				+ state_cmname + ", state_famousplace=" + state_famousplace + ", state_specialfood=" + state_specialfood
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state_capital == null) ? 0 : state_capital.hashCode());
		result = prime * result + ((state_cmname == null) ? 0 : state_cmname.hashCode());
		result = prime * result + ((state_famousplace == null) ? 0 : state_famousplace.hashCode());
		result = prime * result + ((state_name == null) ? 0 : state_name.hashCode());
		result = prime * result + state_noofdistrict;
		result = prime * result + state_nooftaluks;
		long temp;
		temp = Double.doubleToLongBits(state_population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((state_specialfood == null) ? 0 : state_specialfood.hashCode());
		result = prime * result + ((state_tardition == null) ? 0 : state_tardition.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StatesDto other = (StatesDto) obj;
		if (state_capital == null) {
			if (other.state_capital != null)
				return false;
		} else if (!state_capital.equals(other.state_capital))
			return false;
		if (state_cmname == null) {
			if (other.state_cmname != null)
				return false;
		} else if (!state_cmname.equals(other.state_cmname))
			return false;
		if (state_famousplace == null) {
			if (other.state_famousplace != null)
				return false;
		} else if (!state_famousplace.equals(other.state_famousplace))
			return false;
		if (state_name == null) {
			if (other.state_name != null)
				return false;
		} else if (!state_name.equals(other.state_name))
			return false;
		if (state_noofdistrict != other.state_noofdistrict)
			return false;
		if (state_nooftaluks != other.state_nooftaluks)
			return false;
		if (Double.doubleToLongBits(state_population) != Double.doubleToLongBits(other.state_population))
			return false;
		if (state_specialfood == null) {
			if (other.state_specialfood != null)
				return false;
		} else if (!state_specialfood.equals(other.state_specialfood))
			return false;
		if (state_tardition == null) {
			if (other.state_tardition != null)
				return false;
		} else if (!state_tardition.equals(other.state_tardition))
			return false;
		return true;
	}
	
	
}
