package com.zking.controller.base;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	
	@RequestMapping("/login")
	public ModelAndView tologin( ){
		return new ModelAndView("houjsp/login");
	}
	@RequestMapping("/checklogin")
	public ModelAndView checklogin( ){
		return new ModelAndView("houjsp/login");
	}
	
}
