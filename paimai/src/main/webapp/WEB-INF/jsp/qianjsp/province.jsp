<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="head.jsp"%>

<style type="text/css">
a {
	text-decoration: none;
}
</style>

<title></title>
</head>
<body onload="Load();">

	<!--start-ckeckout-->
	<div class="container">
		<div class="ckeckout-top">
			<div class="cart-items">
				<div class="in-check">
					<ul class="cart-header">

						<span>省份</span><a id="choice" style="text-decoration:none;color:BLACK;cursor:pointer;margin-left: 1cm" onclick="choiceShen()">全国</a>
						<br>
						<br>
						<table style="margin-left: 2cm">
						        <tbody id="tablelist">
						        
						        </tbody>
						     
						     
						     
						</table>	
						     <br><br>
							<div id="ui"><span>城市：</span></div>
							
							<table style="margin-left: 2cm">
						        <tbody id="tablelist2">
						        </tbody>
						</table>	
						</ul>
				</div>
			</div>
		</div>
	</div>
	<!--end-ckeckout-->
	
<!--上架拍品-->
	<div class="product"> 
		<div class="container">
			<div class="product-top">
				<div class="product-one">
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-1.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-2.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-3.png"  alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-4.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="product-one">
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-5.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-6.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-7.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="col-md-3 product-left">
						<div class="product-main simpleCart_shelfItem">
							<a href="single.html" class="mask"><img class="img-responsive zoom-img" src="<%=basePath %>qianCss/images/p-8.png" alt="" /></a>
							<div class="product-bottom">
								<h3>上架拍品</h3>
								<p>Explore Now</p>
								<h4><a class="item_add" href="#"><i></i></a> <span class=" item_price">$ 329</span></h4>
							</div>
							<div class="srch">
								<span>-50%</span>
							</div>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>					
			</div>
		</div>
	</div>
	<!--end上架拍品-->

	<script type="text/javascript" src="<%=basePath%>qianCss/js/jquery-2.0.0.min.js">
		</script>
	<script type="text/javascript">
	
	
			//获得表对象
		    var table = $("#tablelist");
			var table2 = $("#tablelist2");
	function choiceShen(){
		
	    $("#choice").html("全国");
		Load();
		
	}
	
	
		function test(data) {
			alert('弹出');
		}
		
		function Load(){
			table2.empty();
			var sel = $("#sel").val();
				$.ajax({
					url:"<%=basePath%>city/findAllProvince",
				    type:"post",
				    dataType:"json",
				    success:function(data){
				    	
				    	// 清空
				    	table.empty();
				    	//var tr = $("<tr>");
				    	//table.append(tr);
				    	for(var i=0;i<data.length;i++){
				    		var op =$("<a style='text-decoration:none;color:BLACK;cursor:pointer' name='"+data[i].pid+"' onclick='change(this)'>"+ data[i].pname+'&nbsp&nbsp&nbsp' + "</a>");
				    		table.append(op);
				    	}
				    	//var tr1 = $("</tr>");
				    	//table.append(tr1);
				    }
				});
			}
		function change(data){
			
			table.empty();
			var name = data.text;
			var pid = data.name;
			$("#choice").html(name+"X");
	    	// 清空
	    	table2.empty();
			
			$.ajax({
				url:"<%=basePath%>city/findAllCity",
						type : "post",
						data : "pid=+" + pid + "+",
						dataType : "json",
						success : function(city) {

							//var br = $("<br>");
							//$("#ui").after(br);

							//$("#ui").html();

							for (var i = 0; i < city.length; i++) {
								var op = $("<a style='text-decoration:none;color:BLACK;cursor:pointer' onclick='point(this)'>"
										+ city[i].cname
										+ '&nbsp&nbsp&nbsp'
										+ "</a>");
								table2.append(op);
							}
						}
					});
		}
		function point(data) {

			alert(data.text);

		}
	</script>

</body>
</html>