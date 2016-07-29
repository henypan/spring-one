package com.place.converter;

import java.util.List;

public class Place {
	private String country;
	private String city;
	private List<String> placeOfInerests;

	public Place(Builder builder) {
		this.country = builder.country;
		this.city = builder.city;
		this.placeOfInerests = builder.placeOfInerests;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getPlaceOfInerests() {
		return placeOfInerests;
	}

	public void setPlaceOfInerests(List<String> placeOfInerests) {
		this.placeOfInerests = placeOfInerests;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(country);
		sb.append(", " + city);
		for (int i = 0; i < placeOfInerests.size(); i++) {
			sb.append(", " + placeOfInerests.get(i));
		}
		return sb.toString();
	}

	public static class Builder {
		private String country;
		private String city;
		private List<String> placeOfInerests;

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder placeOfInterests(List<String> placeOfInerests) {
			this.placeOfInerests = placeOfInerests;
			return this;
		}

		public Place builder() {
			if (country == null || country.isEmpty()) {
				throw new IllegalArgumentException("Country cannot be empty");
			}
			if (city == null || city.isEmpty()) {
				throw new IllegalArgumentException("City cannot be empty");
			}
			if (placeOfInerests == null || placeOfInerests.isEmpty()) {
				throw new IllegalArgumentException("Place of interests cannot be empty");
			}
			return new Place(this);
		}
	}

}
