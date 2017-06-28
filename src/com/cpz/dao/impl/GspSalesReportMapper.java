package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.GspSalesReportBean;
//销量统计表
public interface GspSalesReportMapper {
List<GspSalesReportBean> GspSalesReportSelect(Map para);
void GspSalesReportInsert(GspSalesReportBean bean);
void GspSalesReportUpdate(GspSalesReportBean bean);
void GspSalesReportDelete(GspSalesReportBean bean);
}

