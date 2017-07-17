package com.zking.controller.tool;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zking.controller.base.BaseController;
import com.zking.util.Tools;


/**
 * Servlet implementation class ToolContorller
 */
@Controller
@RequestMapping("tool")
public class ToolContorller extends BaseController {
	private static final long serialVersionUID = 1L;
	
	@RequestMapping("VerifyImage")
	public void VerifyImage(HttpServletRequest request, HttpServletResponse response){
		//<img src="${pageContext.request.contextPath }/tool/VerifyImage" id="Yzm" title="看不清，点击刷新"/>
		/*
		 *  $("#Yzm").click(function(){
        $.ajax({
            type:'GET',
            url: '<%=basePath%>tool/VerifyImage',
            success:function(data){
                $("#Yzm").attr("src","<%=basePath%>tool/VerifyImage");
            }
        });
    });
		 * */
		Tools.getVerifyImage(request, response);
	}
	
	

}
