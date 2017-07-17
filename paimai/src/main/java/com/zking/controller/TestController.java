package com.zking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zking.controller.base.BaseController;

@Controller
@RequestMapping("test")
public class TestController extends BaseController{
	@RequestMapping("index")
	public String index(){
		return "login/index";
	}
}
