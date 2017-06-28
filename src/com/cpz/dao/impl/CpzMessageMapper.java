package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzMessageBean;
//消息表
public interface CpzMessageMapper {
List<CpzMessageBean> CpzMessageSelect(Map para);
void CpzMessageInsert(CpzMessageBean bean);
void CpzMessageUpdate(CpzMessageBean bean);
void CpzMessageDelete(CpzMessageBean bean);
}

