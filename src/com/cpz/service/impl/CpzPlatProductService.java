package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductBean;
//平台商品信息表
public interface CpzPlatProductService {
	List<CpzPlatProductBean> get(Map para) throws Exception;
void insert(CpzPlatProductBean bean);
void update(CpzPlatProductBean bean);
void delete(CpzPlatProductBean bean);
}

