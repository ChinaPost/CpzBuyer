package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzOrderStatusOpBean;
//订单状态操作表
public interface CpzOrderStatusOpService {
	List<CpzOrderStatusOpBean> get(Map para) throws Exception;
void insert(CpzOrderStatusOpBean bean);
void update(CpzOrderStatusOpBean bean);
void delete(CpzOrderStatusOpBean bean);
}

