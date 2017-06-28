package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductRecommendBean;
//平台商品推荐表
public interface CpzPlatProductRecommendService {
	List<CpzPlatProductRecommendBean> get(Map para) throws Exception;
void insert(CpzPlatProductRecommendBean bean);
void update(CpzPlatProductRecommendBean bean);
void delete(CpzPlatProductRecommendBean bean);
}

