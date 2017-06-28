package com.company.pojo;
//卖家商品规格表
public class CpzShopProductNormsBean {
	public Integer shopNormsId;/**规格代号*/
	public Integer shopProductId;/**商品代号*/
	public String normsName;/**规格名称*/
	public String normsPrice;/**规格对应价格*/
	public String remark1;/**备注*/
	public Integer getShopNormsId() {
		return shopNormsId;
	}
	public void setShopNormsId(Integer shopNormsId) {
		this.shopNormsId = shopNormsId;
	}
	public Integer getShopProductId() {
		return shopProductId;
	}
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}
	public String getNormsName() {
		return normsName;
	}
	public void setNormsName(String normsName) {
		this.normsName = normsName;
	}
	public String getNormsPrice() {
		return normsPrice;
	}
	public void setNormsPrice(String normsPrice) {
		this.normsPrice = normsPrice;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
}

