package paimai;

import java.util.List;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zking.enetity.admin.Goods;
import com.zking.enetity.admin.User;
import com.zking.service.GoodsService;
import com.zking.service.NewUserService;

public class TestA {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		GoodsService gs = (GoodsService) context.getBean("gsi");
		List<Goods> goods = null;
		try {
			goods = gs.findAllGoodsByGoodsStatus("未审核");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Goods goods2 : goods) {
			System.out.println(goods2);
		}
	}
}
