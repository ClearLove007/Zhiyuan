package zhiyuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;
import zhiyuan.service.WenKe1Service;

@Controller
@RequestMapping("/wenke1")
public class WenKe1Controller {
	
	@Autowired
	private WenKe1Service wenKe1Service;
	
	//查询所有学校
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<LiKe1> list = wenKe1Service.findAll();
		model.addAttribute("W1school", list);
		return "forward:/W1school/W1School.jsp";
	}
	
	//查询符合条件的学校
	@RequestMapping("findWenKe1School")
	public String findWenKe1School(String xiancha1, String weici1, String xishu1, Model model) {
		int xiancha = Integer.parseInt(xiancha1);
		int weici = Integer.parseInt(weici1);
		double xishu = Double.parseDouble(xishu1);
		List<Result> list = wenKe1Service.findWenKe1School(xiancha,weici,xishu);
		model.addAttribute("WenKe1School", list);
		return "forward:/W1school/WenKe1School.jsp";
	}
}
