package com.company.service.impl;
//店铺经营范围表
public interface CpzShopBusineeRangeService {
	List<CpzShopBusineeRangeBean> get(Map para) throws Exception;
void insert(CpzShopBusineeRangeBean bean);
void update(CpzShopBusineeRangeBean bean);
void delete(CpzShopBusineeRangeBean bean);
}

