<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>post</title>
</head>
<body>
	<form action="<%=basePath %>message/back">
		user_id:<input type="text" id="user_id" name="user_id" /><br>
		buylist_id:<input type="text" id="buylist_id" name="buylist_id" /><br>
		money:<input type="text" id="money" name="money" /><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>