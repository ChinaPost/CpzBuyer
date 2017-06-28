package com.company.pojo;
//订单或者退款单日志表
public class CpzBuyerLogBean {
	public Integer orderLogId;/**日志流水号 顺序号，从1开始*/
	public Integer dealTime;/**处理时间*/
	public String dealType;/**处理类型0：下单 1：支付 2：配货 3：配货取消 4：取货 5：退款申请6：退款完成*/
	public String dealContent;/**处理信息内容*/
	public Integer dealPerson;/**处理人0：买家 1：卖家*/
	public String lonValue;/**操作经度 格式：小数点后2位*/
	public String latValue;/**操作纬度*/
	public Integer getOrderLogId() {
		return orderLogId;
	}
	public void setOrderLogId(Integer orderLogId) {
		this.orderLogId = orderLogId;
	}
	public Integer getDealTime() {
		return dealTime;
	}
	public void setDealTime(Integer dealTime) {
		this.dealTime = dealTime;
	}
	public String getDealType() {
		return dealType;
	}
	public void setDealType(String dealType) {
		this.dealType = dealType;
	}
	public String getDealContent() {
		return dealContent;
	}
	public void setDealContent(String dealContent) {
		this.dealContent = dealContent;
	}
	public Integer getDealPerson() {
		return dealPerson;
	}
	public void setDealPerson(Integer dealPerson) {
		this.dealPerson = dealPerson;
	}
	public String getLonValue() {
		return lonValue;
	}
	public void setLonValue(String lonValue) {
		this.lonValue = lonValue;
	}
	public String getLatValue() {
		return latValue;
	}
	public void setLatValue(String latValue) {
		this.latValue = latValue;
	}
}

