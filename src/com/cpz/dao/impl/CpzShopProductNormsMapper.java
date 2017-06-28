package com.company.dao.impl;
//卖家商品规格表
public interface CpzShopProductNormsMapper {
List<CpzShopProductNormsBean> CpzShopProductNormsSelect(Map para);
void CpzShopProductNormsInsert(CpzShopProductNormsBean bean);
void CpzShopProductNormsUpdate(CpzShopProductNormsBean bean);
void CpzShopProductNormsDelete(CpzShopProductNormsBean bean);
}

