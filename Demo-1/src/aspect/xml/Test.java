package aspect.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String xml = "aspect/xml/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
		
		userService.add();
		userService.delete();
		userService.update();
	}
}
