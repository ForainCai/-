package com.zking.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;
import com.zking.controller.base.BaseController;
import com.zking.enetity.customer.buylist;
import com.zking.pojo.City;
import com.zking.pojo.Goods;
import com.zking.pojo.GoodsType;
import com.zking.pojo.Province;
import com.zking.pojo.User;
import com.zking.service.CityService;
import com.zking.service.CustomerGoods;
import com.zking.service.GoodsService;
import com.zking.service.GoodsTypeService;
import com.zking.service.ProvinceService;
import com.zking.util.Tools;

@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController {
	
	
	@Resource
	private ProvinceService proviceService;
	
	@Resource
	private CityService cityService;
	
	@Resource
	private GoodsTypeService goodsTypeService;
	
	@Resource
	private GoodsService goodsService;
	
	@Resource
	private CustomerGoods customerGoods;
	
	@RequestMapping(value="/queryGoodsToSingle")
	public List<buylist> queryGoodsToSingle(){
		//List<buylist> list = customerGoods.findAllBuyList(good);
		
		return null;
	}	
	
	@ResponseBody
	@RequestMapping(value="/findAllGoods")
	public List<buylist> findAllGoods(Goods good){
		List<buylist> list = customerGoods.findAllBuyList(good);
		if(list.size()==0){
			buylist buy = new buylist();
			good.setGoodsprice(0);
			buy.setGoods(good);
			list.add(buy);
		}
		return list;
	}	
	@RequestMapping(value="/toProvince")
	public Object toProvince(){
		return "qianjsp/province";
	}	
	
	//跳转到图片上传页面
	@RequestMapping(value="/topictureOnload")
	public Object toPictureLoad(	HttpServletRequest request){
		return "qianjsp/pictureLoad";
	}
	
	@ResponseBody
	@RequestMapping(value="/checkPicture")
	public Object checkPicture(Goods good,HttpServletRequest request) throws IOException{
		HttpSession session  = request.getSession();
		User user1 = new User();
		user1.setUid(2);
		session.setAttribute("user", user1);
		User user = (User) session.getAttribute("user");
		//上传图片
     	JsonObject json = Tools.upload(request);
     	String msg = json.get("msg").getAsString();
     	if(msg.equals("上传成功")){
     		String filename = json.get("filename").getAsString();
     		String index = "/";
     		StringBuffer str = new StringBuffer(filename);
     		str.insert(0, index);
     		
     		good.setGoodsPicture(str.toString());
     		good.setUid(user.getUid());
     		good.setGoodsStatus(0);
     		int result = goodsService.customerInsertGoods(good);
     		logger.info(result);
     		if(result==1){
     			return json;
     		}
     	}
	   return  json; 
		
	}
	@ResponseBody
	@RequestMapping(value="/findAllGoodType" ,method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<GoodsType> findAllGoodType() throws Exception{
			return goodsTypeService.findAllGoodsType();
	}
	
	@ResponseBody
	@RequestMapping(value="/findAllProvince" ,method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<Province> findAllProvince(){
		return proviceService.findAllProvince();
	}
	
	@ResponseBody
	@RequestMapping(value="/findAllCity" ,method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<City> findeAllCity(int pid){
		return cityService.findAllCity(pid);
	}
	
	
	
	
	
	
}
