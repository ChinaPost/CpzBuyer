package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzTerminfoLinkBean;
//买家或者卖家关联第三方信息表
public interface CpzTerminfoLinkMapper {
List<CpzTerminfoLinkBean> CpzTerminfoLinkSelect(Map para);
void CpzTerminfoLinkInsert(CpzTerminfoLinkBean bean);
void CpzTerminfoLinkUpdate(CpzTerminfoLinkBean bean);
void CpzTerminfoLinkDelete(CpzTerminfoLinkBean bean);
}

