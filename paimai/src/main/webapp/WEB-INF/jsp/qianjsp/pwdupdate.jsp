<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script type="text/javascript">
	$("#changepwdButton").click(
			function() {
				$("#changepwd").attr("class","account");
				$("#changeinfo").attr("class","account hidden");
				
			});
	$("#changeinfoButton").click(
			function() {
				$("#changepwd").attr("class","account hidden");
				$("#changeinfo").attr("class","account");
				
			});
	$(function(){
    	
		$("#sub").click(function(){
			var pwd = $("input[name='newpwd1']").val();

			var cpwd = $("input[name='newpwd2']").val();
			if(pwd != cpwd){
				alert("两次密码不一致!");
				$("input[name='newpwd1']").val("");
				$("input[name='newpwd2']").val("");
				return false;
			}
			
			$.ajax( {    
	    	    url:'/mybbs/test/updatepwd?pwd='+pwd,
	    	    type:'post',    
	    	    cache:false,    
	    	    dataType:'json',    
	    	    success:function(data) {
	    	    	 if(data.msg1==-1){
	    	    		 alert("修改成功");
	    	    	 }else if(data.msg2==0){
	    	    		 return false;
	    	    	 }
	    	     },    
	    	     error : function() { 
	    	     }    
	    	});
		});
	});
</script>
<script type="text/javascript">
	$(function() {
		$("input[name='oldpwd']").bind("blur", function() {
			var old = $("input[name='oldpwd']").val();
			$.ajax( {    
	    	    url:'/mybbs/test/checkoldpwd?old='+old,
	    	    type:'post',    
	    	    cache:false,    
	    	    dataType:'json',    
	    	    success:function(data) {
	    	    	 if(data.msg1==-1){
	    	    		 $("#error").attr("style","display:none");
	    	    		 $("#sub").removeAttr("style");
	    	    		 $("#sub").removeAttr("disabled");
	    	    	 }else if(data.msg2==0){	    	    		 
	    	    		$("#error").attr("style","display:block;color: red;font-size: 18px");
	    	    		$("#sub").attr("disabled","disabled");
	    	    		$("#sub").attr("style","background:#000");
	    	    	 }
	    	     },    
	    	     error : function() { 
	    	     }    
	    	});
		})
	});
</script>
</head>
<body>
	<!--account-starts-->
	<div class="account hidden" id="changepwd">
		<div class="container">
			<div class="account-main">
				<div class="col-md-6 account-left">
					<div class="account-bottom">
						<input name="oldpwd" placeholder="原始密码" type="password" tabindex="1" required>
						<input name="newpwd1" placeholder="新密码" type="password" tabindex="2" required>
						<input name="newpwd2" placeholder="重复新密码" type="password" tabindex="3" required>
						<div class="address">
							<input id="sub" type="submit" value="提交">
						</div>
					</div>
				</div>
				<div class="col-md-6 account-left">
				<div class="account-bottom">
					<span id="error" hidden>密码错误</span>
				</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--account-end-->
	<!-- changeinfo -->
	<div id="changeinfo" class="hidden">
		<div class="container">
			<div class="account-main">
				<div class="col-md-6 account-left">
					<div class="account-bottom">
						<input placeholder="昵称" type="text" tabindex="1" required>
						<input placeholder="邮箱" type="text" tabindex="2" required>
						<input placeholder="手机号" type="text" tabindex="3" required>
						<div class="address">
							<input type="submit" value="提交">
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- changeinfo-end -->
</body>
</html>