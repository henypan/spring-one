package com.brooklyn;

import com.brooklyn.entity.ThreeGuysFromBK;

public class BayridgeBean extends BrooklynBean {
	private String message1;
	private String message2;
	private BrooklynBean bean = null;
	private ThreeGuysFromBK threeGuys;

	// Constructor injection
	public BayridgeBean(BrooklynBean bean) {
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
		return bean.getLocation() + ", Bayridge";
	}

	public ThreeGuysFromBK getThreeGuys() {
		return threeGuys;
	}

	// Setter injection
	public void setThreeGuys(ThreeGuysFromBK threeGuys) {
		this.threeGuys = threeGuys;
	}
}
