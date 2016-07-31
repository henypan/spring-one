package com.brooklyn.demo;

import org.springframework.context.ApplicationContext;

import com.brooklyn.BayridgeBean;
import com.brooklyn.SunsetParkBean;
import com.brooklyn.factory.ApplicationContextProvider;

public class InheritanceBeanDemo {
	public static void main(String[] args) {
		ApplicationContextProvider provider = new ApplicationContextProvider("config2");
		try {
			ApplicationContext ctx = provider.getInstance("inheritance-brooklyn.xml");
			SunsetParkBean spBean = (SunsetParkBean) ctx.getBean("sunsetParkBean");
			System.out.println(spBean.getMessage1());
			System.out.println(spBean.getMessage2());
			System.out.println(spBean.getLocation());

			BayridgeBean brBean = (BayridgeBean) ctx.getBean("bayridgeBean");
			System.out.println(brBean.getMessage1());
			System.out.println(brBean.getMessage2());
			System.out.println(brBean.getLocation());
			
			// display API of inner bean
			brBean.getThreeGuys().open();
			brBean.getThreeGuys().close();
			System.out.println(brBean.getThreeGuys().getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
