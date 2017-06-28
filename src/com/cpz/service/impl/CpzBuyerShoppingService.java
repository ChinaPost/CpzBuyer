package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerShoppingBean;
//买家购物车表
public interface CpzBuyerShoppingService {
	List<CpzBuyerShoppingBean> get(Map para) throws Exception;
void insert(CpzBuyerShoppingBean bean);
void update(CpzBuyerShoppingBean bean);
void delete(CpzBuyerShoppingBean bean);
}

