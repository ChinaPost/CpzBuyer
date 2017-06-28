package com.company.service.impl;
//卖家商品规格表
public interface CpzShopProductNormsService {
	List<CpzShopProductNormsBean> get(Map para) throws Exception;
void insert(CpzShopProductNormsBean bean);
void update(CpzShopProductNormsBean bean);
void delete(CpzShopProductNormsBean bean);
}

