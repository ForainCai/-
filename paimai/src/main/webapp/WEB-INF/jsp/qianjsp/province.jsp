<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ include file="head.jsp"%>



<title></title>
</head>
<body onload="change();">

	<div class="ckeckout">
		<div class="container">

			<div class="ckeck-top heading">
				<h3>商品浏览</h3>
			</div>

			<ul class="memenu skyblue">
				<li class="grid"><button href='index.html' class='btn-default'
						style='width: 60px; height: 30px' onclick='test(this)' value="房产">房产</button></li>
				<li class="grid"><button class="btn-default"
						style="position: relative; width: 60px; height: 30px;"
						onclick="test(this)">珠宝</button></li>
				<li class="grid"><button class="btn-default"
						style="width: 60px; height: 30px" onclick="test(this)">汽车</button></li>
				<li class="grid"><button class="btn-default"
						style="width: 80px; height: 30px" onclick="test(this)">奢侈品</button></li>
				<li class="grid"><button class="btn-default"
						style="width: 60px; height: 30px" onclick="test(this)">古董</button></li>
				<li class="grid"><button href="contact.html"
						class="btn-default" style="width: 60px; height: 30px"
						onclick="test(this)">杂项</button></li>
			</ul>

			<div class="ckeckout-top">
				<div class="cart-items">
					<div class="in-check">
							<span>选择省份</span>
							<select onchange="change(this)" id="sel">
							</select>
							<span>长沙市</span>&nbsp;
							<span>湘潭市</span>&nbsp;
							<span>株洲市</span>&nbsp;


					</div>
				</div>
			</div>
		</div>
	</div>


<script type="text/javascript" src="<%=basePath %>qianCss/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript">
		function test(data) {

			alert('弹出');
		}
		
		function change(){
			
			var sel = $("#sel").val();
			
				$.ajax({
					url:"city/findAllProvince",
				    type:"post",
				    dataType:"json",
				    success:function(msg){
				    	//获取select 标签
				    	var sel = $("#sel");
				    	// 清空
				    	sel.empty();
				    	for(var i=0;i<msg.length;i++){
				    		var op = $("<option  value='"+msg[i].pid+"'>"+msg[i].pname+"</option>");
				    	    sel.append(op);
				    	}
				    	
				    }
				});
			}
			
			
			
	</script>

</body>
</html>