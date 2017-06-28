package com.company.dao.impl;
//消息设置表
public interface CpzMessageSetMapper {
List<CpzMessageSetBean> CpzMessageSetSelect(Map para);
void CpzMessageSetInsert(CpzMessageSetBean bean);
void CpzMessageSetUpdate(CpzMessageSetBean bean);
void CpzMessageSetDelete(CpzMessageSetBean bean);
}

