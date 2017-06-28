package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzMessageSetBean;
//消息设置表
public interface CpzMessageSetMapper {
List<CpzMessageSetBean> CpzMessageSetSelect(Map para);
void CpzMessageSetInsert(CpzMessageSetBean bean);
void CpzMessageSetUpdate(CpzMessageSetBean bean);
void CpzMessageSetDelete(CpzMessageSetBean bean);
}

