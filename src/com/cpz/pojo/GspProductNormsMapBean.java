package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//商品规格关联表
public class GspProductNormsMapBean {
	public Integer Id;/**Id*/
	public Integer shopProductId;/**商品id*/
	public Integer shopNormsId;/**规格代号*/
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public Integer getShopProductId() {
		return shopProductId;
	}
	public void setShopProductId(Integer shopProductId) {
		this.shopProductId = shopProductId;
	}
	public Integer getShopNormsId() {
		return shopNormsId;
	}
	public void setShopNormsId(Integer shopNormsId) {
		this.shopNormsId = shopNormsId;
	}
}

