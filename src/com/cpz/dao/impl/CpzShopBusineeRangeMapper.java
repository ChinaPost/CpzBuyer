package com.company.dao.impl;
//店铺经营范围表
public interface CpzShopBusineeRangeMapper {
List<CpzShopBusineeRangeBean> CpzShopBusineeRangeSelect(Map para);
void CpzShopBusineeRangeInsert(CpzShopBusineeRangeBean bean);
void CpzShopBusineeRangeUpdate(CpzShopBusineeRangeBean bean);
void CpzShopBusineeRangeDelete(CpzShopBusineeRangeBean bean);
}

