package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerLogBean;
//订单或者退款单日志表
public interface CpzBuyerLogMapper {
List<CpzBuyerLogBean> CpzBuyerLogSelect(Map para);
void CpzBuyerLogInsert(CpzBuyerLogBean bean);
void CpzBuyerLogUpdate(CpzBuyerLogBean bean);
void CpzBuyerLogDelete(CpzBuyerLogBean bean);
}

