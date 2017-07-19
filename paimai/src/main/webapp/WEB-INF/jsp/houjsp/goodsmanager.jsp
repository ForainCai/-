<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="index.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>数据表格页面</title>
<link rel="stylesheet" href="<%=basePath %>houCss/css/style.default.css" type="text/css" />
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/general.js"></script>
<script type="text/javascript" src="<%=basePath %>houCss/js/custom/tables.js"></script>
<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="js/plugins/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">
	<div class="centercontent tables">
        <div id="contentwrapper" class="contentwrapper">
                <div class="contenttitle2">
                	<h3>Dynamic Table</h3>
                </div><!--contenttitle-->
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
                            <th class="head0">物品名</th>
                            <th class="head1">物品所在地</th>
                            <th class="head0">物品类型</th>
                            <th class="head1">物品证书</th>
                            <th class="head0">物品拥有人</th>
                            <th class="head1">物品审核状态</th>
                            <th class="head0">物品备注</th>
                            <th class="head1">操作</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th class="head0">物品名</th>
                            <th class="head1">物品所在地</th>
                            <th class="head0">物品类型</th>
                            <th class="head1">物品证书</th>
							<th class="head0">物品拥有人</th>
                            <th class="head1">物品审核状态</th>
                            <th class="head0">物品备注</th>
                            <th class="head1">操作</th>
                        </tr>
                    </tfoot>
                    <tbody>
                        <c:forEach items="${goodss }" var="goodss">
	                        <tr class="gradeX">
	                        	<td>${goodss.goodsName }</td>
	                            <td>${goodss.goodsPlace }</td>
	                            <td>xx</td>
	                            <td>xx</td>
	                            <td>xx</td>
	                            <td>${goodss.goodstypeId }</td>
	                            <td>${goodss.godsInfo }</td>
	                            <td class="head1" style="width:120px;"><center><button class="stdbtn btn_blue">修改</button>&nbsp;&nbsp;
	                            <button class="stdbtn btn_blue">删除</button></center></td>
	                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
</body>
</html>
