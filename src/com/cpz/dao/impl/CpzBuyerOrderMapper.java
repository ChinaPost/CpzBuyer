package com.company.dao.impl;
//买家订单表
public interface CpzBuyerOrderMapper {
List<CpzBuyerOrderBean> CpzBuyerOrderSelect(Map para);
void CpzBuyerOrderInsert(CpzBuyerOrderBean bean);
void CpzBuyerOrderUpdate(CpzBuyerOrderBean bean);
void CpzBuyerOrderDelete(CpzBuyerOrderBean bean);
}

