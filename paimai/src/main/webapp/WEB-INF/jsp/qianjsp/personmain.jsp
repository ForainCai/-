<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<%@ include file="head.jsp" %>
</head>
<body>
	<!-- logo -->
	<div class="logo">
		<h1 style="font-size:36px">XXX拍卖网</h1>
	</div>
	<!--end-logo-->
	<!--标题按钮-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
				<div class="top-nav">
					<ul class="memenu skyblue">
						<li class="grid"><a href="#" style="color: red" alt="">返回首页</a></li>
						<li class="grid"><a href="#" id="changepwdButton">修改密码</a></li>
						<li class="grid"><a href="#" id="changeinfoButton">修改个人信息</a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
		</div>
		</div>
	<!--标题按钮-->
	<%@ include file="pwdupdate.jsp" %>
</body>
</html>