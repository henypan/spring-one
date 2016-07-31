package com.brooklyn.demo.autowire;

import org.springframework.context.ApplicationContext;

import com.brooklyn.BrooklynInstanceBean;
import com.brooklyn.factory.ApplicationContextProvider;

public class AutowireDemo {

	public static void main(String[] args) {
		ApplicationContextProvider provider = new ApplicationContextProvider("config3");
		try {
			ApplicationContext ctx = provider.getInstance("autowire-brooklyn.xml");
			BrooklynInstanceBean bkBean = (BrooklynInstanceBean) ctx.getBean("brooklynBean");
			// check brooklyn bean setter injection
			System.out.println(bkBean.getMessage());
			System.out.println(bkBean.getPublictransfer().getCategory());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
