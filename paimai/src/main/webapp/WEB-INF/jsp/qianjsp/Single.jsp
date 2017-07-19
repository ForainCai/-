<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Single</title>
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
<script>$(document).ready(function(){$(".memenu").memenu();});</script>	
<!--dropdown-->
<script src="<%=basePath %>qianCss/js/jquery.easydropdown.js"></script>	
<script type="text/javascript">
	$(function() {
	
	    var menu_ul = $('.menu_drop > li > ul'),
	           menu_a  = $('.menu_drop > li > a');
	    
	    menu_ul.hide();
	
	    menu_a.click(function(e) {
	        e.preventDefault();
	        if(!$(this).hasClass('active')) {
	            menu_a.removeClass('active');
	            menu_ul.filter(':visible').slideUp('normal');
	            $(this).addClass('active').next().stop(true,true).slideDown('normal');
	        } else {
	            $(this).removeClass('active');
	            $(this).next().stop(true,true).slideUp('normal');
	        }
	    });
	
	});
</script>
</head>
<body>
	<!--top-header-->
	<div class="top-header">
		<div class="container">
			<div class="top-header-main">
				<div class="col-md-6 top-header-left">
					<div class="drop">
						<div class="box">
							
						</div>
						<div class="box1">
							
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-6 top-header-left">
					<div class="cart box_1">
						<a href="#" style="text-decoration:none">
							<div class="total">
							<!-- 显示购物车内物品总价 -->
								<span class="simpleCart_total"></span>
							</div>
								<img src="<%=basePath %>qianCss/images/cart-1.png" alt="" />
						</a>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--end-top-header-->
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
					</div>	
					<div class="col-md-7 single-top-center">
						<div class="single-para simpleCart_shelfItem">
						<h2>上架拍品</h2>
							<div class="star-on">
								<div class="review">
									<span> 1人关注</span>
								</div>
							<div class="clearfix"> </div>
							</div>
							<h5 class="item_price">$ 95.00</h5>
							<div class="available">
								<table class="table-responsive">
										<tbody id="abc">
											<tr>
												<td style="width:100px">开始时间</td>
												<td>xx月xx日xx时</td>
											</tr>
											<tr>
												<td>距开始</td>
												<td>xx时xx分xx秒</td>
											</tr>
											<tr>
												<td>起拍价</td>
												<td>xxxx元</td>
											</tr>
											<tr>
												<td>建议价</td>
												<td>xxxx元</td>
											</tr>
											<tr>
												<td>押金</td>
												<td>xxxx元</td>
											</tr>
										</tbody>
								</table>
							</div>
								<a href="#" class="add-cart item_add" style="width:100px;text-align: center;" >报名</a>
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

</body>
</html>