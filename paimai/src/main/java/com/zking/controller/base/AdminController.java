package com.zking.controller.base;

import java.util.List;




import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zking.enetity.admin.Goods;
import com.zking.pojo.GoodsType;
import com.zking.enetity.admin.User;
import com.zking.service.GoodsService;
import com.zking.service.GoodsTypeService;
import com.zking.service.NewUserService;

@Controller
@RequestMapping("/manager")
public class AdminController extends BaseController{
	@Resource
	private NewUserService newUserService;
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private GoodsTypeService goodsTypeService;
	
	
	
	/**
	 * 查找所有用户信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/findAllUser")
	public ModelAndView findAllUser(ModelMap map){
		List<User> users = null;
		try {
			users = newUserService.findAllUser();
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		System.out.println(users);
		map.addAttribute("users", users);
		return new ModelAndView("houjsp/usermanager");
	}
	
	
	/**
	 * 查找所有物品信息
	 * @param map
	 * @return
	 */
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
	
	
	/**
	 * 查找物品全部类型
	 * @param map
	 * @return
	 */
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
	/**
	 * 删除物品类型
	 * @param goodstype_id
	 * @return
	 */
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
	/**
	 * 跳转至添加物品类型页面
	 * @return
	 */
	@RequestMapping("/toAddGoodsType")
	public String toAddGoodsType(){
		return "houjsp/toaddusertypemanager";
	}
	/**
	 * 添加物品类型
	 * @param request
	 * @return
	 */
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
