package com.brooklyn.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brooklyn.BrooklynBean;

public class SimpleBeanDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/simple-brooklyn.xml");
		BrooklynBean bk = (BrooklynBean) ctx.getBean("brooklynBean");
		System.out.println(bk.getMessage());
	}
}
