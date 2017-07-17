<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% 
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登入</title>
<link id="bs-css" href="<%=basePath %>houCss/css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="<%=basePath %>houCss/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="<%=basePath %>houCss/css/charisma-app.css" rel="stylesheet">
	<link href="<%=basePath %>houCss/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='<%=basePath %>houCss/css/fullcalendar.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='<%=basePath %>houCss/css/chosen.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/uniform.default.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/colorbox.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/jquery.cleditor.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/jquery.noty.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/noty_theme_default.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/elfinder.min.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/elfinder.theme.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/opa-icons.css' rel='stylesheet'>
	<link href='<%=basePath %>houCss/css/uploadify.css' rel='stylesheet'>
	<link rel="shortcut icon" href="<%=basePath %>houCss/img/favicon.ico">
</head>
<body>
		<div class="container-fluid">
		<div class="row-fluid">
		
			<div class="row-fluid">
				<div class="span12 center login-header">
					<h2>欢迎使用后台管理系统</h2>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid">
				<div class="well span5 center login-box">
					<div class="alert alert-info">
						请输入你的用户名和密码.
					</div>
					<!-- 修改 -->
					<form class="form-horizontal" action="index.html" method="post">
						<fieldset>
							<div class="input-prepend" title="Username" data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span><input autofocus class="input-large span10" name="username" id="username" type="text" value="admin" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password" data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span><input class="input-large span10" name="password" id="password" type="password" value="admin123456" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend">
							<label class="remember" for="remember"><input type="checkbox" id="remember" />记住密码</label>
							</div>
							<div class="clearfix"></div>

							<p class="center span5">
							<button type="submit" class="btn btn-primary">登录</button>
							</p>
						</fieldset>
					</form>
				</div>
			</div>
				</div>
		
	</div>
	<!-- jQuery -->
	<script src="<%=basePath %>houCss/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="<%=basePath %>houCss/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="<%=basePath %>houCss/houCss/js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="<%=basePath %>houCss/js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="<%=basePath %>houCss/js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="<%=basePath %>houCss/js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="<%=basePath %>houCss/js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="<%=basePath %>houCss/js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="<%=basePath %>houCss/js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="<%=basePath %>houCss/js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="<%=basePath %>houCss/js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="<%=basePath %>houCss/js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="<%=basePath %>houCss/js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="<%=basePath %>houCss/js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="<%=basePath %>houCss/js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="<%=basePath %>houCss/js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src="<%=basePath %>houCss/js/fullcalendar.min.js"></script>
	<!-- data table plugin -->
	<script src="<%=basePath %>houCss/js/jquery.dataTables.min.js"></script>

	<!-- chart libraries start -->
	<script src="<%=basePath %>houCss/js/excanvas.js"></script>
	<script src="<%=basePath %>houCss/js/jquery.flot.min.js"></script>
	<script src="<%=basePath %>houCss/js/jquery.flot.pie.min.js"></script>
	<script src="<%=basePath %>houCss/js/jquery.flot.stack.js"></script>
	<script src="<%=basePath %>houCss/js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="<%=basePath %>houCss/js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="<%=basePath %>houCss/js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="<%=basePath %>houCss/js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="<%=basePath %>houCss/js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="<%=basePath %>houCss/js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="<%=basePath %>houCss/js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="<%=basePath %>houCss/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="<%=basePath %>houCss/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="<%=basePath %>houCss/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="<%=basePath %>houCss/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="<%=basePath %>houCss/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="<%=basePath %>houCss/js/charisma.js"></script>
	
</body>
</html>