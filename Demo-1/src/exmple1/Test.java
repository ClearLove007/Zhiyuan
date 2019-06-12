package exmple1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@org.junit.Test
	public void demo() {
		String xml = "exmple1/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}
}
