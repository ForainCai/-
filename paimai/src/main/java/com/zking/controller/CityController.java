package com.zking.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zking.pojo.Province;

@Controller
@RequestMapping("/city")
public class CityController {

	@ResponseBody
	@RequestMapping(value="/findAllProvince" ,method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<Province> test(ModelMap map){
		
		List<Province> list = new ArrayList<Province>()  ;
		
		Province p = new Province();
		p.setPid(0);
		p.setPname("湖南省");
		Province p1 = new Province();
		p1.setPid(1);
		p1.setPname("湖北省");
		Province p2 = new Province();
		p2.setPid(2);
		p2.setPname("江西省");
		Province p3 = new Province();
		p3.setPid(3);
		p3.setPname("广西省");
		Province p4 = new Province();
		p4.setPid(4);
		p4.setPname("广东省");
		
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		return list;
		
	}
	
	
}
