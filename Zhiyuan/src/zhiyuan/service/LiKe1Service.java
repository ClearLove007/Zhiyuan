package zhiyuan.service;

import java.util.List;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;

public interface LiKe1Service {

	//1.查询所有学校
	public List<LiKe1> findAll();
	
	//2.查询符合条件的学校
	public List<Result> findLiKe1School(int xiancha, int weici, double xishu);
}
