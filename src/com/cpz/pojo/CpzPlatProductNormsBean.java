package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//平台商品规格表
public class CpzPlatProductNormsBean {
	public Integer normsId;/**规格代号*/
	public Integer productId;/**商品代号*/
	public String normsName;/**规格名称*/
	public String remark1;/**备注*/
	public Integer getNormsId() {
		return normsId;
	}
	public void setNormsId(Integer normsId) {
		this.normsId = normsId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getNormsName() {
		return normsName;
	}
	public void setNormsName(String normsName) {
		this.normsName = normsName;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
}

