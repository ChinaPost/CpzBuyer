package com.company.dao.impl;
//买家退款表
public interface CpzBuyerRefundMapper {
List<CpzBuyerRefundBean> CpzBuyerRefundSelect(Map para);
void CpzBuyerRefundInsert(CpzBuyerRefundBean bean);
void CpzBuyerRefundUpdate(CpzBuyerRefundBean bean);
void CpzBuyerRefundDelete(CpzBuyerRefundBean bean);
}

