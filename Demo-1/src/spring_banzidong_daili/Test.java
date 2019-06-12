package spring_banzidong_daili;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String xml = "spring_daili/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = (UserService) applicationContext.getBean("proxyId");
		
		userService.add();
		userService.update();
		userService.delete();
	}
}
