package com.brooklyn.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brooklyn.BrooklynBean;

public class BeanLifeCycleDemo {
	private static AbstractApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("config/life-brooklyn.xml");
		BrooklynBean bk = (BrooklynBean) ctx.getBean("brooklynBean");
		System.out.println(bk.getMessage());
		ctx.registerShutdownHook();
	}
}
