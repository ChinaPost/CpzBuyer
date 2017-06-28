package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzProductLevelBean;
//商品分类表
public interface CpzProductLevelMapper {
List<CpzProductLevelBean> CpzProductLevelSelect(Map para);
void CpzProductLevelInsert(CpzProductLevelBean bean);
void CpzProductLevelUpdate(CpzProductLevelBean bean);
void CpzProductLevelDelete(CpzProductLevelBean bean);
}

