package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//订单状态操作表
public class CpzOrderStatusOpBean {
	public Integer orderNo;/**订单号*/
	public String orderStatus;/**当前订单状态*/
	public String opFalg;/**可操作标志01：支付02：订单取消 03：配货取消 04：退款*/
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOpFalg() {
		return opFalg;
	}
	public void setOpFalg(String opFalg) {
		this.opFalg = opFalg;
	}
}

