package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//买家订单表
public class CpzBuyerOrderBean {
	public String orderNo;/**订单号格式：日期+10位流水号*/
	public Integer userId;/**会员号*/
	public String userName;/**会员姓名*/
	public String userPhone;/**会员联系手机*/
	public String orderStatus;/**订单状态01：待付款02：已付款03：等待发货04：已备货05：已确认收货06：已完成07：已取消08：退款中09：已退款10：退款拒绝*/
	public String totalMoney;/**订单总金额*/
	public String payMoney;/**订单已支付金额*/
	public String payStatus;/**订单支付状态0：未支付1：支付中2：已支付*/
	public Integer shopId;/**店铺代号*/
	public Integer marketId;/**所在市场代号*/
	public String shipType;/**配送方式预留 01：自提02：寄递*/
	public String provCode;/**省份代号预留：目前阶段接口送空值*/
	public String cityCode;/**市局代号预留：目前阶段接口送空值*/
	public String countyCode;/**区县代号预留：目前阶段接口送空值*/
	public String detailAddr;/**详细地址代号*/
	public String invoiceType;/**发票类型预留发票模块：目前阶段接口送0：不开发票 1：个人发票 2：单位发票*/
	public String invoiceTitle;/**发票抬头*/
	public String orderRemark;/**给卖家留言*/
	public String getProductTime;/**提货时间*/
	public String bookTime;/**订单下单时间格式：yyyymmdd hh24miss*/
	public String payTime;/**订单支付时间格式：yyyymmdd hh24miss*/
	public String channelNo;/**订单受理渠道01：微信02：安卓03：IOS*/
	public String remark1;/**备注1*/
	public String remark2;/**备注2*/
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
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
	public String getShipType() {
		return shipType;
	}
	public void setShipType(String shipType) {
		this.shipType = shipType;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getInvoiceTitle() {
		return invoiceTitle;
	}
	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public String getOrderRemark() {
		return orderRemark;
	}
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
	public String getGetProductTime() {
		return getProductTime;
	}
	public void setGetProductTime(String getProductTime) {
		this.getProductTime = getProductTime;
	}
	public String getBookTime() {
		return bookTime;
	}
	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}
	public String getPayTime() {
		return payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getChannelNo() {
		return channelNo;
	}
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	public String getRemark2() {
		return remark2;
	}
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
}

