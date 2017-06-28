package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductBean;
//平台商品信息表
public interface CpzPlatProductMapper {
List<CpzPlatProductBean> CpzPlatProductSelect(Map para);
void CpzPlatProductInsert(CpzPlatProductBean bean);
void CpzPlatProductUpdate(CpzPlatProductBean bean);
void CpzPlatProductDelete(CpzPlatProductBean bean);
}

