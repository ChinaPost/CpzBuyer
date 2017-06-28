package com.company.dao.impl;
//消息表
public interface CpzMessageMapper {
List<CpzMessageBean> CpzMessageSelect(Map para);
void CpzMessageInsert(CpzMessageBean bean);
void CpzMessageUpdate(CpzMessageBean bean);
void CpzMessageDelete(CpzMessageBean bean);
}

