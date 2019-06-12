package spring_quanbanzidong_daili.copy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String xml = "spring_quanbanzidong_daili/copy/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		Service userService = (Service) applicationContext.getBean("service");
		
		userService.add();
		userService.update();
		userService.delete();
	}
}
