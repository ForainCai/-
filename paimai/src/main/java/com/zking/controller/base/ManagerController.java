package com.zking.controller.base;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.zking.pojo.User;
import com.zking.service.UserService;


@Controller
@RequestMapping("/manager")
public class ManagerController {
	@Resource
	private UserService userservice;
	
	@RequestMapping("/tologin")
	public ModelAndView tologin( ){
		return new ModelAndView("houjsp/login");
	}
	@RequestMapping("/checklogin")
	public ModelAndView checklogin( ){
		return new ModelAndView("houjsp/login");
	}
	@RequestMapping("/toindex")
	public ModelAndView toindex( ){
		return new ModelAndView("houjsp/index");
	}
	@RequestMapping("/to404")
	public ModelAndView to404( ){
		return new ModelAndView("houjsp/notfound");
	}
	
	@ResponseBody
	@RequestMapping(value="/checklogin",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public Object checklogin(User u){	
		
		
		JsonObject jsonObject = new JsonObject();
		
//		List<Object> list = new ArrayList<>();	
		u.setUsertype(1);	
		boolean b=userservice.findByUsernamePasswod(u);
		if(b){
			jsonObject.addProperty("msg",1);
		}else{
			jsonObject.addProperty("msg",-1);		
		}
		return jsonObject;
	}
	
}
