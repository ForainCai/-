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
		NewUserService us = (NewUserService) context.getBean("nusi");
		List<User> users = null;
		try {
			users = us.findAllUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (User user : users) {
			System.out.println(user);
		}
	}
}
