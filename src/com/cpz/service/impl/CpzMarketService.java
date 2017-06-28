package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzMarketBean;
//市场表
public interface CpzMarketService {
	List<CpzMarketBean> get(Map para) throws Exception;
void insert(CpzMarketBean bean);
void update(CpzMarketBean bean);
void delete(CpzMarketBean bean);
}

