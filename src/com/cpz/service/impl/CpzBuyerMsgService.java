package com.company.service.impl;
//买家基本信息表
public interface CpzBuyerMsgService {
	List<CpzBuyerMsgBean> get(Map para) throws Exception;
void insert(CpzBuyerMsgBean bean);
void update(CpzBuyerMsgBean bean);
void delete(CpzBuyerMsgBean bean);
}

