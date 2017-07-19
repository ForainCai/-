<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<% String path = request.getContextPath(); String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据表格页面</title>
<link rel="stylesheet" href="<%=basePath %>houCss/css/style.default.css" type="text/css" />
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/general.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/tables.js"></script>
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">
<div class="bodywrapper">
	<div class="topheader">
        <div class="left">
           <h1 class="logo">Ama.<span>Admin</span></h1>
            <span class="slogan">后台管理系统</span>
            
            <div class="search">
            	<form action="" method="post">
                	<input type="text" name="keyword" id="keyword" value="Enter keyword(s)" />
                    <button class="submitbutton"></button>
                </form>
            </div><!--search-->
            
            <br clear="all" />
            
        </div><!--left-->
        
        <div class="right">
        	<!--<div class="notification">
                <a class="count" href="notifications.html"><span>9</span></a>
        	</div>
			-->
            <div class="userinfo">
            	<img src="<%=basePath %>houCss/images/thumbs/avatar.png" alt="" />
                <span>Juan Dela Cruz</span>
            </div><!--userinfo-->
            
            <div class="userinfodrop">            	<div class="avatar">
                	<a href=""><img src="<%=basePath %>houCss/images/thumbs/avatarbig.png" alt="" /></a>
                    <div class="changetheme">
                    	Change theme: <br />
                    	<a class="default"></a>
                        <a class="blueline"></a>
                        <a class="greenline"></a>
                        <a class="contrast"></a>
                        <a class="custombg"></a>
                    </div>
                </div><!--avatar-->
				<div class="userdata">
                	<h4>Juan Dela Cruz</h4>
                    <span class="email">youremail@yourdomain.com</span>
                    <ul>
                    	<li><a href="editprofile.html">Edit Profile</a></li>
                        <li><a href="accountsettings.html">Account Settings</a></li>
                        <li><a href="help.html">Help</a></li>
                        <li><a href="index.html">Sign Out</a></li>
                    </ul>
                </div><!--userdata-->
            </div><!--userinfodrop-->
        </div><!--right-->
    </div><!--topheader-->
	<div class="centercontent tables">
        <div id="contentwrapper" class="contentwrapper">
                <div class="contenttitle2">
                	<h3>Dynamic Table</h3>
                </div><!--contenttitle-->
                <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
                    <thead>
                        <tr>
                            <th class="head0">物品类型</th>
                            <th class="head1">操作</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">物品类型</th>
                            <th class="head1">操作</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <c:forEach items="${goodsTypes }" var="goodsTypes">
	                        <tr class="gradeA">
	                        	<td>${goodsTypes.goodstype_name }</td>
	                            <td class="head1" style="width:120px;"><center>
                            <a href="deleteGoodsType?goodstype_id=${goodsTypes.goodstype_id }" class="btn btn_trash"><span>删除</span></a></center></td>
	                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
