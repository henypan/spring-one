package com.brooklyn.demo.autowire;

import org.springframework.context.ApplicationContext;

import com.brooklyn.BrooklynInstanceBean;
import com.brooklyn.entity.PublicTransfer;
import com.brooklyn.factory.ApplicationContextProvider;

public class TestPublicTransfer {

	public static void main(String[] args) {
		ApplicationContextProvider provider = new ApplicationContextProvider("config3");
		try {
			ApplicationContext ctx = provider.getInstance("pt-brooklyn.xml");
			PublicTransfer pt = (PublicTransfer) ctx.getBean("publictransfer");
			System.out.println(pt.getCategory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
