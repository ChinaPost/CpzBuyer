package com.company.dao.impl;
//商品分类表
public interface CpzProductLevelMapper {
List<CpzProductLevelBean> CpzProductLevelSelect(Map para);
void CpzProductLevelInsert(CpzProductLevelBean bean);
void CpzProductLevelUpdate(CpzProductLevelBean bean);
void CpzProductLevelDelete(CpzProductLevelBean bean);
}

