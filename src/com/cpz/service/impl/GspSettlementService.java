package com.company.service.impl;
//结算表
public interface GspSettlementService {
	List<GspSettlementBean> get(Map para) throws Exception;
void insert(GspSettlementBean bean);
void update(GspSettlementBean bean);
void delete(GspSettlementBean bean);
}

