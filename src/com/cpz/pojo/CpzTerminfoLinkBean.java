package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//买家或者卖家关联第三方信息表
public class CpzTerminfoLinkBean {
	public Integer systemNo;/**系统用户号*/
	public String systemTyoe;/**系统类别0:买家1：卖家2：批发商*/
	public String linkType;/**第三方代号类型0：微信OPENID1：安卓设备号2：IOS设备号*/
	public String linkNo;/**第三方代号 如微信公众号对应的OPENID或者系统设备号*/
	public String linkTime;/**关联时间格式：yyyymmdd hh24miss*/
	public Integer getSystemNo() {
		return systemNo;
	}
	public void setSystemNo(Integer systemNo) {
		this.systemNo = systemNo;
	}
	public String getSystemTyoe() {
		return systemTyoe;
	}
	public void setSystemTyoe(String systemTyoe) {
		this.systemTyoe = systemTyoe;
	}
	public String getLinkType() {
		return linkType;
	}
	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}
	public String getLinkNo() {
		return linkNo;
	}
	public void setLinkNo(String linkNo) {
		this.linkNo = linkNo;
	}
	public String getLinkTime() {
		return linkTime;
	}
	public void setLinkTime(String linkTime) {
		this.linkTime = linkTime;
	}
}

