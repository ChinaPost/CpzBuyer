package com.company.service.impl;
//买家店铺收藏信息表
public interface CpzBuyerCollectShopService {
	List<CpzBuyerCollectShopBean> get(Map para) throws Exception;
void insert(CpzBuyerCollectShopBean bean);
void update(CpzBuyerCollectShopBean bean);
void delete(CpzBuyerCollectShopBean bean);
}

