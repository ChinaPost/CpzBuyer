package com.company.dao.impl;
//市场表
public interface CpzMarketMapper {
List<CpzMarketBean> CpzMarketSelect(Map para);
void CpzMarketInsert(CpzMarketBean bean);
void CpzMarketUpdate(CpzMarketBean bean);
void CpzMarketDelete(CpzMarketBean bean);
}

