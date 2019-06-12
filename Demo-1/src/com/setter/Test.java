package com.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "com/setter/applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
	}
}
