package anotation.ref;

import org.springframework.stereotype.Controller;

@Controller(value="computerId")
public class Computer implements IBrandFactory {

	@Override
	public String get() {
		// TODO 自动生成的方法存根
		return "我是生产电脑的";
	}

}
