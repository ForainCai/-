package com.zking.controller.base;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zking.pojo.Goods;
import com.zking.pojo.GoodsType;
import com.zking.pojo.User;
import com.zking.service.GoodsService;
import com.zking.service.GoodsTypeService;
import com.zking.service.UserService;

@Controller
@RequestMapping("/manager")
public class AdminController {
	@Resource
	private UserService userService;
	@Resource
	private GoodsService goodsService;
	@Resource
	private GoodsTypeService goodsTypeService;
	
	public GoodsTypeService getGoodsTypeService() {
		return goodsTypeService;
	}

	public void setGoodsTypeService(GoodsTypeService goodsTypeService) {
		this.goodsTypeService = goodsTypeService;
	}

	public GoodsService getGoodsService() {
		return goodsService;
	}

	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}

	public UserService getUserService() {
		return userService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	//用户管理：管理员查询所有用户
	@RequestMapping("/findAllUser")
	public ModelAndView findAllUser(ModelMap map){
		List<User> users = null;
		try {
			users = userService.findAllUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.addAttribute("users", users);
		return new ModelAndView("houjsp/usermanager");
	}
	
	
	//物品管理：管理员查询所有物品
	@RequestMapping("/findAllGoods")
	public ModelAndView findAllGoods(ModelMap map){
		List<Goods> goodss = null;
		try {
			goodss = goodsService.findAllGoods();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.addAttribute("goodss", goodss);
		return new ModelAndView("houjsp/goodsmanager");
	}
	
	
	//物品类型管理：管理员查询所有物品类型
	@RequestMapping("/findAllGoodsType")
	public String findAllGoodsType(ModelMap map){
		List<GoodsType> goodsTypes = null;
		try {
			goodsTypes = goodsTypeService.findAllGoodsType();
		} catch (Exception e) {
			e.printStackTrace();
		}
		map.addAttribute("goodsTypes", goodsTypes);
		return "houjsp/goodstypemanager";
	}
	//物品类型管理：管理员删除物品类型
	@RequestMapping("/deleteGoodsType")
	public String deleteAllGoodsType(String goodstype_id){
		try {
			goodsTypeService.deleteGoodsType(Integer.parseInt(goodstype_id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:findAllGoodsType";
	}
	//物品类型管理：进入添加页面
	@RequestMapping("/toAddGoodsType")
	public String toAddGoodsType(){
		return "houjsp/toaddusertypemanager";
	}
	//物品类型管理：管理员添加物品类型
	@RequestMapping("/addGoodsType")
	public String addGoodsType(HttpServletRequest request){
		String goodstypeName = request.getParameter("goodstypeName");
		GoodsType gt = new GoodsType();
		gt.setGoodstype_name(goodstypeName);
		try {
			goodsTypeService.addGoodsType(gt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
