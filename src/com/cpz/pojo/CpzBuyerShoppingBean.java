package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//买家购物车表
public class CpzBuyerShoppingBean {
	public Integer shopCarId;/**购物车id*/
	public Integer userId;/**会员号*/
	public Integer shopProductId;/**卖家商品代号*/
	public Integer shopId;/**卖家店铺代号*/
	public Integer marketId;/**卖家市场代号*/
	public Integer normsId;/**购买规格*/
	public Integer buyNum;/**购买数量*/
	public String normsPrice;/**购买价格*/
	public String createTime;/**加入购物车时间格式：yyyymmdd hh24miss*/
	public String remark;/**备注*/
	public Integer getShopCarId() {
		return shopCarId;
	}
	public void setShopCarId(Integer shopCarId) {
		this.shopCarId = shopCarId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getShopProductId() {
		return shopProductId;
	}
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}
	public Integer getShopId() {
		return shopId;
	}
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	public Integer getMarketId() {
		return marketId;
	}
	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	public Integer getNormsId() {
		return normsId;
	}
	public void setNormsId(Integer normsId) {
		this.normsId = normsId;
	}
	public Integer getBuyNum() {
		return buyNum;
	}
	public void setBuyNum(Integer buyNum) {
		this.buyNum = buyNum;
	}
	public String getNormsPrice() {
		return normsPrice;
	}
	public void setNormsPrice(String normsPrice) {
		this.normsPrice = normsPrice;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

