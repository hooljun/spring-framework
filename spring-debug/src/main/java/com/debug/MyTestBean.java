package com.debug;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class MyTestBean implements BeanNameAware, EnvironmentAware {

	private String beanName;

	private Environment env;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.env = environment;
	}

	public Environment getEnv() {
		return env;
	}
}
