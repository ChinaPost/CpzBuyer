package com.company.pojo;
//消息设置表
public class CpzMessageSetBean {
	public Integer messageSetId;/**主键*/
	public Integer messageType;/**消息类型*/
	public Integer systemNo;/**系统用户号*/
	public Integer getMessageSetId() {
		return messageSetId;
	}
	public void setMessageSetId(Integer messageSetId) {
		this.messageSetId = messageSetId;
	}
	public Integer getMessageType() {
		return messageType;
	}
	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}
	public Integer getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(Integer systemNo) {
		this.systemNo = systemNo;
	}
}

