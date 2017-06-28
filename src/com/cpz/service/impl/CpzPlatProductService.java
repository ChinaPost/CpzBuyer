package com.company.service.impl;
//平台商品信息表
public interface CpzPlatProductService {
	List<CpzPlatProductBean> get(Map para) throws Exception;
void insert(CpzPlatProductBean bean);
void update(CpzPlatProductBean bean);
void delete(CpzPlatProductBean bean);
}

