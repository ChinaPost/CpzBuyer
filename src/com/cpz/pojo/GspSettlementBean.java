package com.company.pojo;
//结算表
public class GspSettlementBean {
	public Integer settId;/**主键*/
	public String orderNo;/**订单号*/
	public String settSn;/**结算流水*/
	public Integer status;/**结算状态*/
	public String sumPrice;/**总费用*/
	public Integer sellerId;/**商家ID*/
	public Integer getSettId() {
		return settId;
	}
	public void setSettId(Integer settId) {
		this.settId = settId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getSettSn() {
		return settSn;
	}
	public void setSettSn(String settSn) {
		this.settSn = settSn;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
}

