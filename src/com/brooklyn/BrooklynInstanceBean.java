package com.brooklyn;

import com.brooklyn.entity.PublicTransfer;
import com.brooklyn.entity.PublicTransferOld;

public class BrooklynInstanceBean extends BrooklynBean {
	private PublicTransfer publictransfer;
	
	public BrooklynInstanceBean() {
		System.out.println("Inside Brooklyn Instance Bean");
	}

	public PublicTransfer getPublictransfer() {
		return publictransfer;
	}

	public void setPublictransfer(PublicTransfer publictransfer) {
		this.publictransfer = publictransfer;
	}

}
