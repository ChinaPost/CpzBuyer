package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzShopBusineeRangeBean;
//店铺经营范围表
public interface CpzShopBusineeRangeMapper {
List<CpzShopBusineeRangeBean> CpzShopBusineeRangeSelect(Map para);
void CpzShopBusineeRangeInsert(CpzShopBusineeRangeBean bean);
void CpzShopBusineeRangeUpdate(CpzShopBusineeRangeBean bean);
void CpzShopBusineeRangeDelete(CpzShopBusineeRangeBean bean);
}

