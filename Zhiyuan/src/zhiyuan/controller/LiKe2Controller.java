package zhiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;
import zhiyuan.service.LiKe2Service;

@Controller
@RequestMapping("/like2")
public class LiKe2Controller {

	@Autowired
	private LiKe2Service liKe2Service;
	
	//查询所有学校
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<LiKe1> list = liKe2Service.findAll();
		model.addAttribute("L2school", list);
		return "forward:/L2school/L2school.jsp";
	}
	
	//查询符合条件的学校
	@RequestMapping("findLiKe2School")
	public String findLiKe2School(String xiancha1, String weici1, String xishu1, Model model) {
		int xiancha = Integer.parseInt(xiancha1);
		int weici = Integer.parseInt(weici1);
		double xishu = Double.parseDouble(xishu1);
		List<Result> list = liKe2Service.findLiKe2School(xiancha,weici,xishu);
		model.addAttribute("LiKe2School", list);
		return "forward:/L2school/LiKe2School.jsp";
	}
}
