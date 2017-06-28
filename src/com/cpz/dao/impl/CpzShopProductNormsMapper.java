package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzShopProductNormsBean;
//卖家商品规格表
public interface CpzShopProductNormsMapper {
List<CpzShopProductNormsBean> CpzShopProductNormsSelect(Map para);
void CpzShopProductNormsInsert(CpzShopProductNormsBean bean);
void CpzShopProductNormsUpdate(CpzShopProductNormsBean bean);
void CpzShopProductNormsDelete(CpzShopProductNormsBean bean);
}

