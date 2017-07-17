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
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>管理员登录页面</title>
<link rel="stylesheet" href="<%=basePath %>houCss/css/style.default.css" type="text/css" />
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/general.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/index.js"></script>

</head>
<body class="loginpage">
	<div class="loginbox">
    	<div class="loginboxinner">
        	
            <div class="logo">
            	<h1 class="logo">Ama.<span>Admin</span></h1>
				<span class="slogan">管理员登入</span>
            </div><!--logo-->
           
            <br clear="all" /><br />
            <form id="login" action="<%=basePath %>manager/checklogin.do" method="post">
            	
                <div class="username">
                	<div class="usernameinner">
                    	<input type="text" name="username" id="username" placeholder="username"/>
                    </div>
                </div>
                
                <div class="password">
                	<div class="passwordinner">
                    	<input type="password" name="password" id="password" placeholder="password"/>
                    </div>
                </div>
                
                <button onclick="return sub()">登录</button>
                
                <div class="keep"><input type="checkbox" /> 记住密码</div>
            
            </form>
            
        </div><!--loginboxinner-->
    </div><!--loginbox-->

</body>
<script type="text/javascript">
function sub() {
	if ($("input[name=username]").val()==""||$("input[name=password]").val()=="") {
		 alert("用户名或者密码为空，请重新填写")
        return false;
    }
	
	return true;
}
</script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-1.7.min.js"></script>
</html>