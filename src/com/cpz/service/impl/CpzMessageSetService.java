package com.company.service.impl;
//消息设置表
public interface CpzMessageSetService {
	List<CpzMessageSetBean> get(Map para) throws Exception;
void insert(CpzMessageSetBean bean);
void update(CpzMessageSetBean bean);
void delete(CpzMessageSetBean bean);
}

