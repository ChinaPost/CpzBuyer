package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerShoppingBean;
//买家购物车表
public interface CpzBuyerShoppingMapper {
List<CpzBuyerShoppingBean> CpzBuyerShoppingSelect(Map para);
void CpzBuyerShoppingInsert(CpzBuyerShoppingBean bean);
void CpzBuyerShoppingUpdate(CpzBuyerShoppingBean bean);
void CpzBuyerShoppingDelete(CpzBuyerShoppingBean bean);
}

