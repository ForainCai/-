package com.zking.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.zking.controller.base.BaseController;
import com.zking.pojo.City;
import com.zking.pojo.GoodsType;
import com.zking.pojo.Province;
import com.zking.service.CityService;
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
	
	
	@RequestMapping(value="/toProvince")
	public Object toProvince(){
		return "qianjsp/province";
	}	
	
	//跳转到图片上传页面
	@RequestMapping(value="/topictureOnload")
	public Object toPictureLoad(	HttpServletRequest request){
		
//		return "qianjsp/Test";
		return "qianjsp/pictureLoad";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/checkPicture")
	public Object checkPicture(HttpServletRequest request) throws IOException{
		
//		System.out.println(request.getParameter("goodsName"));
//		System.out.println(request.getParameter("goodsPlace"));
//		System.out.println(request.getParameter("goodstypeId"));
//		System.out.println(request.getParameter("godsInfo"));
     	JsonObject json = Tools.upload(request);
     	String msg = json.get("msg").toString();
     	
     	String filename = json.get("filename").toString();
     	String index = "/";
     	StringBuffer result = new StringBuffer(filename);
     	result.insert(0, index);
     	
     	
//     	logger.info(result);
//     	logger.info(json.get("filename"));
//      logger.info(json.get("msg"));
      
      
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
