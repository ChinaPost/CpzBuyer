package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//订单关联商品表
public class CpzBuyerOrderProductBean {
	public String orderNo;/**订单号*/
	public Integer shopProductId;/**卖家商品代号*/
	public String shopProductName;/**商品名称*/
	public Integer levelId;/**商品所属分类代号*/
	public String productType;/**商品类型0：单个商品:1：套餐*/
	public String shopNormsId;/**购买规格*/
	public Integer shopNormsNum;/**购买数量*/
	public String shopNormsPrice;/**购买价格*/
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getShopProductId() {
		return shopProductId;
	}
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}
	public String getShopProductName() {
		return shopProductName;
	}
	public void setShopProductName(String shopProductName) {
		this.shopProductName = shopProductName;
	}
	public Integer getLevelId() {
		return levelId;
	}
	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getShopNormsId() {
		return shopNormsId;
	}
	public void setShopNormsId(String shopNormsId) {
		this.shopNormsId = shopNormsId;
	}
	public Integer getShopNormsNum() {
		return shopNormsNum;
	}
	public void setShopNormsNum(Integer shopNormsNum) {
		this.shopNormsNum = shopNormsNum;
	}
	public String getShopNormsPrice() {
		return shopNormsPrice;
	}
	public void setShopNormsPrice(String shopNormsPrice) {
		this.shopNormsPrice = shopNormsPrice;
	}
}

