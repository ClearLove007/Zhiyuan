package zhiyuan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zhiyuan.mapper.WenKe2Mapper;
import zhiyuan.model.LiKe1;
import zhiyuan.model.Result;

@Service
public class WenKe2ServiceImpl implements zhiyuan.service.WenKe2Service {

	@Autowired
	private WenKe2Mapper wenKe2Mapper;
	
	@Override
	public List<LiKe1> findAll() {
		// TODO 自动生成的方法存根
		return wenKe2Mapper.findAll();
	}

	@Override
	public List<Result> findWenKe2School(int xiancha, int weici, double xishu) {
		// TODO 自动生成的方法存根
		List<Result> list = wenKe2Mapper.findWenKe2School(xiancha);
		if(!list.isEmpty()) {
			for(Result attribute : list) {
				int i=0,j=0,k=0,l=0;

					if(attribute.getXiancha1()!=0 && xiancha >= attribute.getXiancha1()) {
						i++;
					}
					if(attribute.getXiancha2()!=0 && xiancha >= attribute.getXiancha2()) {
						i++;
					}
					if(attribute.getXiancha3()!=0 && xiancha >= attribute.getXiancha3()) {
						i++;
					}
					if(attribute.getXiancha4()!=0 && xiancha >= attribute.getXiancha4()) {
						i++;
					}
					if(xiancha >= attribute.getAverxiancha()) {
						i++;
					}
					attribute.setXiancha(i);
				
				
					if(attribute.getWeici1()!=0 && weici <= attribute.getWeici1()) {
						j++;
					}
					if(attribute.getWeici2()!=0 && weici <= attribute.getWeici2()) {
						j++;
					}
					if(attribute.getWeici3()!=0 && weici <= attribute.getWeici3()) {
						j++;
					}
					if(attribute.getWeici4()!=0 && weici <= attribute.getWeici4()) {
						j++;
					}
					if(weici <= attribute.getAverweici()) {
						j++;
					}
					attribute.setWeici(j);
				
				
					if(attribute.getXishu1()!=0 && xishu >= attribute.getXishu1()) {
						k++;
					}
					if(attribute.getXishu2()!=0 && xishu >= attribute.getXishu2()) {
						k++;
					}
					if(attribute.getXishu3()!=0 && xishu >= attribute.getXishu3()) {
						k++;
					}
					if(attribute.getXishu4()!=0 && xishu >= attribute.getXishu4()) {
						k++;
					}
					if(xishu >= attribute.getAverxishu()) {
						k++;
					}
					attribute.setXishu(k);
				
					if(attribute.getXiancha1()!=0) {
						l++;
					}
					if(attribute.getXiancha2()!=0) {
						l++;
					}
					if(attribute.getXiancha3()!=0) {
						l++;
					}
					if(attribute.getXiancha4()!=0) {
						l++;
					}
					attribute.setNian(l);
			}
		}
		System.out.println("list的大小为："+list.size());
		return list;
	}

}
