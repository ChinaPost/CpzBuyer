package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzMessageBean;
//消息表
public interface CpzMessageService {
	List<CpzMessageBean> get(Map para) throws Exception;
void insert(CpzMessageBean bean);
void update(CpzMessageBean bean);
void delete(CpzMessageBean bean);
}

