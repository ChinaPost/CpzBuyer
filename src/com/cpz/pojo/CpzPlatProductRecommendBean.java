package com.company.pojo;
//平台商品推荐表
public class CpzPlatProductRecommendBean {
	public Integer Id;/**Id*/
	public Integer productId;/**商品代号*/
	public String channelNo;/**推荐渠道*/
	public String saleType;/**推荐标识0：推荐1：热门*/
	public String startTime;/**有效开始时间格式：yyyymmdd hh24miss*/
	public String endTime;/**有效结束时间格式：yyyymmdd hh24miss*/
	public String createTime;/**记录创建时间格式：yyyymmdd hh24miss*/
	public String remark1;/**备注*/
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getSaleType() {
		return saleType;
	}
	public void setSaleType(String saleType) {
		this.saleType = saleType;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
}

