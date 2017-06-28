package com.company.dao.impl;
//卖家表
public interface CpzSellerMapper {
List<CpzSellerBean> CpzSellerSelect(Map para);
void CpzSellerInsert(CpzSellerBean bean);
void CpzSellerUpdate(CpzSellerBean bean);
void CpzSellerDelete(CpzSellerBean bean);
}

