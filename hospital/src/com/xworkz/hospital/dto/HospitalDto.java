package com.xworkz.hospital.dto;

public class HospitalDto {

	private String hospital_name;
	private String hospital_location;
	private int hospital_noofdoctors;
	private  int hospital_noofstaff;
	private long hospital_contactnumber;
	private  String hospital_emailid;
	private int hospital_timeing;
	private  int hospital_noofwards;
	private int hospital_noofbranches;
	
	public HospitalDto() {
		System.out.println("no args constuctor");
	}
	
	public HospitalDto(String hospital_name, String hospital_location, int hospital_noofdoctors, int hospital_noofstaff,
			long hospital_contactnumber, String hospital_emailid, int hospital_timeing, int hospital_noofwards,
			int hospital_noofbranches) {
		super();
		this.hospital_name = hospital_name;
		this.hospital_location = hospital_location;
		this.hospital_noofdoctors = hospital_noofdoctors;
		this.hospital_noofstaff = hospital_noofstaff;
		this.hospital_contactnumber = hospital_contactnumber;
		this.hospital_emailid = hospital_emailid;
		this.hospital_timeing = hospital_timeing;
		this.hospital_noofwards = hospital_noofwards;
		this.hospital_noofbranches = hospital_noofbranches;
	}

	
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public void setHospital_location(String hospital_location) {
		this.hospital_location = hospital_location;
	}

	public void setHospital_noofdoctors(int hospital_noofdoctors) {
		this.hospital_noofdoctors = hospital_noofdoctors;
	}

	public void setHospital_noofstaff(int hospital_noofstaff) {
		this.hospital_noofstaff = hospital_noofstaff;
	}

	public void setHospital_contactnumber(long hospital_contactnumber) {
		this.hospital_contactnumber = hospital_contactnumber;
	}

	public void setHospital_emailid(String hospital_emailid) {
		this.hospital_emailid = hospital_emailid;
	}

	public void setHospital_timeing(int hospital_timeing) {
		this.hospital_timeing = hospital_timeing;
	}

	public void setHospital_noofwards(int hospital_noofwards) {
		this.hospital_noofwards = hospital_noofwards;
	}

	public void setHospital_noofbranches(int hospital_noofbranches) {
		this.hospital_noofbranches = hospital_noofbranches;
	}
	
	public String getHospital_name() {
		return hospital_name;
	}

	public String getHospital_location() {
		return hospital_location;
	}

	public int getHospital_noofdoctors() {
		return hospital_noofdoctors;
	}

	public int getHospital_noofstaff() {
		return hospital_noofstaff;
	}

	public long getHospital_contactnumber() {
		return hospital_contactnumber;
	}

	public String getHospital_emailid() {
		return hospital_emailid;
	}

	public int getHospital_timeing() {
		return hospital_timeing;
	}

	public int getHospital_noofwards() {
		return hospital_noofwards;
	}

	public int getHospital_noofbranches() {
		return hospital_noofbranches;
	}

	@Override
	public String toString() {
		return "HospitalDto [hospital_name=" + hospital_name + ", hospital_location=" + hospital_location
				+ ", hospital_noofdoctors=" + hospital_noofdoctors + ", hospital_noofstaff=" + hospital_noofstaff
				+ ", hospital_contactnumber=" + hospital_contactnumber + ", hospital_emailid=" + hospital_emailid
				+ ", hospital_timeing=" + hospital_timeing + ", hospital_noofwards=" + hospital_noofwards
				+ ", hospital_noofbranches=" + hospital_noofbranches + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (hospital_contactnumber ^ (hospital_contactnumber >>> 32));
		result = prime * result + ((hospital_emailid == null) ? 0 : hospital_emailid.hashCode());
		result = prime * result + ((hospital_location == null) ? 0 : hospital_location.hashCode());
		result = prime * result + ((hospital_name == null) ? 0 : hospital_name.hashCode());
		result = prime * result + hospital_noofbranches;
		result = prime * result + hospital_noofdoctors;
		result = prime * result + hospital_noofstaff;
		result = prime * result + hospital_noofwards;
		result = prime * result + hospital_timeing;
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
		HospitalDto other = (HospitalDto) obj;
		if (hospital_contactnumber != other.hospital_contactnumber)
			return false;
		if (hospital_emailid == null) {
			if (other.hospital_emailid != null)
				return false;
		} else if (!hospital_emailid.equals(other.hospital_emailid))
			return false;
		if (hospital_location == null) {
			if (other.hospital_location != null)
				return false;
		} else if (!hospital_location.equals(other.hospital_location))
			return false;
		if (hospital_name == null) {
			if (other.hospital_name != null)
				return false;
		} else if (!hospital_name.equals(other.hospital_name))
			return false;
		if (hospital_noofbranches != other.hospital_noofbranches)
			return false;
		if (hospital_noofdoctors != other.hospital_noofdoctors)
			return false;
		if (hospital_noofstaff != other.hospital_noofstaff)
			return false;
		if (hospital_noofwards != other.hospital_noofwards)
			return false;
		if (hospital_timeing != other.hospital_timeing)
			return false;
		return true;
	}
	
	
	
}
