package com.company.service.impl;
//平台商品规格表
public interface CpzPlatProductNormsService {
	List<CpzPlatProductNormsBean> get(Map para) throws Exception;
void insert(CpzPlatProductNormsBean bean);
void update(CpzPlatProductNormsBean bean);
void delete(CpzPlatProductNormsBean bean);
}

