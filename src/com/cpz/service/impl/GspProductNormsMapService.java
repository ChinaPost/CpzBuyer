package com.company.service.impl;
//商品规格关联表
public interface GspProductNormsMapService {
	List<GspProductNormsMapBean> get(Map para) throws Exception;
void insert(GspProductNormsMapBean bean);
void update(GspProductNormsMapBean bean);
void delete(GspProductNormsMapBean bean);
}

