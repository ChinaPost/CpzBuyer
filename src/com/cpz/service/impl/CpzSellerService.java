package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzSellerBean;
//卖家表
public interface CpzSellerService {
	List<CpzSellerBean> get(Map para) throws Exception;
void insert(CpzSellerBean bean);
void update(CpzSellerBean bean);
void delete(CpzSellerBean bean);
}

