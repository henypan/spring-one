package com.brooklyn;

public abstract class BrooklynBean {
	private String message;
	private String location;

	public BrooklynBean() {
		setLocation("Brooklyn");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void init() {
		System.out.println("Bean is initialized ");
	}

	public void destroy() {
		System.out.println("Bean is destroyed");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
