package com.company.service.impl;
//消息表
public interface CpzMessageService {
	List<CpzMessageBean> get(Map para) throws Exception;
void insert(CpzMessageBean bean);
void update(CpzMessageBean bean);
void delete(CpzMessageBean bean);
}

