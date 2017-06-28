package com.company.service.impl;
//订单关联商品表
public interface CpzBuyerOrderProductService {
	List<CpzBuyerOrderProductBean> get(Map para) throws Exception;
void insert(CpzBuyerOrderProductBean bean);
void update(CpzBuyerOrderProductBean bean);
void delete(CpzBuyerOrderProductBean bean);
}

