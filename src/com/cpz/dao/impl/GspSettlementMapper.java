package com.company.dao.impl;
//结算表
public interface GspSettlementMapper {
List<GspSettlementBean> GspSettlementSelect(Map para);
void GspSettlementInsert(GspSettlementBean bean);
void GspSettlementUpdate(GspSettlementBean bean);
void GspSettlementDelete(GspSettlementBean bean);
}

