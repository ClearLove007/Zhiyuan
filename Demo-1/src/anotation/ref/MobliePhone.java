package anotation.ref;

import org.springframework.stereotype.Controller;

@Controller(value="phoneId")
public class MobliePhone implements IBrandFactory {

	@Override
	public String get() {
		// TODO �Զ����ɵķ������
		return "���������ֻ���";
	}

}
