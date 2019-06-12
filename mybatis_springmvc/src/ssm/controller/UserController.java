package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.po.User;
import ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findById.do")
	public String findById(String id,Model model) throws Exception {
		User user=userService.findUserById(Integer.valueOf(id));
		System.out.println(id);
		model.addAttribute("user", user);
		return "forward:/NewFile.jsp";
	}
}
