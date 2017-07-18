package com.zking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zking.pojo.City;
import com.zking.pojo.Province;
import com.zking.service.CityService;
import com.zking.service.ProvinceService;

@Controller
@RequestMapping("/city")
public class CityController {
	
	
	@Resource
	private ProvinceService proviceService;
	
	@Resource
	private CityService cityService;
	
	@RequestMapping(value="/toProvince")
	public Object toProvince(){
		return "qianjsp/province";
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
