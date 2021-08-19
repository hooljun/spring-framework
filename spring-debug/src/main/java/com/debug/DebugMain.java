package com.debug;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DebugMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("debugs.xml");
		MyTestBean myTestBean = (MyTestBean) ac.getBean("myTestBean");
		System.out.println(myTestBean);
	}
}
