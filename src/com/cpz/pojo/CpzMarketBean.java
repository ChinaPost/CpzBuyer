package com.cpz.pojo;
import java.util.List;
import java.util.Map;
//市场表
public class CpzMarketBean {
	public Integer marketId;/**市场ID*/
	public String marketName;/**市场名字*/
	public String lonValue;/**市场经度*/
	public String latValue;/**市场纬度*/
	public String provCode;/**省份代号*/
	public String cityCode;/**市局代号*/
	public String countyCode;/**区县代号*/
	public String marketArea;/**市场所属片区*/
	public String marketAddr;/**市场详细地址*/
	public Integer getMarketId() {
		return marketId;
	}
	public void setMarketId(Integer marketId) {
		this.marketId = marketId;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
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
	public String getMarketArea() {
		return marketArea;
	}
	public void setMarketArea(String marketArea) {
		this.marketArea = marketArea;
	}
	public String getMarketAddr() {
		return marketAddr;
	}
	public void setMarketAddr(String marketAddr) {
		this.marketAddr = marketAddr;
	}
}

