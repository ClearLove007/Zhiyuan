package anotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnotation {
	@Test
    public  void demo() {
    	String xml = "anotation/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xml);
        DingLei dingLei = (DingLei) context.getBean("dingLei");
        System.out.println( dingLei.toString() );        
    }
}
