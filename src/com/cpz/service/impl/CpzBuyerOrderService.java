package com.company.service.impl;
//买家订单表
public interface CpzBuyerOrderService {
	List<CpzBuyerOrderBean> get(Map para) throws Exception;
void insert(CpzBuyerOrderBean bean);
void update(CpzBuyerOrderBean bean);
void delete(CpzBuyerOrderBean bean);
}

