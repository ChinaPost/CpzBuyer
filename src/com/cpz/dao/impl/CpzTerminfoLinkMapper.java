package com.company.dao.impl;
//买家或者卖家关联第三方信息表
public interface CpzTerminfoLinkMapper {
List<CpzTerminfoLinkBean> CpzTerminfoLinkSelect(Map para);
void CpzTerminfoLinkInsert(CpzTerminfoLinkBean bean);
void CpzTerminfoLinkUpdate(CpzTerminfoLinkBean bean);
void CpzTerminfoLinkDelete(CpzTerminfoLinkBean bean);
}

