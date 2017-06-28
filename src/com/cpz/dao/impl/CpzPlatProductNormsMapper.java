package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductNormsBean;
//平台商品规格表
public interface CpzPlatProductNormsMapper {
List<CpzPlatProductNormsBean> CpzPlatProductNormsSelect(Map para);
void CpzPlatProductNormsInsert(CpzPlatProductNormsBean bean);
void CpzPlatProductNormsUpdate(CpzPlatProductNormsBean bean);
void CpzPlatProductNormsDelete(CpzPlatProductNormsBean bean);
}

