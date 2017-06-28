package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerMsgBean;
//买家基本信息表
public interface CpzBuyerMsgService {
	List<CpzBuyerMsgBean> get(Map para) throws Exception;
void insert(CpzBuyerMsgBean bean);
void update(CpzBuyerMsgBean bean);
void delete(CpzBuyerMsgBean bean);
}

