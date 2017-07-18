package com.zking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.zking.util.MessageSender;

@Controller
@RequestMapping("message")
public class MessageController {
	
	@Autowired
    private MessageSender messageSender;
	
	@RequestMapping("post")
	public String post(){
		return "test/post";
	}
	
	@RequestMapping(value = "back", produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object back(HttpServletRequest request){
		JsonObject jo = new JsonObject();
		jo.addProperty("user_id", request.getParameter("user_id"));
		jo.addProperty("buylist_id", request.getParameter("buylist_id"));
		jo.addProperty("money", request.getParameter("money"));
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			messageSender.send(new Gson().toJson(jo));
		}
		return new Gson().toJson(jo);
	}
	
	@RequestMapping(value = "messageback", produces = "application/json; charset=utf-8")
	@ResponseBody
	public Object messageback(HttpServletRequest request){
		JsonObject jo = new JsonObject();
		jo.addProperty("name", request.getParameter("name"));
		return new Gson().toJson(jo);
	}
}
