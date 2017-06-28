package com.company.service.impl;
//市场表
public interface CpzMarketService {
	List<CpzMarketBean> get(Map para) throws Exception;
void insert(CpzMarketBean bean);
void update(CpzMarketBean bean);
void delete(CpzMarketBean bean);
}

