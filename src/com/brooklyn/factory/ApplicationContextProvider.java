package com.brooklyn.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextProvider {
	private String configPath = null;

	public ApplicationContextProvider(String configPath) {
		this.configPath = configPath;
	}

	public ApplicationContext getInstance(String xmlName) throws Exception {
		String beanPath = configPath + "/" + xmlName;
		return new ClassPathXmlApplicationContext(beanPath);
	}
}
