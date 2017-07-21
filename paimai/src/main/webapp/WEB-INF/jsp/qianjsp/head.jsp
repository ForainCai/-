<%@page import="com.zking.pojo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<link href="<%=basePath %>qianCss/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
 <script src="<%=basePath %>qianCss/js/jquery-1.11.0.min.js"></script>
<link href="<%=basePath %>qianCss/css/style.css" rel="stylesheet" type="text/css" media="all" />	
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<script src="<%=basePath %>qianCss/js/simpleCart.min.js"> </script>
<link href="<%=basePath %>qianCss/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<%=basePath %>qianCss/js/memenu.js"></script>
<script src="<%=basePath %>qianCss/js/jquery.easydropdown.js"></script>
</head>
<body>
	<div class="top-header">
		<div class="container">
			<div class="top-header-main">
				<div class="col-md-6 top-header-left">
						<div class="clearfix">
								
						</div>
					</div>
				</div>
				<div class="col-md-6 top-header-left">
					<div class="cart box_1" style="width:100px;height: 50px;">			
						<% 
						User user = new User();
						user.setUsername("tom");
						session.setAttribute("user",user);
						if(null == user) {%>		
						<a class="clearfix" href="#" style="font-size:15px;color:WHITE;text-decoration:none;float: left;margin-top: 15px;">登录</a>
						<a class="clearfix" href="#" style="font-size:15px;color:WHITE;text-decoration:none;float: right;margin-top: 15px;">注册</a>
						<%}else{ %>
						<div class="cart box_1" style="float: right;">
						<div class="drop">
							<div class="box" style="float: right;">
								<select tabindex="4" class="dropdown drop">
									<option value="" class="label" name="username"><%=user.getUsername() %></option>
									<option value="1">个人信息</option>
									<option value="2">修改密码</option>
								</select>
							</div>
						</div>
						<a href="#" style="text-decoration:none">
							<div class="total">
							<!-- 显示购物车内物品总价 -->
								<span class="simpleCart_total"></span>
							</div>
								<img src="<%=basePath %>qianCss/images/cart-1.png" alt="" />
						</a>
						<div class="clearfix"> </div>
					</div>
						<%} %>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--top-header-->
	

</body>
</html>