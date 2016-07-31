package com.brooklyn.entity;

public class PublicTransfer {
	private String category;

	public PublicTransfer() {
		System.out.println("Inside X25 Bus");
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

}
