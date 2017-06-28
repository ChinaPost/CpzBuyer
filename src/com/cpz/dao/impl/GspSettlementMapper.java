package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.GspSettlementBean;
//结算表
public interface GspSettlementMapper {
List<GspSettlementBean> GspSettlementSelect(Map para);
void GspSettlementInsert(GspSettlementBean bean);
void GspSettlementUpdate(GspSettlementBean bean);
void GspSettlementDelete(GspSettlementBean bean);
}

