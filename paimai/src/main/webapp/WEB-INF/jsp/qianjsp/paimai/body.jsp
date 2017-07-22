<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.util.Date"%>
<%@page import="com.zking.pojo.BuyList"%>
<%@page import="com.zking.pojo.GoodsType"%>
<%@page import="com.zking.pojo.Goods"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.zking.enetity.Paimai.PaimaiGoodInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../head.jsp" %>
<%
PaimaiGoodInfo message = null;
Goods good = null;
GoodsType goodtype = null;
BuyList buylistitem = null;
message = (PaimaiGoodInfo)request.getAttribute("goodinfo");

	if(message != null){
		buylistitem = message.getBuylist();
		good = message.getGood();
		goodtype = message.getGoodstype();
	}
%>
<!--start-logo-->
	<div class="logo">
		<h1 style="font-size: 36px">XX拍卖网</h1>
	</div>
	<!--end-start-logo-->
	<!--start-single-->
	<div class="single contact">
		<div class="container">
			<div class="single-main">
				<div class="col-md-9 single-main-left">
				<div class="sngl-top">
					<div class="col-md-5 single-top-left">	
						<div class="flexslider">
							  <ul class="slides">
								<li data-thumb="<%=basePath %>qianCss/images/s-1.jpg">
									<div class="thumb-image"> <img src="<%=basePath %>qianCss/images/s-1.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li>
								<li data-thumb="<%=basePath %>qianCss/images/s-2.jpg">
									 <div class="thumb-image"> <img src="<%=basePath %>qianCss/images/s-2.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li>
								<li data-thumb="<%=basePath %>qianCss/images/s-3.jpg">
								   <div class="thumb-image"> <img src="<%=basePath %>qianCss/images/s-3.jpg" data-imagezoom="true" class="img-responsive" alt=""/> </div>
								</li> 
							  </ul>
						</div>
						<!-- FlexSlider -->
						<script src="<%=basePath %>qianCss/js/imagezoom.js"></script>
						<script defer src="<%=basePath %>qianCss/js/jquery.flexslider.js"></script>
						<link rel="stylesheet" href="<%=basePath %>qianCss/css/flexslider.css" type="text/css" media="screen" />

						<script>
						// Can also be used with $(document).ready()
						$(window).load(function() {
						  $('.flexslider').flexslider({
							animation: "slide",
							controlNav: "thumbnails"
						  });
						});
						</script>
						<style type="text/css">  
							#backpage{  
							   width:450px;  
							   border:1px solid #6C9C2C;  
							   height:25px;  
							 } 
							#bar{  
							   background:red;  
							   float:left; 
							   height:100%;  
							   text-align:center;  
							   line-height:150%; 
							 }  
						</style> 
						<script>
							var bar = $("#bar"); 
				        	var total = $("#total");
							var second = <%=Double.valueOf(request.getAttribute("time").toString())%>; // 剩余秒数
							var temp = second;
							var mint = second / 60 % 60;
							var hour = (second / 60 - mint ) / 60 % 24;
							// 写一个方法，将秒数专为天数
							var tomins = function(){
								var s = second % 60; // 秒
								var mi = (second - s) / 60 % 60; // 分钟
								return mi + "分" + s + "秒";
							}
							var tosecs = function(){
								var s = second % 60; // 秒
								var mi = (second - s) / 60 % 60; // 分钟
								mint = mi
								return  s + "秒";
							}
							var tohours = function(){
								var s = second % 60; // 秒
								var mi = (second - s) / 60 % 60; // 分钟
								var h = ((second - s) / 60 - mi ) / 60 % 24;
								hour = h;
								mint = mi;
								return h + "小时" + mi + "分钟" + s + "秒";
							}
							//然后写一个定时器
							
							window.setInterval(function(){
								var barw = parseInt($("#backpage").css('width'));
								if(second==0){
									return;
								}else if(hour==0&&mint==0){
									document.getElementById("endtime").innerHTML = tosecs ();
								}else if(hour==0){
									document.getElementById("endtime").innerHTML = tomins ();
								}else{
									document.getElementById("endtime").innerHTML = tohours ();
								}
								$("#bar").css('width',(second/temp)*barw);
								total.innerHTML = $("#bar").css('width');
								second --;
								}, 1000);
						</script>
					</div>	
					<div class="col-md-7 single-top-center">
						<div class="single-para simpleCart_shelfItem">
						<h2><%=good.getGoodsName() %></h2>
							<div class="star-on">
								<div class="review">
									<span> 1人关注</span>
								</div>
							<div class="clearfix"> </div>
							</div>
							<h5 class="item_price">￥<%=buylistitem.getBuylistPrice() %></h5>
							<div class="available">
								<table class="table-responsive">
										<tbody id="abc">
											<tr>
												<td style="width:100px">开始时间</td>
												<td><% 
														Date date =  buylistitem.getBuylistBuytime(); 
														SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy年MM月dd日 HH时");
													%><%=dateFormater.format(date) %></td>
											</tr>
											<tr>
												<td>每次加价</td>
												<td>1000元</td>
											</tr>
											<tr>
												<td style="color: red;font-size: 20px">结束时间</td>
												
												<td id="endtime" style="color: red;font-size: 20px">
												</td>
											</tr>
											<tr>
												<td colspan="2"><div id="backpage"> 
													   <div id="bar" style="width:100%;"></div>  
													  </div> <span id="total"></span>  </td>
											</tr>
											<tr>
												<td>建议价</td>
												<td>xxxx元</td>
											</tr>
											<tr>
												<td>现在最高价</td>
												<td>xxxx元</td>
											</tr>
										</tbody>
								</table>
							</div>
								<a href="#" class="add-cart item_add" style="width:100px;text-align: center;" id="pai" >拍</a>
								<script>
									$("#pai").click(function(){
										$.ajax({
								             type: "post",
								             url: "<%=basePath%>pai/pai.action",
								             data: {buylist_id:<%=buylistitem.getBuylistId()%>,user_id:<%=user.getUid()%>, good_id:<%=good.getGoodsId()%>,money:<%=buylistitem.getBuylistPrice()%>,addmoney:1000},
								             dataType: "json",
								             success: function(data){
								            	 alert("result_code:"+data.result_code+"   result_msg:"+data.result_msg);
								            	 window.location.reload();
								                      }
								         });
									});
								</script>
						</div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
				<div class="col-md-3 single-right">
						<section class="sky-form">
							<img class="img-responsive"
							src="<%=basePath%>qianCss/images/s-3.jpg"> 
						</section>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!--end-single-->
	<!-- 拍卖须知 -->
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<img alt="" src="<%=basePath%>qianCss/images/s-3.jpg">
				</div>
				<div class="col-lg-6"></div>
				<div class="col-lg-6"></div>
			</div>
		</div>

<%@ include file="foot.jsp"%>
</body>
</html>