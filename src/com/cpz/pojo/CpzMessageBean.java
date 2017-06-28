package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//消息表
public class CpzMessageBean {
	public Integer messageId;/**主键*/
	public String messageDetail;/**内容*/
	public String messageType;/**01：业务通知02：系统变更通知03：业务进展通知04：其它通知*/
	public Integer readMessageFlag;/**0：未读 1：已读*/
	public Integer systemNo;/**系统用户*/
	public String messageChannel;/**消息渠道01：微信02：安卓03：IOS*/
	public String messageLinkType;/**消息链接类型*/
	public String messageLinkPara;/**消息链接业务参数*/
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public String getMessageDetail() {
		return messageDetail;
	}
	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public Integer getReadMessageFlag() {
		return readMessageFlag;
	}
	public void setReadMessageFlag(Integer readMessageFlag) {
		this.readMessageFlag = readMessageFlag;
	}
	public Integer getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(Integer systemNo) {
		this.systemNo = systemNo;
	}
	public String getMessageChannel() {
		return messageChannel;
	}
	public void setMessageChannel(String messageChannel) {
		this.messageChannel = messageChannel;
	}
	public String getMessageLinkType() {
		return messageLinkType;
	}
	public void setMessageLinkType(String messageLinkType) {
		this.messageLinkType = messageLinkType;
	}
	public String getMessageLinkPara() {
		return messageLinkPara;
	}
	public void setMessageLinkPara(String messageLinkPara) {
		this.messageLinkPara = messageLinkPara;
	}
}

