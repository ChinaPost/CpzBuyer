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

   	<a href="CpzBuyer/jsp/BuyerPoductSeachTest.jsp">菜品搜索查询接口</a></h5>
   	
   	<div> 单表接口</div>
   	<div>
   	<a href="CpzBuyer/jsp/CpzBuyerMsgTest.jsp">买家基本信息表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerCollectShopTest.jsp">买家店铺收藏信息表</a></h5>
<a href="CpzBuyer/jsp/CpzTerminfoLinkTest.jsp">买家或者卖家关联第三方信息表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerOrderTest.jsp">买家订单表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerShoppingTest.jsp">买家购物车表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerRefundTest.jsp">买家退款表</a></h5>
<a href="CpzBuyer/jsp/CpzSellerProductTest.jsp">卖家商品信息表</a></h5>
<a href="CpzBuyer/jsp/CpzShopProductNormsTest.jsp">卖家商品规格表</a></h5>
<a href="CpzBuyer/jsp/CpzSellerTest.jsp">卖家表</a></h5>
<a href="CpzBuyer/jsp/CpzProductLevelTest.jsp">商品分类表</a></h5>
<a href="CpzBuyer/jsp/GspProductNormsMapTest.jsp">商品规格关联表</a></h5>
<a href="CpzBuyer/jsp/CpzMarketTest.jsp">市场表</a></h5>
<a href="CpzBuyer/jsp/CpzPlatProductTest.jsp">平台商品信息表</a></h5>
<a href="CpzBuyer/jsp/CpzPlatProductPicTest.jsp">平台商品图片表</a></h5>
<a href="CpzBuyer/jsp/CpzPlatProductRecommendTest.jsp">平台商品推荐表</a></h5>
<a href="CpzBuyer/jsp/CpzPlatProductNormsTest.jsp">平台商品规格表</a></h5>
<a href="CpzBuyer/jsp/CpzShopBusineeRangeTest.jsp">店铺经营范围表</a></h5>
<a href="CpzBuyer/jsp/CpzMessageTest.jsp">消息表</a></h5>
<a href="CpzBuyer/jsp/CpzMessageSetTest.jsp">消息设置表</a></h5>
<a href="CpzBuyer/jsp/GspSettlementTest.jsp">结算表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerOrderProductTest.jsp">订单关联商品表</a></h5>
<a href="CpzBuyer/jsp/CpzBuyerLogTest.jsp">订单或者退款单日志表</a></h5>
<a href="CpzBuyer/jsp/CpzOrderStatusOpTest.jsp">订单状态操作表</a></h5>
<a href="CpzBuyer/jsp/GspSalesReportTest.jsp">销量统计表</a></h5>
   	</div>
  </body>
</html>
