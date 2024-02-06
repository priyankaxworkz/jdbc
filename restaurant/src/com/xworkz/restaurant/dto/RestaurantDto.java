package com.xworkz.restaurant.dto;

public class RestaurantDto {

	private String restaurant_name;
	private int restaurant_noofcheff;
	private String restaurant_location;
	private String restaurant_specialfood;
	private String restaurant_managername;
	private long restaurant_contactnumber;
	private double restaurant_revivews;
	private double restaurant_opentimings;
	private double restaurant_closetimings;
	
	public RestaurantDto() {
		System.out.println("no args constructor");
	}

	public RestaurantDto(String restaurant_name, int restaurant_noofcheff, String restaurant_location,
			String restaurant_specialfood, String restaurant_managername, long restaurant_contactnumber,
			double restaurant_revivews, double restaurant_opentimings, double restaurant_closetimings) {
		super();
		this.restaurant_name = restaurant_name;
		this.restaurant_noofcheff = restaurant_noofcheff;
		this.restaurant_location = restaurant_location;
		this.restaurant_specialfood = restaurant_specialfood;
		this.restaurant_managername = restaurant_managername;
		this.restaurant_contactnumber = restaurant_contactnumber;
		this.restaurant_revivews = restaurant_revivews;
		this.restaurant_opentimings = restaurant_opentimings;
		this.restaurant_closetimings = restaurant_closetimings;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public void setRestaurant_noofcheff(int restaurant_noofcheff) {
		this.restaurant_noofcheff = restaurant_noofcheff;
	}

	public void setRestaurant_location(String restaurant_location) {
		this.restaurant_location = restaurant_location;
	}

	public void setRestaurant_specialfood(String restaurant_specialfood) {
		this.restaurant_specialfood = restaurant_specialfood;
	}

	public void setRestaurant_managername(String restaurant_managername) {
		this.restaurant_managername = restaurant_managername;
	}

	public void setRestaurant_contactnumber(long restaurant_contactnumber) {
		this.restaurant_contactnumber = restaurant_contactnumber;
	}

	public void setRestaurant_revivews(double restaurant_revivews) {
		this.restaurant_revivews = restaurant_revivews;
	}

	public void setRestaurant_opentimings(double restaurant_opentimings) {
		this.restaurant_opentimings = restaurant_opentimings;
	}

	public void setRestaurant_closetimings(double restaurant_closetimings) {
		this.restaurant_closetimings = restaurant_closetimings;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public int getRestaurant_noofcheff() {
		return restaurant_noofcheff;
	}

	public String getRestaurant_location() {
		return restaurant_location;
	}

	public String getRestaurant_specialfood() {
		return restaurant_specialfood;
	}

	public String getRestaurant_managername() {
		return restaurant_managername;
	}

	public long getRestaurant_contactnumber() {
		return restaurant_contactnumber;
	}

	public double getRestaurant_revivews() {
		return restaurant_revivews;
	}

	public double getRestaurant_opentimings() {
		return restaurant_opentimings;
	}

	public double getRestaurant_closetimings() {
		return restaurant_closetimings;
	}

	@Override
	public String toString() {
		return "RestaurantDto [restaurant_name=" + restaurant_name + ", restaurant_noofcheff=" + restaurant_noofcheff
				+ ", restaurant_location=" + restaurant_location + ", restaurant_specialfood=" + restaurant_specialfood
				+ ", restaurant_managername=" + restaurant_managername + ", restaurant_contactnumber="
				+ restaurant_contactnumber + ", restaurant_revivews=" + restaurant_revivews
				+ ", restaurant_opentimings=" + restaurant_opentimings + ", restaurant_closetimings="
				+ restaurant_closetimings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(restaurant_closetimings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (restaurant_contactnumber ^ (restaurant_contactnumber >>> 32));
		result = prime * result + ((restaurant_location == null) ? 0 : restaurant_location.hashCode());
		result = prime * result + ((restaurant_managername == null) ? 0 : restaurant_managername.hashCode());
		result = prime * result + ((restaurant_name == null) ? 0 : restaurant_name.hashCode());
		result = prime * result + restaurant_noofcheff;
		temp = Double.doubleToLongBits(restaurant_opentimings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(restaurant_revivews);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((restaurant_specialfood == null) ? 0 : restaurant_specialfood.hashCode());
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
		RestaurantDto other = (RestaurantDto) obj;
		if (Double.doubleToLongBits(restaurant_closetimings) != Double.doubleToLongBits(other.restaurant_closetimings))
			return false;
		if (restaurant_contactnumber != other.restaurant_contactnumber)
			return false;
		if (restaurant_location == null) {
			if (other.restaurant_location != null)
				return false;
		} else if (!restaurant_location.equals(other.restaurant_location))
			return false;
		if (restaurant_managername == null) {
			if (other.restaurant_managername != null)
				return false;
		} else if (!restaurant_managername.equals(other.restaurant_managername))
			return false;
		if (restaurant_name == null) {
			if (other.restaurant_name != null)
				return false;
		} else if (!restaurant_name.equals(other.restaurant_name))
			return false;
		if (restaurant_noofcheff != other.restaurant_noofcheff)
			return false;
		if (Double.doubleToLongBits(restaurant_opentimings) != Double.doubleToLongBits(other.restaurant_opentimings))
			return false;
		if (Double.doubleToLongBits(restaurant_revivews) != Double.doubleToLongBits(other.restaurant_revivews))
			return false;
		if (restaurant_specialfood == null) {
			if (other.restaurant_specialfood != null)
				return false;
		} else if (!restaurant_specialfood.equals(other.restaurant_specialfood))
			return false;
		return true;
	}
	
	
}
