package com.life;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "com/life/applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService1 = applicationContext.getBean(UserServiceImpl.class);
		userService1.addUser();
		applicationContext.close();
	}
	 
}
