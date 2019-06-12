package zhiyuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;

public interface WenKe2Mapper {

	//1.查询所有学校
	public List<LiKe1> findAll();
	
	//2.查询符合条件的学校资料
	public List<Result> findWenKe2School(@Param("xiancha")int xiancha);
	
}
