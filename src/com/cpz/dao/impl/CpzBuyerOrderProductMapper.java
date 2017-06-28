package com.company.dao.impl;
//订单关联商品表
public interface CpzBuyerOrderProductMapper {
List<CpzBuyerOrderProductBean> CpzBuyerOrderProductSelect(Map para);
void CpzBuyerOrderProductInsert(CpzBuyerOrderProductBean bean);
void CpzBuyerOrderProductUpdate(CpzBuyerOrderProductBean bean);
void CpzBuyerOrderProductDelete(CpzBuyerOrderProductBean bean);
}

