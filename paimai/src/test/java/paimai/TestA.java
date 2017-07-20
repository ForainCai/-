package paimai;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zking.pojo.Goods;
import com.zking.pojo.User;
import com.zking.service.GoodsService;
import com.zking.service.UserService;

public class TestA {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		GoodsService gs = (GoodsService) context.getBean("gsi");
		List<Goods> g = null;
		try {
			g = gs.findAllGoods();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Goods goods : g) {
			System.out.println(goods);
		}
	}
}
