package com.cpz.pojo;

import java.util.List;

public class CpzBuyerMsgBean {
	
	
	List<CpzBuyerCollectShopBean> CpzBuyerCollectShop;
	
	public List<CpzBuyerCollectShopBean> getCpzBuyerCollectShop() {
		return CpzBuyerCollectShop;
	}
	public void setCpzBuyerCollectShop(
			List<CpzBuyerCollectShopBean> cpzBuyerCollectShop) {
		CpzBuyerCollectShop = cpzBuyerCollectShop;
	}
	private Integer userId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	private String moileNo;
	public String getMoileNo() {
		return moileNo;
	}
	public void setMoileNo(String moileNo) {
		this.moileNo = moileNo;
	}
	private String nickName;
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	private String sex;
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	private String headUrl;
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	private String cstmLevel;
	public String getCstmLevel() {
		return cstmLevel;
	}
	public void setCstmLevel(String cstmLevel) {
		this.cstmLevel = cstmLevel;
	}
	private String lonValue;
	public String getLonValue() {
		return lonValue;
	}
	public void setLonValue(String lonValue) {
		this.lonValue = lonValue;
	}
	private String latValue;
	public String getLatValue() {
		return latValue;
	}
	public void setLatValue(String latValue) {
		this.latValue = latValue;
	}
	private String createTime;
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}

