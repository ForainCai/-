package com.zking.controller.base;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.zking.pojo.User;
import com.zking.pojo.UserInfo;
import com.zking.service.UserService;
import com.zking.service.UserinfoService;
import com.zking.util.MD5;


@Controller
@RequestMapping("/manager")
public class ManagerController extends BaseController{
	@Resource
	private UserService userservice;
	@Resource
	private UserinfoService userinfoservice;
	
	@RequestMapping("/tologin")
	public ModelAndView tologin( ){
		return new ModelAndView("houjsp/login");
	}
	
	@RequestMapping("/tomain")
	public ModelAndView toindex(){
			return new ModelAndView("houjsp/main");
	}
	@RequestMapping("/to404")
	public ModelAndView to404( ){
		return new ModelAndView("houjsp/notfound");
	}
	
	@ResponseBody
	@RequestMapping(value="/checklogin",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public Object checklogin(User u,HttpServletRequest request){		
		JSONObject jsonObject = new JSONObject();	
		HttpSession session=request.getSession();
		u.setUsertype(1);	
		u.setPassword(MD5.MD5Encode(u.getPassword()));
		u.setUserinfoId(1);
		/**
		 * 查找管理员
		 */
		User user=userservice.findByUser(u);
		if(null != user){
			/**
			 * 查找详细管理员详细信息
			 */
			UserInfo userinfo=userinfoservice.findByAllUser(u.getUserinfoId());
			/**
			 * 修改管理员最近登入时间
			 */
			boolean b =userinfoservice.upuserinfobyuserinfoid(u.getUserinfoId());
			if (b) {				
				session.setAttribute("user",user);
				session.setAttribute("userinfo",userinfo);
				jsonObject.put("msg",1);
			}
		}else{
			jsonObject.put("msg",-1);		
		}
		return jsonObject;
	}
}
