package com.company.dao.impl;
//平台商品信息表
public interface CpzPlatProductMapper {
List<CpzPlatProductBean> CpzPlatProductSelect(Map para);
void CpzPlatProductInsert(CpzPlatProductBean bean);
void CpzPlatProductUpdate(CpzPlatProductBean bean);
void CpzPlatProductDelete(CpzPlatProductBean bean);
}

