package com.company.service.impl;
//订单状态操作表
public interface CpzOrderStatusOpService {
	List<CpzOrderStatusOpBean> get(Map para) throws Exception;
void insert(CpzOrderStatusOpBean bean);
void update(CpzOrderStatusOpBean bean);
void delete(CpzOrderStatusOpBean bean);
}

