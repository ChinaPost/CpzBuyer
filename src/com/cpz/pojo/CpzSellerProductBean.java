package com.company.pojo;
//卖家商品信息表
public class CpzSellerProductBean {
	public Integer shopProductId;/**卖家商品代号*/
	public String productName;/**商品自定义名称*/
	public String productPic;/**商品自定义图片*/
	public String merchIntro;/**商品简介*/
	public String description;/**商品描述*/
	public String productStatus;/**商品状态*/
	public Integer productId;/**关联的平台商品*/
	public Integer shopId;/**关联店铺代号*/
	public String orderNo;/**订单号格式：日期+10位流水号*/
	public String startTime;/**商品在线开始时间格式：yyyymmdd hh24miss*/
	public String endTime;/**商品在线结束时间格式：yyyymmdd hh24miss*/
	public String remakr1;/**备注*/
	public Integer levelId;/**关联平台分类*/
	public Integer getShopProductId() {
		return shopProductId;
	}
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPic() {
		return productPic;
	}
	public void setProductPic(String productPic) {
		this.productPic = productPic;
	}
	public String getMerchIntro() {
		return merchIntro;
	}
	public void setMerchIntro(String merchIntro) {
		this.merchIntro = merchIntro;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRemakr1() {
		return remakr1;
	}
	public void setRemakr1(String remakr1) {
		this.remakr1 = remakr1;
	}
	public Integer getLevelId() {
		return levelId;
	}
	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}
}

