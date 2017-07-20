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
				$.ajax(
					
				);
			});
	$("#changeinfoButton").click(
			function() {
				$("#changepwd").attr("class","account hidden");
				$("#changeinfo").attr("class","account");
				
			});
</script>
</head>
<body>
	<!--account-starts-->
	<div class="account hidden" id="changepwd">
		<div class="container">
		<div class="account-top heading">
			</div>
			<div class="account-main">
				<div class="col-md-6 account-left">
					<div class="account-bottom">
						<input placeholder="原始密码" type="password" tabindex="1" required>
						<input placeholder="新密码" type="password" tabindex="2" required>
						<input placeholder="重复新密码" type="password" tabindex="3" required>
						<div class="address">
							<input type="submit" value="提交">
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--account-end-->
	<!-- changeinfo -->
	<div id="changeinfo" class="hidden">changeinfo</div>
	<!-- changeinfo-end -->
</body>
</html>