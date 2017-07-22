package com.zking.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.zking.controller.base.BaseController;
import com.zking.dao.UserInfoMapper;
import com.zking.dao.UserMapper;
import com.zking.pojo.User;
import com.zking.pojo.UserInfo;

@Controller
@RequestMapping("test")
public class TestController extends BaseController{
	@RequestMapping("index")
	public String index(){
		return "qianjsp/index";
	}
	@RequestMapping("single")
	public String single(){
		return "qianjsp/Single";
	}
	@RequestMapping("personmain")
	public String personmain(){
		return "qianjsp/personmain";
	}
	@Resource
	private UserMapper usermapper;
	@RequestMapping(value="updatepwd" ,method=RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object test(HttpServletRequest req) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		User user = (User) req.getSession().getAttribute("user");
		logger.info(user);
		JsonObject json = new JsonObject();
		Map<String,String[]> reqmap = req.getParameterMap();
		if(reqmap.containsKey("pwd")){
			String pwd = reqmap.get("pwd")[0];
			user.setPassword(pwd);
			usermapper.updateByusername(user);
			json.addProperty("msg1", -1);
		}else{
			json=null;
		}
		return json;
	}
	@RequestMapping(value="checkoldpwd" ,method=RequestMethod.POST, produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object test1(HttpServletRequest req) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		User user = (User) req.getSession().getAttribute("user");
		logger.info(user);
		JsonObject json = new JsonObject();
		Map<String,String[]> reqmap = req.getParameterMap();
		if(reqmap.containsKey("old")){
			String old = reqmap.get("old")[0];
			user.setPassword(old);
			User user1 = usermapper.checkOldPwd(user);
			if(user1!=null){
				json.addProperty("msg1", -1);
			}else if(user1==null){
				json.addProperty("msg2", 0);
			}
		}
		return json;
	}
	@Resource
	private UserInfoMapper userinfomapper;
	UserInfo ui = new UserInfo();
	@RequestMapping("updateinfo")
	public Object test2(HttpServletRequest req,UserInfo ui,ModelAndView mv) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		userinfomapper.udInfo(ui);
		return "修改成功";
	}
}
