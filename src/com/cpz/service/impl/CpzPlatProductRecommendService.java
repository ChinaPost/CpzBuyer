package com.company.service.impl;
//平台商品推荐表
public interface CpzPlatProductRecommendService {
	List<CpzPlatProductRecommendBean> get(Map para) throws Exception;
void insert(CpzPlatProductRecommendBean bean);
void update(CpzPlatProductRecommendBean bean);
void delete(CpzPlatProductRecommendBean bean);
}

