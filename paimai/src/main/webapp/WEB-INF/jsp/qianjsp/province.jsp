<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
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

	<!--标题按钮-->
	<div class="header-bottom">
		<div class="container">
			<div class="header">
				<div class="col-md-9 header-left">
					<div class="top-nav">
						<ul class="memenu skyblue" id="ul">
						</ul>
					</div>
					<br> <span id="choicetype"></span>&nbsp;类型
					<div class="clearfix"></div>
				</div>
				<div class="col-md-3 header-right">
					<div class="search-bar">
						<input type="text" value="Search" onFocus="this.value = '';"
							onBlur="if (this.value == '') {this.value = 'Search';}">
						<input type="submit" value="">
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!--start-ckeckout-->
	<div class="container">
		<div class="ckeckout-top">
			<div class="cart-items">
				<div class="in-check">
					<ul class="cart-header">
						<span>省份</span>
						<a id="choice"
							style="text-decoration: none; color: BLACK; cursor: pointer; margin-left: 1cm"
							onclick="choiceShen()">全国</a>
						<br>
						<br>
						<table style="margin-left: 2cm">
							<tbody id="tablelist">
							</tbody>
						</table>
						<br>
						<br>
						<div id="ui">
							<span>城市：</span>&nbsp;<span id="choiceSHI"></span>
						</div>
						<br>
						<table style="margin-left: 2cm">
							<tbody id="tablelist2">
							</tbody>
						</table>
					</ul>
					<br>
				</div>
			</div>
		</div>
	</div>
	<!--end-ckeckout-->

	<!--上架拍品-->
	<div class="product">
		<div class="container">
			<div class="product-top">
				<div class="product-one"  id="div">
				</div>
			</div>
		</div>
	</div>
	<!--end上架拍品-->

	<script type="text/javascript"
		src="<%=basePath%>qianCss/js/jquery-2.0.0.min.js"></script>
	<script type="text/javascript">
	
	//获得表对象
    var table = $("#tablelist");
    var table2 = $("#tablelist2");
    var place_id = 0;
    var type_id = 0;
    
    
   function  toChoice(goodsid,buyid){
	   
	   alert(goodsid);
	   alert(buyid);
	  // window.location.href="<%=basePath%>customer/queryGoodsToSingle?goodsId='+goodsid+'&'+;
    	
    }
    
    
 function querydata(place_id,type_id){
    	
    	var div = $("#div");
    	div.empty();
    	$.ajax({
			url:'<%=basePath%>customer/findAllGoods?goodsPlace='
					+place_id+'&goodstypeId='+type_id,
		    type:"post",
		    dataType:"json",
		    success:function(data){
		    	if(data[0].goods.goodsprice){
		    		for(var i=0;i<data.length;i++){
			    		var op =$("<div class='col-md-3 product-left'><div class='product-main simpleCart_shelfItem'>"+
			    				"<a onclick='toChoice("+data[i].goods.goodsId+','+data[i].buylistId+")' style='text-decoration:none;color:BLACK;cursor:pointer' class='mask'><img class='img-responsive zoom-img' src='<%=basePath%>qianCss/img"+data[i].goods.goodsPicture+"' /></a>"+
			    				"<div class='product-bottom'><h3>"+data[i].goods.goodsName+"</h3><p>Explore Now</p><h4><a onclick='toChoice("+data[i].goods.goodsId+','+data[i].buylistId+")' style='text-decoration:none;color:BLACK;cursor:pointer' class='item_add' ><i></i></a><span class='item_price'>$"+data[i].goods.goodsprice+"</span></h4></div>"+
			    				"</div></div>");

			    	    div.append(op);
			    	}
		    		var end = $("<div class='clearfix'></div>");
		    		div.append(end);
		    	}else{
		    		alert("商品为空！！");
		    	}
		    }
		});
    }
	//用户选择完市后，改变city的值
	function choiceShi(data) {
		$("#choiceSHI").html(data.text);
		place_id = data.name;
		
		if(type_id==0){
			querydata(place_id,0);
		}else{
			querydata(place_id,type_id);
		}
	}
    
	function choiceShen(){
		$("#choiceSHI").html("");
		city = 0;
	    $("#choice").html("全国");
		Load();
	}
	
	//用户选择了哪个类型的商品
	function choiceType(data){
		$("#choicetype").html(data.text);
		type_id = data.name;
		if(place_id==0){
			//查询所有的商品类型的物品 无城市
			querydata(0,type_id);
		}else{
			//有城市有商品类型的查询
			querydata(place_id,type_id);
		}
	}
	
	//加载物品种类
	function Loadtype(){
		var ul = $("#ul");
		$.ajax({
			url:"<%=basePath%>customer/findAllGoodType",
		    type:"post",
		    dataType:"json",
		    success:function(data){
		    	// 清空
		    	ul.empty();
		    	for(var i=0;i<data.length;i++){
		    		var op =$("<li class='grid'><a onclick='choiceType(this)' style='text-decoration:none;color:BLACK;cursor:pointer' name='"+data[i].goodstype_id+"'>"+data[i].goodstype_name+"</a></li>");
		    		ul.append(op);
		    	}
		    }
		});
	}
	//加载所有的省份
	function Load(){
			table2.empty();
			var sel = $("#sel").val();
				$.ajax({
					url:"<%=basePath%>customer/findAllProvince",
				    type:"post",
				    dataType:"json",
				    success:function(data){
				    	// 清空
				    	table.empty();
				    	for(var i=0;i<data.length;i++){
				    		var op =$("<a style='text-decoration:none;color:BLACK;cursor:pointer' name='"+data[i].pid+"' onclick='change(this)'>"+ data[i].pname+'&nbsp&nbsp&nbsp' + "</a>");
				    		table.append(op);
				    	}
				    	Loadtype();
				    }
				});
			}
	
	//加载所有的市级
	function change(data){
			
			table.empty();
			var name = data.text;
			var pid = data.name;
			$("#choice").html(name+"X");
	    	// 清空
	    	table2.empty();
			
			$.ajax({
				url:"<%=basePath%>customer/findAllCity",
						type : "post",
						data : "pid=+" + pid + "+",
						dataType : "json",
						success : function(city) {
							for (var i = 0; i < city.length; i++) {
								var op = $("<a style='text-decoration:none;color:BLACK;cursor:pointer' name='"
										+ city[i].cid
										+ "' onclick='choiceShi(this)'>"
										+ city[i].cname
										+ '&nbsp&nbsp&nbsp'
										+ "</a>");
								table2.append(op);
							}
						}
					});
		}
	</script>

</body>
</html>