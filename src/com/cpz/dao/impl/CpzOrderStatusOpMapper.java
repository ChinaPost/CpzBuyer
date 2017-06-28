package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzOrderStatusOpBean;
//订单状态操作表
public interface CpzOrderStatusOpMapper {
List<CpzOrderStatusOpBean> CpzOrderStatusOpSelect(Map para);
void CpzOrderStatusOpInsert(CpzOrderStatusOpBean bean);
void CpzOrderStatusOpUpdate(CpzOrderStatusOpBean bean);
void CpzOrderStatusOpDelete(CpzOrderStatusOpBean bean);
}

