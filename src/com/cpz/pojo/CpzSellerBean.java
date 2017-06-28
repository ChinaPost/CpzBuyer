package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//卖家表
public class CpzSellerBean {
	public Integer sellerId;/**主键*/
	public String account;/**账号*/
	public String mobile;/**手机号码*/
	public String password;/**密码*/
	public Integer status;/**状态*/
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
}

