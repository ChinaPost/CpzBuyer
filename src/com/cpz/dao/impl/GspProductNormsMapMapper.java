package com.company.dao.impl;
//商品规格关联表
public interface GspProductNormsMapMapper {
List<GspProductNormsMapBean> GspProductNormsMapSelect(Map para);
void GspProductNormsMapInsert(GspProductNormsMapBean bean);
void GspProductNormsMapUpdate(GspProductNormsMapBean bean);
void GspProductNormsMapDelete(GspProductNormsMapBean bean);
}

