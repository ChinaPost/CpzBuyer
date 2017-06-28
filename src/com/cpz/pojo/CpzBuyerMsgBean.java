package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//买家基本信息表
public class CpzBuyerMsgBean {
	public Integer userId;/**会员号*/
	public String moileNo;/**手机号码*/
	public String nickName;/**会员呢称*/
	public String sex;/**性别0：女1：男*/
	public String headUrl;/**会员头像图片URL地址*/
	public String cstmLevel;/**会员等级预留01：铜牌会员02：银牌会员03：金牌会员*/
	public String lonValue;/**注册时所在经度格式：小数点后2位*/
	public String latValue;/**注册时所在纬度格式：小数点后2位*/
	public String createTime;/**注册时间格式：yyyymmdd hh24miss*/
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getMoileNo() {
		return moileNo;
	}
	public void setMoileNo(String moileNo) {
		this.moileNo = moileNo;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getCstmLevel() {
		return cstmLevel;
	}
	public void setCstmLevel(String cstmLevel) {
		this.cstmLevel = cstmLevel;
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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}

