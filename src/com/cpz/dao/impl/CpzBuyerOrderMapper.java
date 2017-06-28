package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerOrderBean;
//买家订单表
public interface CpzBuyerOrderMapper {
List<CpzBuyerOrderBean> CpzBuyerOrderSelect(Map para);
void CpzBuyerOrderInsert(CpzBuyerOrderBean bean);
void CpzBuyerOrderUpdate(CpzBuyerOrderBean bean);
void CpzBuyerOrderDelete(CpzBuyerOrderBean bean);
}

