package zhujie.lianxi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WangXingLi implements Person {

	@Value(value = "18")
	private Integer age;
	
	@Value(value = "������")
	private String name;
	
	@Value(value = "Ů")
	private String sex;

	@Override
	public void out() {
		// TODO �Զ����ɵķ������
		System.out.println(name+" "+age+" "+sex);
	}
	
	
}
