package com.company.dao.impl;
//销量统计表
public interface GspSalesReportMapper {
List<GspSalesReportBean> GspSalesReportSelect(Map para);
void GspSalesReportInsert(GspSalesReportBean bean);
void GspSalesReportUpdate(GspSalesReportBean bean);
void GspSalesReportDelete(GspSalesReportBean bean);
}

