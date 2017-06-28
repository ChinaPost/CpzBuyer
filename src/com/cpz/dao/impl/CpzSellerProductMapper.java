package com.company.dao.impl;
//卖家商品信息表
public interface CpzSellerProductMapper {
List<CpzSellerProductBean> CpzSellerProductSelect(Map para);
void CpzSellerProductInsert(CpzSellerProductBean bean);
void CpzSellerProductUpdate(CpzSellerProductBean bean);
void CpzSellerProductDelete(CpzSellerProductBean bean);
}

