package com.company.pojo;
//销量统计表
public class GspSalesReportBean {
	public Integer salesReportId;/**主键*/
	public String dateStr;/**时间（以天为单位）*/
	public String merchName;/**商品名称*/
	public String weight;/**重量*/
	public String settSumPrice;/**结算费用*/
	public Integer getSalesReportId() {
		return salesReportId;
	}
	public void setSalesReportId(Integer salesReportId) {
		this.salesReportId = salesReportId;
	}
	public String getDateStr() {
		return dateStr;
	}
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	public String getMerchName() {
		return merchName;
	}
	public void setMerchName(String merchName) {
		this.merchName = merchName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSettSumPrice() {
		return settSumPrice;
	}
	public void setSettSumPrice(String settSumPrice) {
		this.settSumPrice = settSumPrice;
	}
}

