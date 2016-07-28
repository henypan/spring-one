package com.brooklyn.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brooklyn.BrooklynBean;

public class DemoSingletonBean {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/brooklyn.xml");
		BrooklynBean bk1 = (BrooklynBean) ctx.getBean("brooklynBean");
		bk1.setMessage("Brooklyn1");
		System.out.println(bk1.getMessage());
		BrooklynBean bk2 = (BrooklynBean) ctx.getBean("brooklynBean");
		System.out.println(bk2.getMessage());
	}

}
