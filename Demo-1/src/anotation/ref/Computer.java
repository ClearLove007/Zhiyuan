package anotation.ref;

import org.springframework.stereotype.Controller;

@Controller(value="computerId")
public class Computer implements IBrandFactory {

	@Override
	public String get() {
		// TODO �Զ����ɵķ������
		return "�����������Ե�";
	}

}
