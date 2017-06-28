package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzSellerProductBean;
//卖家商品信息表
public interface CpzSellerProductService {
	List<CpzSellerProductBean> get(Map para) throws Exception;
void insert(CpzSellerProductBean bean);
void update(CpzSellerProductBean bean);
void delete(CpzSellerProductBean bean);
}

