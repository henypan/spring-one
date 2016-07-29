package com.brooklyn;

public class SunsetParkBean extends BrooklynBean {
	private String message1;
	private String message2;
	private BrooklynBean bean;

	public SunsetParkBean(BrooklynBean bean) {
		this.bean = bean;
	}

	public void setMessage1(String message) {
		this.message1 = message;
	}

	public String getMessage1() {
		return message1;
	}

	public void setMessage2(String message) {
		this.message2 = message;
	}

	public String getMessage2() {
		return message2;
	}
	
	public String getLocation() {
		return bean.getLocation() + ",Sunset Park";
	}
}
