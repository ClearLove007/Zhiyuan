package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "com/scope/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService1 = applicationContext.getBean(UserServiceImpl.class);
		UserService userService2 = applicationContext.getBean(UserServiceImpl.class);
		System.out.println(userService1);
		System.out.println(userService2);
	}
	 
}
