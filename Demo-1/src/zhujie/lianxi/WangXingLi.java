package zhujie.lianxi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WangXingLi implements Person {

	@Value(value = "18")
	private Integer age;
	
	@Value(value = "王兴利")
	private String name;
	
	@Value(value = "女")
	private String sex;

	@Override
	public void out() {
		// TODO 自动生成的方法存根
		System.out.println(name+" "+age+" "+sex);
	}
	
	
}
