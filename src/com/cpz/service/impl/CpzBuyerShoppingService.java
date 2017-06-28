package com.company.service.impl;
//买家购物车表
public interface CpzBuyerShoppingService {
	List<CpzBuyerShoppingBean> get(Map para) throws Exception;
void insert(CpzBuyerShoppingBean bean);
void update(CpzBuyerShoppingBean bean);
void delete(CpzBuyerShoppingBean bean);
}

