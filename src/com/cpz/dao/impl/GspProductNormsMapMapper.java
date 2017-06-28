package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.GspProductNormsMapBean;
//商品规格关联表
public interface GspProductNormsMapMapper {
List<GspProductNormsMapBean> GspProductNormsMapSelect(Map para);
void GspProductNormsMapInsert(GspProductNormsMapBean bean);
void GspProductNormsMapUpdate(GspProductNormsMapBean bean);
void GspProductNormsMapDelete(GspProductNormsMapBean bean);
}

