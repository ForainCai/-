<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>控制台页面</title>
<link rel="stylesheet" href="<%=basePath %>houCss/css/style.default.css" type="text/css" />
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.flot.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.flot.resize.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.slimscroll.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/general.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/dashboard.js"></script>
</head>
<body>
<div class="bodywrapper">
    <div class="topheader">
        <div class="left">
            <h1 class="logo">Ama.<span>Admin</span></h1>
            <span class="slogan">后台管理系统</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="请输入" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="ajax/notifications.html"><span>9</span></a>
        	</div>-->
            <div class="userinfo">
            	<img src="<%=basePath %>houCss/images/thumbs/avatar.png" alt="" />
                <span>管理员</span>
            </div><!--userinfo-->
            
            <div class="userinfodrop">
            	<div class="avatar">
                	<a href=""><img src="<%=basePath %>houCss/images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	切换主题: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
                <div class="userdata">
                	<h4>${sessionScope.user.username} </h4></br>
                    <span class="email">${sessionScope.userinfo.userinfoMail} </span>
                    <ul>
                    	<li><a href="<%=basePath %>manager/toupdategeren.do">编辑资料</a></li>
                        <li><a href="#">账号设置</a></li>
                        <li><a href="#">帮助</a></li>
                        <li><a href="<%=basePath %>manager/tologin.do">退出</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
    </div><!--topheader-->
    
    <div class="header">
   <ul class="headermenu">
        	<li class="current"><a href="<%=basePath%>manager/tomain"><span class="icon icon-flatscreen"></span>首页</a></li>
            <li><a href="<%=basePath%>manager/tomain"><span class="icon icon-message"></span>查看消息</a></li>
            <li><a href="#"><span class="icon icon-chart"></span>统计报表</a></li>
        </ul>
        
       <div class="headerwidget">
        	<div class="earnings">
            	<div class="one_half">
                	<h4>今天成交金额</h4>
                    <h2>$640</h2>
                </div><!--one_half-->
                <div class="one_half last alignright">
                	<h4>今天成交量 </h4>
                    <h2>500件</h2>
                </div><!--one_half last-->
            </div><!--earnings-->
        </div><!--headerwidget-->
        
    </div><!--header-->
    
    
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="<%=basePath %>manager/findAllUser" class="editor">用户管理</a>  </li>         
            <li><a href="#formsub" class="editor">物品管理</a>  
            <span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="<%=basePath %>manager/findAllGoods">物品信息</a></li>
               		<li><a href="<%=basePath %>manager/findAllGoodsType">物品类型查询</a></li>
               		<li><a href="<%=basePath %>manager/toAddGoodsType">物品类型添加</a></li>
                </ul>
            </li>   
         	<li><a href="#" class="editor">仓库管理</a>  </li>   
         	<li><a href="#formsub2" class="editor">会场管理</a>  
            <span class="arrow"></span>
            	<ul id="formsub2">
               		<li><a href="#">会场类型管理</a></li>
                </ul>
            </li> 
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
    
    
</body>
</html>