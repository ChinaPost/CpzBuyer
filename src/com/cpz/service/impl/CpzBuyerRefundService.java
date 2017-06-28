package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerRefundBean;
//买家退款表
public interface CpzBuyerRefundService {
	List<CpzBuyerRefundBean> get(Map para) throws Exception;
void insert(CpzBuyerRefundBean bean);
void update(CpzBuyerRefundBean bean);
void delete(CpzBuyerRefundBean bean);
}

