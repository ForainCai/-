<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<head>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="<%=basePath %>qianCss/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
<script src="<%=basePath %>qianCss/js/jquery-1.11.0.min.js"></script>
<!--Custom-Theme-files-->
<!--theme-style-->
<link href="<%=basePath %>qianCss/css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--start-menu-->
<script src="<%=basePath %>qianCss/js/simpleCart.min.js"> </script>
<link href="<%=basePath %>qianCss/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="<%=basePath %>qianCss/js/memenu.js"></script>
<!--dropdown-->
<script src="<%=basePath %>qianCss/js/jquery.easydropdown.js"></script>	


<title>图片上传</title>
</head>
<body onload="Load();">
	<!--start-breadcrumbs-->
		<div class="container">
			<div class="breadcrumbs-main">
				<ol class="breadcrumb">
					<li><a href="index.html">Home</a></li>
					<li class="active">图片上传</li>
				</ol>
			</div>
		</div>
	<!--end-breadcrumbs-->
	<!--contact-start-->
		<div class="container">
			<div class="contact-top heading">
				<h3>商品拍卖上传</h3>
			</div>
			<div class="contact-text">
				<div class="col-md-3 contact-left">
					<div class="address">
						<h5>上传须知：</h5>
						<p>
							The company name, <span>Lorem ipsum dolor,</span> Glasglow Dr 40
							Fe 72.
						</p>
					</div>
					
					<img id="Images" alt="" style="width: 200px; height: 200px;src="你自己的透明图片" />
				</div>
				<div class="col-md-9 contact-right">
						<input type="text" placeholder="商品名" id="goodname" style="width: 450px;height: 40px">
						<br><br><br>
						
						<input type="file" placeholder="请选择图片文件" id="images" onchange="put(this)" style="width: 450px;height: 40px">
						
						<br>
							请选择商品类别：&nbsp;<select id="type" class="input w50" style="width: 100px;height: 35px">
								<option value="">商品类别</option>
								<option value="1">Dollar</option>
								<option value="2">Euro</option>
							</select>
						<br><br>
						
						   	请选择商品所在地：&nbsp;
						   	<select class="input w50" onchange="LoadShi(this)" id="sheng" style="width: 100px;height: 35px">
							</select>
							
							<select class="input w50" id="shi" name="city" style="width: 100px;height: 35px">
							</select>
						
						<br><br>
						
						<span>商品详细信息</span>	
						<textarea placeholder="Message" id="area" required=""></textarea>
						<div class="submit-btn">
							<input type="submit" id="tijiao" value="SUBMIT">
						</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	<!--contact-end-->
</body>

	<script type="text/javascript" src="<%=basePath%>qianCss/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript">

$("#tijiao").click(
		function() {
			var goodname = $("#goodname").val();
			var images = $("#images").val();
			var type = $("#type").val();
			var city = $("#city").val();
			var area = $("#area").val();
			
			if (goodname == "" || images == "") {
				alert("不能为空");
			}else {
				$.ajax({
					type : 'post',
					dataType : 'json',
					data : "goodsName=+" + goodname + "goodsPlace=+"+area+"goodstypeId=+"+type+"+",
					url : '<%=basePath%>manager/checklogin?username=' + username + "&password=" + password,
					success : function(data) {					
						
						alert(data.msg);
						
						
						if (data.msg != -1) {
							window.location.href="<%=basePath%>manager/toindex"; 
						}else{
							alert("账号或密码错误！");
						}
					}
				});
			}

		});

 		

		//进来加载省的下拉框
		function Load(){
			
				$.ajax({
					url:"<%=basePath%>customer/findAllProvince",
				    type:"post",
				    dataType:"json",
				    success:function(data){
				    	//获取select 标签
				    	var sheng = $("#sheng");
				    	// 清空
				    	sheng.empty();
				    	for(var i=0;i<data.length;i++){
				    		var op = $("<option  value='"+data[i].pid+"'>"+data[i].pname+"</option>");
				    		sheng.append(op);
				    	}
				    	LoadFirstShi(data[0].pid);
				    	LoadType();
				    }
				});
			}
		
   		//刚开始进来第一次加载市选项
		function  LoadFirstShi(data){
			
			$.ajax({
				url:"<%=basePath%>customer/findAllCity",
						type : "post",
						data : "pid=+" + data + "+",
						dataType : "json",
						success : function(data) {
							//获取select 标签
					    	var shi = $("#shi");
					    	// 清空
					    	shi.empty();

							for(var i=0;i<data.length;i++){
					    		var op = $("<option  value='"+data[i].cid+"'>"+data[i].cname+"</option>");
					    		shi.append(op);
					    	}
						}
					});
		}
   		
   		//循环打出市
		function LoadShi(data){
			$.ajax({
				url:"<%=basePath%>customer/findAllCity",
						type : "post",
						data : "pid=+" + data.value + "+",
						dataType : "json",
						success : function(data) {
							//获取select 标签
					    	var shi = $("#shi");
					    	// 清空
					    	shi.empty();

							for(var i=0;i<data.length;i++){
					    		var op = $("<option  value='"+data[i].cid+"'>"+data[i].cname+"</option>");
					    		shi.append(op);
					    	}
						}
					});
		}
   		
   		//加载商品类型
   		function LoadType(){
   			
   			$.ajax({
				url:"<%=basePath%>customer/findAllGoodType",
						type : "post",
						dataType : "json",
						success : function(data) {
							//获取select 标签
					    	var type = $("#type");
					    	// 清空
					    	type.empty();

							for(var i=0;i<data.length;i++){
					    		var op = $("<option  value='"+data[i].goodstype_id+"'>"+data[i].goodstype_name+"</option>");
					    		type.append(op);
					    	}
						}
					});
   		}
   		
   		
   		//把图片放入左边边的img中
   		function put(data) {

   			picture = data;
   			$("#url1").val(data.value);

   			showImage(data);
   		}
   	
   		function showImage(obj) {

   			var newPreview = document.getElementById("Images");
   			if (obj) {
   				//ie
   				if (window.navigator.userAgent.indexOf("MSIE") >= 1) {
   					obj.select();
   					newPreview.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);";
   					newPreview.filters
   							.item("DXImageTransform.Microsoft.AlphaImageLoader").src = document.selection
   							.createRange().text;
   					return;
   				}
   				//firefox
   				else if (window.navigator.userAgent.indexOf("Chrome") >= 1) {
   					if (obj.files) {
   						newPreview.src = window.URL.createObjectURL(obj.files
   								.item(0));
   						return;
   					}
   					newPreview.src = obj.value;
   					return;
   				}else if (window.navigator.userAgent.indexOf("Firefox") >= 1) {
   					if (obj.files) {
   						newPreview.src = window.URL.createObjectURL(obj.files
   								.item(0));
   						return;
   					}
   					newPreview.src = obj.value;
   					return;
   				}
   				newPreview.src = obj.value;
   				return;
   			}
   			
   		}
   		
		
		
	   
</script>



</html>