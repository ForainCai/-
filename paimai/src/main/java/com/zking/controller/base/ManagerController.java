package com.zking.controller.base;



import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.zking.enetity.admin.Count;
import com.zking.pojo.User;
import com.zking.pojo.UserInfo;
import com.zking.service.UserService;
import com.zking.service.UserinfoService;
import com.zking.util.MD5;


@Controller
@RequestMapping("/manager")
public class ManagerController extends BaseController{
	public HttpSession session;
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
	@RequestMapping("/toupdategeren")
	public ModelAndView toupdategeren( ){
		return new ModelAndView("houjsp/updategeren");
	}
	
	@RequestMapping("/todatecount")
	public ModelAndView todatecount( ){
		return new ModelAndView("houjsp/datecount");
	}
	
	@ResponseBody
	@RequestMapping(value="/checklogin",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public Object checklogin(User u,HttpServletRequest request){		
		JSONObject jsonObject = new JSONObject();	
		session=request.getSession();
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
				Count count=userservice.findcount();
				session.setAttribute("count",count);
				jsonObject.put("msg",1);
			}
		}else{
			jsonObject.put("msg",-1);		
		}
		return jsonObject;
	}
	@RequestMapping("updategeren")
	public String updategeren(HttpServletRequest request){
		User user=(User) session.getAttribute("user");
		int uid=user.getUid();
		int userinfoid=user.getUserinfoId();
		String username=request.getParameter("firstname");		
		String userinfoPhone=request.getParameter("phone");	
		String userinfoMail=request.getParameter("email");
		String userinfoSex=request.getParameter("selection");
		String password=request.getParameter("newpassword");	
		String userinfoCard=request.getParameter("idcard");
		if (password==""||userinfoCard=="") {
			/**
			 * 修改用户
			 */
			User user2=new User();
			user2.setName(username);
			user2.setUid(uid);
			boolean b1= userservice.updateuser(user2);
			/**
			 * 修改用户详细信息
			 */
			UserInfo userinfo=new UserInfo();
			userinfo.setUserinfoMail(userinfoMail);
			userinfo.setUserinfoPhone(userinfoPhone);
			userinfo.setUserinfoSex(userinfoSex);
			userinfo.setUserinfoId(userinfoid);
			boolean b2 =userinfoservice.upuserinfo(userinfo);
			if (b2&&b1) {
				User updateuser=userservice.findbyuid(uid);
				UserInfo updateuserinfo=userinfoservice.findByAllUser(userinfoid);
				session.removeAttribute("user");
				session.removeAttribute("userinfo");
				session.setAttribute("user",updateuser);
				User u=(User) session.getAttribute("user");
				session.setAttribute("userinfo",updateuserinfo);
				session.setAttribute("mgs", "修改成功");
				return "redirect:/manager/toupdategeren";
			}else {
				session.setAttribute("mgs", "修改失败");	
				return "redirect:/manager/toupdategeren";
			}
		}else {
			/**
			 * 查找身份证和用户名匹配
			 */
			if (userinfoCard.equals(userinfoservice.findByAllUser(userinfoid).getUserinfoCard())) {
				/**
				 * 修改用户
				 */
				User user2=new User();
				user2.setName(username);
				user2.setUid(uid);
				user2.setPassword(MD5.MD5Encode(password));
				boolean b1= userservice.updateuserpassword(user2);
				/**
				 * 修改用户详细信息
				 */
				UserInfo userinfo=new UserInfo();
				userinfo.setUserinfoMail(userinfoMail);
				userinfo.setUserinfoPhone(userinfoPhone);
				userinfo.setUserinfoSex(userinfoSex);
				userinfo.setUserinfoId(userinfoid);
				boolean b2 =userinfoservice.upuserinfo(userinfo);
				if (b2&&b1) {
					User updateuser=userservice.findbyuid(uid);
					UserInfo updateuserinfo=userinfoservice.findByAllUser(userinfoid);
					session.removeAttribute("user");
					session.removeAttribute("userinfo");
					session.setAttribute("user",updateuser);
					session.setAttribute("userinfo",updateuserinfo);
					session.setAttribute("mgs", "修改成功");	
					return "redirect:/manager/toupdategeren";
				}else {
					session.setAttribute("mgs", "修改失败");
					return "redirect:/manager/toupdategeren";
				}
			}else {
				session.setAttribute("mgs", "身份证输入错误");
				return "redirect:/manager/toupdategeren";
			}
		}
	}
	@ResponseBody
	@RequestMapping(value="/dayDate",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<Count> dayDate(){	
			List<Count> list=userservice.finddaycount();
			return list;
	}
	@ResponseBody
	@RequestMapping(value="/weekDate",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<Count> weekDate(){	
			List<Count> list=userservice.findweekcount();
			return list;
	}
	@ResponseBody
	@RequestMapping(value="/monthDate",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	public List<Count> monthDate(){	
			List<Count> list=userservice.findmonthcount();
			return list;
	}
}
