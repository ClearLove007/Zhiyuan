package anotation.ref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value="viewId")
public class View {

	@Autowired
	@Qualifier(value="computerId")
	private IBrandFactory computer;

	@Autowired
	@Qualifier(value="phoneId")
	private IBrandFactory phone;
	
	public String toString() {
		return phone.get() + computer.get();
	}
}
