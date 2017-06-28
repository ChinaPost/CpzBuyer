package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzMarketBean;
//市场表
public interface CpzMarketMapper {
List<CpzMarketBean> CpzMarketSelect(Map para);
void CpzMarketInsert(CpzMarketBean bean);
void CpzMarketUpdate(CpzMarketBean bean);
void CpzMarketDelete(CpzMarketBean bean);
}

