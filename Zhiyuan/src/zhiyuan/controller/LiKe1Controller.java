package zhiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;
import zhiyuan.service.LiKe1Service;

@Controller
@RequestMapping("/like1")
public class LiKe1Controller {

	@Autowired
	private LiKe1Service liKe1Service;
	
	//查询所有学校
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<LiKe1> list = liKe1Service.findAll();
		model.addAttribute("L1school", list);
		return "forward:/L1school/L1school.jsp";
	}
	
	//查询符合条件的学校
	@RequestMapping("findLiKe1School")
	public String findLiKe1School(String xiancha1, String weici1, String xishu1, Model model) {
		int xiancha = Integer.parseInt(xiancha1);
		int weici = Integer.parseInt(weici1);
		double xishu = Double.parseDouble(xishu1);
		List<Result> list = liKe1Service.findLiKe1School(xiancha,weici,xishu);
		model.addAttribute("LiKe1School", list);
		return "forward:/L1school/LiKe1School.jsp";
	}
}
