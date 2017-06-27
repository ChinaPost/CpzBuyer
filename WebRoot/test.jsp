<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	
  </head>
  
  <body>
   	<a href="CpzBuyer/BuyerPoductSeachTest.jsp">菜品搜索查询接口</a></h5>
   	<a href="CpzBuyer/CpzBuyerCollectShopTest.jsp">买家店铺收藏信息表接口</a></h5>
   	
  </body>
</html>
