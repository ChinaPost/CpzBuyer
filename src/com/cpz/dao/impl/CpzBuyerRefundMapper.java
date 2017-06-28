package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerRefundBean;
//买家退款表
public interface CpzBuyerRefundMapper {
List<CpzBuyerRefundBean> CpzBuyerRefundSelect(Map para);
void CpzBuyerRefundInsert(CpzBuyerRefundBean bean);
void CpzBuyerRefundUpdate(CpzBuyerRefundBean bean);
void CpzBuyerRefundDelete(CpzBuyerRefundBean bean);
}

