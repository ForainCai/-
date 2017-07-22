<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

 <%@ include file="index.jsp"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>编辑个人资料</title>

</head>
<script type="text/javascript">
	window.onload = function(){
    var opts = document.getElementById("selection");
    var value =  "${sessionScope.userinfo.userinfoSex}";
	if(value!=""){
		for(var i=0;i<opts.options.length;i++){
     		 if(value==opts.options[i].value){
            	  opts.options[i].selected = 'selected';
               break;
       		 }
    	 }
    }
}
</script>
<script type="text/javascript">
	function sub(){
		var pwd1=document.getElementById("password1").value;
		var pwd2=document.getElementById("newpassword").value;
		var idcarde=document.getElementById("idcard").value;
			if (pwd1!=""||pwd2!="") {			
				if (idcarde!="") {			
					if (pwd2==pwd1) {
						return true;
					}else {
						alert("两次输入的密码不一样")		
						return false;
					}
				}else {
					alert("身份证不能为空")		
				return false;
			}
		}else {
			return true;
		}
	}
</script>
<body>
<div class="bodywrapper">
	<div class="centercontent">
    	 <div class="pageheader">
            <h1 class="pagetitle">资料编辑</h1>
            <span class="pagedesc">用户名：&nbsp;&nbsp;${sessionScope.user.username}</span> 
            <ul class="hornav">
                <li class="current"><a href="#default">Default</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        	<div id="default" class="subcontent">
                    <!-- START OF DEFAULT WIZARD -->
                    <form class="stdform" method="post" action="<%=basePath%>manager/updategeren" id="Form">
                    <div id="wizard" class="wizard">
                    	<br />
                        <ul class="hormenu">
                            <li>
                            	<a href="#wiz1step1">
                                	<span class="h2">Step 1</span>
                                    <span class="dot"><span></span></span>
                                    <span class="label">Basic Information</span>
                                </a>
                            </li>
                            <li>
                            	<a href="#wiz1step2">
                                	<span class="h2">Step 2</span>
                                    <span class="dot"><span></span></span>
                                    <span class="label">High-ranking Information</span>
                                </a>
                            </li>
                        </ul>                       
                        <br clear="all" /><br /><br />                      	
                        <div id="wiz1step1" class="formwiz">
                        	<h4>Step 1: Basic Information</h4>                        	
                                <p>
                                    <label>昵&nbsp;&nbsp;&nbsp;&nbsp;称:</label>
                                    <span class="field"><input type="text" name="firstname" id="firstname" class="longinput" value="${sessionScope.user.name}"/></span>
                                </p>  
                                 <p>
                                    <label>电话号码:</label>
                                    <span class="field"><input type="text" name="phone" id="phone" class="longinput" value="${sessionScope.userinfo.userinfoPhone}"/></span>
                                </p>                              
                                <p>
                                    <label>邮&nbsp;&nbsp;&nbsp;&nbsp;箱:</label>
                                    <span class="field"><input type="text" name="email" id="email" class="email" value="${sessionScope.userinfo.userinfoMail}"/></span>
                                </p>                                                              
                                <p>
                                    <label>性&nbsp;&nbsp;&nbsp;&nbsp;别:</label>
                                    <span class="field"><select name="selection" id="selection">
                                        <option value="默认" selected = "selected">Choose One</option>
                                        <option value="男">Female</option>
                                        <option value="女">Male</option>
                                    </select></span>
                                </p>                         
                        </div><!--#wiz1step1-->                        
                        <div id="wiz1step2" class="formwiz">
                        	<h4>Step 2: High-ranking Information</h4>          
                                <p>
                                    <label>密码</label>
                                    <span class="field"><input type="password" name="password1"  id="password1"/></span>
                                </p>
                                <p>
                                    <label>密码确认</label>
                                    <span class="field"><input type="password" name="newpassword" id="newpassword"/></span>
                                </p>  
                                 <p>
                                    <label>身份证确认</label>
                                    <span class="field"><input type="text" name="idcard" class="idcard" id="idcard"/></span>
                                </p>                                                                                         
                        </div><!--#wiz1step2-->                    
                        </div><!--#wizard-->
                        <div id="wiz1step3" class="formwiz">
                       		 <center>
                        		<button class="stdbtn btn_orange" onclick='return sub()'>确认修改</button>
                        	 </center>
                        </div>
                        <div id="wiz1step3" class="formwiz">
                       		 <center>
                        		<h4 style="color: red">${mgs}</h4>
                        	 </center>
                        </div>
                    </form>                                         
                    <!-- END OF DEFAULT WIZARD -->                  
                    <br /><br />                   
            </div><!-- #default -->
        </div>
    </div>
  </div>
</body>
</html>