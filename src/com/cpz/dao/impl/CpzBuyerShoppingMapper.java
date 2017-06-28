package com.company.dao.impl;
//买家购物车表
public interface CpzBuyerShoppingMapper {
List<CpzBuyerShoppingBean> CpzBuyerShoppingSelect(Map para);
void CpzBuyerShoppingInsert(CpzBuyerShoppingBean bean);
void CpzBuyerShoppingUpdate(CpzBuyerShoppingBean bean);
void CpzBuyerShoppingDelete(CpzBuyerShoppingBean bean);
}

