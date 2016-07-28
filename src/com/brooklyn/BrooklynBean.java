package com.brooklyn;

public class BrooklynBean {
	private String message;

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
}
