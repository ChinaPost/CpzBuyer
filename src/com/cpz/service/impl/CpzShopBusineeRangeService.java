package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzShopBusineeRangeBean;
//店铺经营范围表
public interface CpzShopBusineeRangeService {
	List<CpzShopBusineeRangeBean> get(Map para) throws Exception;
void insert(CpzShopBusineeRangeBean bean);
void update(CpzShopBusineeRangeBean bean);
void delete(CpzShopBusineeRangeBean bean);
}

