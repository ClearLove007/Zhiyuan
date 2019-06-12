package anotation.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() {
		String xml = "anotation/ref/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		View view = (View) applicationContext.getBean("viewId");
		System.out.println(view.toString());
	}
}
