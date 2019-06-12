package com.statc.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "com/statc/factory/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService1 = applicationContext.getBean(UserServiceImpl.class);
		UserService userService2 = applicationContext.getBean(UserServiceImpl.class);
		System.out.println(userService1);
		System.out.println(userService2);
	}
	 
}
