package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductRecommendBean;
//平台商品推荐表
public interface CpzPlatProductRecommendMapper {
List<CpzPlatProductRecommendBean> CpzPlatProductRecommendSelect(Map para);
void CpzPlatProductRecommendInsert(CpzPlatProductRecommendBean bean);
void CpzPlatProductRecommendUpdate(CpzPlatProductRecommendBean bean);
void CpzPlatProductRecommendDelete(CpzPlatProductRecommendBean bean);
}

