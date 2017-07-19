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
   <div class="topheader orangeborderbottom5">
   <div class="contentwrapper padding10">
    	<div class="errorwrapper error404">
        	<div class="errorcontent">
                <h1>404 Page Not Found</h1>
                <h3>We couldn't find that page. It appears that you are lost.</h3>
                
                <p>The page you are looking for is not found. This could be for several reasons</p>
                <ul>
                    <li>It never existed.</li>
                    <li>It got deleted for some reason.</li>
                    <li>You were looking for something that is not here.</li>
                    <li>You like this page.</li>
                </ul>
                   <ul>
                    <li>It never existed.</li>
                    <li>It got deleted for some reason.</li>
                    <li>You were looking for something that is not here.</li>
                    <li>You like this page.</li>
                </ul>
                <br />
                <button class="stdbtn btn_black" onclick="history.back()">Go Back to Previous Page</button> &nbsp; 
                <button onclick="location.href='dashboard.html'" class="stdbtn btn_orange">Go Back to Dashboard</button>
            </div><!--errorcontent-->
        </div><!--errorwrapper-->
    </div>    
    
    
</div><!--bodywrapper-->
</body>
</html>