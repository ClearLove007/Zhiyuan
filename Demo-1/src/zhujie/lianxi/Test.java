package zhujie.lianxi;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@org.junit.Test
	public void demo() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String xml = "zhujie/lianxi/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
		WangXingLi wangXingLi = (WangXingLi) applicationContext.getBean("wangXingLi");
		wangXingLi.out();
	}
}
