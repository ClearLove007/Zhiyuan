package com.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "com/instance/factory/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = applicationContext.getBean(UserServiceImpl.class);
		userService.addUser();
	}
	 
}
