<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <%@ include file="index.jsp"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>404错误提示页面</title>
<link rel="stylesheet" href="<%=basePath %>houCsscss/style.default.css" type="text/css" />
<script type="text/javascript" src="<%=basePath %>houCssjs/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCssjs/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCssjs/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=basePath %>houCssjs/custom/general.js"></script>
</head>
<body>
  <div class="centercontent">
    	<div class="welinfo">
    		<span><img src="<%=basePath %>houCss/images/sun.png" alt="天气" /></span>
   			 <h4>早上好，欢迎&nbsp;&nbsp;${sessionScope.user.name}&nbsp;&nbsp;使用自动化拍卖系统</h4>
   		 </div>  
    	<div class="welinfo">
    		<span><img src="<%=basePath %>houCss/images/time.png" alt="时间" /></span>
   			 <h4>您上次登录的时间：${sessionScope.userinfo.userinfoTime}（不是您登录的？<a href="#">请点这里）</a></h4>
    	</div>	
    	<div style="display: none">
    			<form action="" method="post">
    				<input type="text" >
    			</form>
    	</div>
	</div><!--bodywrapper-->
</body>
</html>