package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.GspSettlementBean;
//结算表
public interface GspSettlementService {
	List<GspSettlementBean> get(Map para) throws Exception;
void insert(GspSettlementBean bean);
void update(GspSettlementBean bean);
void delete(GspSettlementBean bean);
}

