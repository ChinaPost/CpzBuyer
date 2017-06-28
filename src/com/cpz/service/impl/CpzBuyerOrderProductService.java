package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerOrderProductBean;
//订单关联商品表
public interface CpzBuyerOrderProductService {
	List<CpzBuyerOrderProductBean> get(Map para) throws Exception;
void insert(CpzBuyerOrderProductBean bean);
void update(CpzBuyerOrderProductBean bean);
void delete(CpzBuyerOrderProductBean bean);
}

