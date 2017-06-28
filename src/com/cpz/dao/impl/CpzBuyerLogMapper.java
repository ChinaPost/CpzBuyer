package com.company.dao.impl;
//订单或者退款单日志表
public interface CpzBuyerLogMapper {
List<CpzBuyerLogBean> CpzBuyerLogSelect(Map para);
void CpzBuyerLogInsert(CpzBuyerLogBean bean);
void CpzBuyerLogUpdate(CpzBuyerLogBean bean);
void CpzBuyerLogDelete(CpzBuyerLogBean bean);
}

