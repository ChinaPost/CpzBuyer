package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzProductLevelBean;
//商品分类表
public interface CpzProductLevelService {
	List<CpzProductLevelBean> get(Map para) throws Exception;
void insert(CpzProductLevelBean bean);
void update(CpzProductLevelBean bean);
void delete(CpzProductLevelBean bean);
}

