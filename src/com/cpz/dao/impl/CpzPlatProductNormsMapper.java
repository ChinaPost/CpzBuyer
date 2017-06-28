package com.company.dao.impl;
//平台商品规格表
public interface CpzPlatProductNormsMapper {
List<CpzPlatProductNormsBean> CpzPlatProductNormsSelect(Map para);
void CpzPlatProductNormsInsert(CpzPlatProductNormsBean bean);
void CpzPlatProductNormsUpdate(CpzPlatProductNormsBean bean);
void CpzPlatProductNormsDelete(CpzPlatProductNormsBean bean);
}

