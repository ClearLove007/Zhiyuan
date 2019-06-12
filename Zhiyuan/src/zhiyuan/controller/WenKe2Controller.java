package zhiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;
import zhiyuan.service.WenKe2Service;

@Controller
@RequestMapping("/wenke2")
public class WenKe2Controller {

	@Autowired
	private WenKe2Service wenKe2Service;
	
	//查询所有学校
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<LiKe1> list = wenKe2Service.findAll();
		model.addAttribute("W2school", list);
		return "forward:/W2school/W2school.jsp";
	}
	
	//查询符合条件的学校
	@RequestMapping("findWenKe2School")
	public String findWenKe2School(String xiancha1, String weici1, String xishu1, Model model) {
		int xiancha = Integer.parseInt(xiancha1);
		int weici = Integer.parseInt(weici1);
		double xishu = Double.parseDouble(xishu1);
		List<Result> list = wenKe2Service.findWenKe2School(xiancha,weici,xishu);
		model.addAttribute("WenKe2School", list);
		return "forward:/W2school/WenKe2School.jsp";
	}
}
