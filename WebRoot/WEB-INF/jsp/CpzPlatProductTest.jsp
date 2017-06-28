<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>平台商品信息表</title>
<script
	type="text/javascript" src="js/jquery-1.7.1.js"></script>
	<script>
		
		
		$(document).on('ready', function() {
			var searchInp="?";
			$("#searchIn").val(searchInp);
			var addInp="?productID=&productName=&productCategoryId=&productType=&productStatus=&tradingUnit=&productColor=&isFresh=&sourceArea=&isCanRefund=&isNeedSpot=&productDetail=&supportDay=&channelNo=&remakr1=&remakr2=";
			$("#addIn").val(addInp);
			var updateInp="?productID=&productName=&productCategoryId=&productType=&productStatus=&tradingUnit=&productColor=&isFresh=&sourceArea=&isCanRefund=&isNeedSpot=&productDetail=&supportDay=&channelNo=&remakr1=&remakr2=";
			$("#updateIn").val(updateInp);
			var deleteInp="?productID=";
			$("#deleteIn").val(deleteInp);
		});
		
		
		function doSearch(){
		var searchInp=	$("#searchIn").val();
var pathName=window.document.location.pathname;
var projectName=pathName.substring(1,pathName.substr(1).indexOf('/')+1);
var requesturl='http://localhost:8080/'+projectName+'cpzplatproduct/query.do'+searchInp;
			
				$.ajax({
					type:'POST',
					url:'cpzplatproduct/query.do'+searchInp,
					data:{
					},
					success:function(result){
							var returndata = result.returnData;
var jsonstr=JSON.stringify(result); 
$("#pageRequest").html(requesturl);
$("#pageContent").html(jsonstr);
					},
					error : function() {
						alert("对不起，系统错误，请稍候重试！")
					}
				});
			
		}
		
		
		function doAdd(){
		var addInp=	$("#addIn").val();
var pathName=window.document.location.pathname;
var projectName=pathName.substring(1,pathName.substr(1).indexOf('/')+1);
var requesturl='http://localhost:8080/'+projectName+'cpzplatproduct/insert.do'+addInp;
			
				$.ajax({
					type:'POST',
					url:'cpzplatproduct/insert.do'+addInp,
					data:{
					},
					success:function(result){
							var returndata = result.returnData;
var jsonstr=JSON.stringify(result); 
$("#pageRequest").html(requesturl);
$("#pageContent").html(jsonstr);
					},
					error : function() {
						alert("对不起，系统错误，请稍候重试！")
					}
				});
			
		}
		
		
		function doUpdate(){
			var updateInp= $("#updateIn").val();
var pathName=window.document.location.pathname;
var projectName=pathName.substring(1,pathName.substr(1).indexOf('/')+1);
var requesturl='http://localhost:8080/'+projectName+'/cpzplatproduct/update.do'+updateInp;
			
				$.ajax({
					type:'POST',
					url:'cpzplatproduct/update.do'+updateInp,
					data:{
					},
					success:function(result){
							var returndata = result.returnData;
var jsonstr=JSON.stringify(result); 
$("#pageRequest").html(requesturl);
$("#pageContent").html(jsonstr);
					},
					error : function() {
						alert("对不起，系统错误，请稍候重试！")
					}
				});
			
		}
		function doDelete(code){
		var 	deleteInp=$("#deleteIn").val();
var pathName=window.document.location.pathname;
var projectName=pathName.substring(1,pathName.substr(1).indexOf('/')+1);
var requesturl='http://localhost:8080/'+projectName+'/cpzplatproduct/delete.do'+deleteInp;
			
				$.ajax({
					type:'POST',
					url:'cpzplatproduct/delete.do'+deleteInp,
					data:{
					},
					success:function(result){
							var returndata = result.returnData;
var jsonstr=JSON.stringify(result); 
$("#pageRequest").html(requesturl);
$("#pageContent").html(jsonstr);
					},
					error : function() {
						alert("对不起，系统错误，请稍候重试！")
					}
				});
			
		}
		
		
		
	</script>
</head>
<body>
	<div> 平台商品信息表接口</div>
	<div style="padding-left:20px;margin-bottom:10px;" >
	<input type="hidden" id="thd_sys_id" name="thd_sys_id" value="" />
	查询urlPara：<input type="text" id="searchIn" style="margin-left:10px;width:800px;height:20px; " value=""/>
	<input type="button" value="查询" id="search" name = "search" onmouseover="this.style.cursor='hand'" style="width:50px;height:20px;font-size:12px;"  onclick="doSearch()">
	</div>
	
	<div style="padding-left:20px;margin-bottom:10px;" >
	<input type="hidden" id="thd_sys_id" name="thd_sys_id" value="" />
	新增urlPara：<input type="text" id="addIn" style="margin-left:10px;width:800px;height:20px; " value=""/>
	<input type="button" value="新增" id="search" name = "search" onmouseover="this.style.cursor='hand'" style="width:50px;height:20px;font-size:12px;"  onclick="doAdd()">
	</div>
	
	<div style="padding-left:20px;margin-bottom:10px;" >
	<input type="hidden" id="thd_sys_id" name="thd_sys_id" value="" />
	修改urlPara：<input type="text" id="updateIn" style="margin-left:10px;width:800px;height:20px; " value=""/>
	<input type="button" value="修改" id="search" name = "search" onmouseover="this.style.cursor='hand'" style="width:50px;height:20px;font-size:12px;"  onclick="doUpdate()">
	</div>
	<div style="padding-left:20px;margin-bottom:10px;" >
	<input type="hidden" id="thd_sys_id" name="thd_sys_id" value="" />
	删除urlPara：<input type="text" id="deleteIn" style="margin-left:10px;width:800px;height:20px; " value=""/>
	<input type="button" value="删除" id="search" name = "search" onmouseover="this.style.cursor='hand'" style="width:50px;height:20px;font-size:12px;"  onclick="doDelete()">
	</div>
<div> 请求Url</div>
<div id="pageRequest"></div>
	<div> 接口输出</div>
	<div id="pageContent"></div>
  </div>
	
</body>
</html>

