package com.brooklyn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/brooklyn.xml");
		BrooklynBean bk = (BrooklynBean) ctx.getBean("brooklynBean");
		System.out.println(bk.getMessage());
	}
}
