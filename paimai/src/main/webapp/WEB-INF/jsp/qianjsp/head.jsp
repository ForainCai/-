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
						<a class="clearfix" href="#" style="font-size:15px;color:WHITE;text-decoration:none;float: left;margin-top: 15px;">登录</a>
						<a class="clearfix" href="#" style="font-size:15px;color:WHITE;text-decoration:none;float: right;margin-top: 15px;">注册</a>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- logo -->
	<div class="logo">
		<h1 style="font-size:36px">XXX拍卖行</h1>
	</div>
	<!--end-logo-->
<!--标题按钮-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue">
						<li class="grid"><a href="#">房产</a></li>
						<li class="grid"><a href="#">珠宝</a></li>
						<li class="grid"><a href="#">汽车</a></li>
						<li class="grid"><a href="#">奢侈品</a></li>
						<li class="grid"><a href="#">古董</a></li>
						<li class="grid"><a href="#">其他</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="col-md-3 header-right"> 
				<div class="search-bar">
					<input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}">
					<input type="submit" value="">
				</div>
			</div>
			<div class="clearfix"> </div>
			</div>
		</div>
		</div>
	

</body>
</html>