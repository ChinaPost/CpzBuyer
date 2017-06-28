package com.company.dao.impl;
//订单状态操作表
public interface CpzOrderStatusOpMapper {
List<CpzOrderStatusOpBean> CpzOrderStatusOpSelect(Map para);
void CpzOrderStatusOpInsert(CpzOrderStatusOpBean bean);
void CpzOrderStatusOpUpdate(CpzOrderStatusOpBean bean);
void CpzOrderStatusOpDelete(CpzOrderStatusOpBean bean);
}

