package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzSellerProductBean;
//卖家商品信息表
public interface CpzSellerProductMapper {
List<CpzSellerProductBean> CpzSellerProductSelect(Map para);
void CpzSellerProductInsert(CpzSellerProductBean bean);
void CpzSellerProductUpdate(CpzSellerProductBean bean);
void CpzSellerProductDelete(CpzSellerProductBean bean);
}

