package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerMsgBean;
//买家基本信息表
public interface CpzBuyerMsgMapper {
List<CpzBuyerMsgBean> CpzBuyerMsgSelect(Map para);
void CpzBuyerMsgInsert(CpzBuyerMsgBean bean);
void CpzBuyerMsgUpdate(CpzBuyerMsgBean bean);
void CpzBuyerMsgDelete(CpzBuyerMsgBean bean);
}

