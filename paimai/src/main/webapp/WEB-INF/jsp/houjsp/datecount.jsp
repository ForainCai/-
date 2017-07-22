<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ include file="index.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-1.7.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据表格页面</title>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/tables.js"></script>
</head>

<body class="withvernav">
	<div class="centercontent tables">
        	 <div class="pageheader">
	            <h1 class="pagetitle">统计报表</h1>
	            <span class="pagedesc">data acount</span> 
	            <ul class="hornav">
	                <li><a href="#default" onclick="dayDate()">日成交</a></li>
	                <li><a href="#tabbed" onclick="weekDate()">周成交</a></li>
	                <li><a href="#vertical" onclick="monthDate()">月成交</a></li>
	            </ul>
       	 	</div><!--pageheader-->
        <div id="contentwrapper" class="contentwrapper">
        	<div id="default" class="subcontent">
                  <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                            <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </tfoot>
                    <tbody id="dayDate">
                       
                    </tbody>
                </table>
            </div><!-- #default -->
            <div id="tabbed" class="subcontent" style="display: none">
                  <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                           <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                           <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </tfoot>
                    <tbody id="weekDate">
                    
                    </tbody>
                </table>
            </div><!-- #tabbed -->
            <div id="vertical" class="subcontent" style="display: none">
                  <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
                    <colgroup>
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                        <col class="con1" />
                        <col class="con0" />
                    </colgroup>
                    <thead>
                        <tr>
                           <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                           <th class="head0">订单号</th>
                            <th class="head1">购买者</th>
                            <th class="head0">竞拍物品名称</th>
                            <th class="head1">竞拍成功时间</th>
                            <th class="head0">物品竞拍成功价</th>
                            <th class="head1">物品售出者</th>
                        </tr>
                    </tfoot>
                    <tbody id="monthDate">
       
                    </tbody>
                </table>
            </div><!-- #vertical -->   
        </div><!--contentwrapper-->        
	</div><!-- centercontent -->
</body>
<script type="text/javascript">
function dayDate() {
		$.ajax({
			type : 'post',
			dataType : 'json',
			url : '<%=basePath%>manager/dayDate',
			success : function(data) {	
				var $tbody = $("#dayDate");
				$tbody.empty();  
  	            for (var j = 0; j < data.length; j++) { 
  	            	var table="<tr class='gradeX'><td>"+data[j].buylist_id+"</td><td>"+data[j].buyuername+"</td><td>"+data[j].goosname+"</td><td>"+data[j].buytime+"</td><td>"+data[j].buyprice+"</td><td>"+data[j].saleuername+"</td></tr>";
  	            	$tbody.append(table);
  	            }
			}
		});
}
function weekDate() {
	$.ajax({
		type : 'post',
		dataType : 'json',
		url : '<%=basePath%>manager/weekDate',
		success : function(data) {	
			var $tbody = $("#weekDate");
			$tbody.empty();  
	            for (var j = 0; j < data.length; j++) { 
	            	var table="<tr class='gradeX'><td>"+data[j].buylist_id+"</td><td>"+data[j].buyuername+"</td><td>"+data[j].goosname+"</td><td>"+data[j].buytime+"</td><td>"+data[j].buyprice+"</td><td>"+data[j].saleuername+"</td></tr>";
	            	$tbody.append(table);
	            }
		}
	});
}
function monthDate() {
	$.ajax({
		type : 'post',
		dataType : 'json',
		url : '<%=basePath%>manager/monthDate',
		success : function(data) {	
			var $tbody = $("#monthDate");
			$tbody.empty();  
	            for (var j = 0; j < data.length; j++) { 
	            	var table="<tr class='gradeX'><td>"+data[j].buylist_id+"</td><td>"+data[j].buyuername+"</td><td>"+data[j].goosname+"</td><td>"+data[j].buytime+"</td><td>"+data[j].buyprice+"</td><td>"+data[j].saleuername+"</td></tr>";
	            	$tbody.append(table);
	            }
		}
	});
}
</script>
</html>
