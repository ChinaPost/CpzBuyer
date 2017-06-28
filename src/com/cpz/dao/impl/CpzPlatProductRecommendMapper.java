package com.company.dao.impl;
//平台商品推荐表
public interface CpzPlatProductRecommendMapper {
List<CpzPlatProductRecommendBean> CpzPlatProductRecommendSelect(Map para);
void CpzPlatProductRecommendInsert(CpzPlatProductRecommendBean bean);
void CpzPlatProductRecommendUpdate(CpzPlatProductRecommendBean bean);
void CpzPlatProductRecommendDelete(CpzPlatProductRecommendBean bean);
}

