package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerOrderProductBean;
//订单关联商品表
public interface CpzBuyerOrderProductMapper {
List<CpzBuyerOrderProductBean> CpzBuyerOrderProductSelect(Map para);
void CpzBuyerOrderProductInsert(CpzBuyerOrderProductBean bean);
void CpzBuyerOrderProductUpdate(CpzBuyerOrderProductBean bean);
void CpzBuyerOrderProductDelete(CpzBuyerOrderProductBean bean);
}

