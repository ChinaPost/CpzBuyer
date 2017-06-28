package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//买家退款表
public class CpzBuyerRefundBean {
	public Integer refundId;/**退款单号 顺序号*/
	public String userId;/**会员号*/
	public String orderNo;/**订单号*/
	public String refundReason;/**退款原因*/
	public String isConsultSeller;/**是否与卖家已协商0：是1：否*/
	public String refundStyle;/**退款方式0：系统退款1：人工退款*/
	public String orderMoney;/**订单原金额*/
	public String applyMoney;/**退款申请金额*/
	public String applyTime;/**申请时 间 格式：yyyymmdd hh24miss*/
	public String refundTime;/**最后退款时间 格式：yyyymmdd hh24miss*/
	public Integer getRefundId() {
		return refundId;
	}
	public void setRefundId(Integer refundId) {
		this.refundId = refundId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getIsConsultSeller() {
		return isConsultSeller;
	}
	public void setIsConsultSeller(String isConsultSeller) {
		this.isConsultSeller = isConsultSeller;
	}
	public String getRefundStyle() {
		return refundStyle;
	}
	public void setRefundStyle(String refundStyle) {
		this.refundStyle = refundStyle;
	}
	public String getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}
	public String getApplyMoney() {
		return applyMoney;
	}
	public void setApplyMoney(String applyMoney) {
		this.applyMoney = applyMoney;
	}
	public String getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	public String getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(String refundTime) {
		this.refundTime = refundTime;
	}
}

