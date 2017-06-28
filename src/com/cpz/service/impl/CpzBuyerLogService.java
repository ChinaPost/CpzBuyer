package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerLogBean;
//订单或者退款单日志表
public interface CpzBuyerLogService {
	List<CpzBuyerLogBean> get(Map para) throws Exception;
void insert(CpzBuyerLogBean bean);
void update(CpzBuyerLogBean bean);
void delete(CpzBuyerLogBean bean);
}

