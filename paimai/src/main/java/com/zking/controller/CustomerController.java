package com.zking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zking.pojo.City;
import com.zking.pojo.GoodsType;
import com.zking.pojo.Province;
import com.zking.pojo.User;
import com.zking.service.CityService;
import com.zking.service.GoodsTypeService;
import com.zking.service.ProvinceService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
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
		
		return "qianjsp/pictureLoad";
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
