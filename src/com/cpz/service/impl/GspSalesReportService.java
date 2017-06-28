package com.company.service.impl;
//销量统计表
public interface GspSalesReportService {
	List<GspSalesReportBean> get(Map para) throws Exception;
void insert(GspSalesReportBean bean);
void update(GspSalesReportBean bean);
void delete(GspSalesReportBean bean);
}

