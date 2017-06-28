package com.company.service.impl;
//商品分类表
public interface CpzProductLevelService {
	List<CpzProductLevelBean> get(Map para) throws Exception;
void insert(CpzProductLevelBean bean);
void update(CpzProductLevelBean bean);
void delete(CpzProductLevelBean bean);
}

