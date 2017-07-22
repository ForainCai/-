package com.zking.controller.paimai;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.zking.controller.base.BaseController;
import com.zking.enetity.Paimai.PaimaiGoodInfo;
import com.zking.enetity.message.paimaiinfo;
import com.zking.pojo.User;
import com.zking.service.Demo;
import com.zking.service.PaimaiService;
import com.zking.service.UserService;
import com.zking.util.MessageSender;
@Controller
@RequestMapping("pai")
public class PaimaiController extends BaseController {
	@Resource
	private PaimaiService paimaiService;
	@Resource
	private MessageSender messagesender;
	@Resource
	private Demo testService;
	@RequestMapping("place")
	public String place(Model model,@Param("buylist_id")Integer buylist_id,HttpServletRequest req){
		User user = new User();
		user.setUid(3);
		user = testService.test(user);
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		
		try {
			PaimaiGoodInfo info = paimaiService.getGoodInfo(buylist_id);
			logger.info(info);
			model.addAttribute("goodinfo", info);
			model.addAttribute("time",300);
		} catch (NullPointerException e) {
			model.addAttribute("error", "空指针异常");
			return "error";
		}
		return "qianjsp/paimai/body";
	}
	
	@RequestMapping(value="/pai.action", produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object pai(HttpServletRequest req){
		HttpSession session = req.getSession();
		paimaiinfo message = new paimaiinfo();
		JsonObject json = new JsonObject();
		message.setUser_id(((User)session.getAttribute("user")).getUid());
		message.setGood_id(Integer.valueOf(req.getParameter("good_id").toString()));
		message.setBuylist_id(Integer.valueOf(req.getParameter("buylist_id").toString()));
		message.setMoney(Double.valueOf(req.getParameter("money").toString()));
		message.setAddmoney(Double.valueOf(req.getParameter("addmoney").toString()));
		if (messagesender.send(new Gson().toJson(message))) {
			logger.info("信息发送成功"+message);
			json.addProperty("result_code", 0);
			json.addProperty("result_msg", "success");
		}else{
			logger.debug("信息发送失败"+message);
			json.addProperty("result_code", -1);
			json.addProperty("result_msg", "message send fail");
		}
		return json;
	}
}
