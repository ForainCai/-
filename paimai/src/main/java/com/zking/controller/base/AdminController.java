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
@RequestMapping("/manager1")
public class AdminController extends BaseController{
	@Resource
	private UserService userService;
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private GoodsTypeService goodsTypeService;
	
	
	
	//�û���������Ա��ѯ�����û�
	@RequestMapping("/findAllUser")
	public ModelAndView findAllUser(ModelMap map){
		List<User> users = null;
		try {
			users = userService.findAllUser();
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		map.addAttribute("users", users);
		return new ModelAndView("houjsp/usermanager");
	}
	
	
	//��Ʒ��������Ա��ѯ������Ʒ
	@RequestMapping("/findAllGoods")
	public ModelAndView findAllGoods(ModelMap map){
		List<Goods> goodss = null;
		try {
			goodss = goodsService.findAllGoods();
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		map.addAttribute("goodss", goodss);
		return new ModelAndView("houjsp/goodsmanager");
	}
	
	
	//��Ʒ���͹�������Ա��ѯ������Ʒ����
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
	//��Ʒ���͹�������Աɾ����Ʒ����
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
	//��Ʒ���͹����������ҳ��
	@RequestMapping("/toAddGoodsType")
	public String toAddGoodsType(){
		return "houjsp/toaddusertypemanager";
	}
	//��Ʒ���͹�������Ա�����Ʒ����
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
