package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzSellerBean;
//卖家表
public interface CpzSellerMapper {
List<CpzSellerBean> CpzSellerSelect(Map para);
void CpzSellerInsert(CpzSellerBean bean);
void CpzSellerUpdate(CpzSellerBean bean);
void CpzSellerDelete(CpzSellerBean bean);
}

