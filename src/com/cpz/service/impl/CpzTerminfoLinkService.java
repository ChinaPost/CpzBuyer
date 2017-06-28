package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzTerminfoLinkBean;
//买家或者卖家关联第三方信息表
public interface CpzTerminfoLinkService {
	List<CpzTerminfoLinkBean> get(Map para) throws Exception;
void insert(CpzTerminfoLinkBean bean);
void update(CpzTerminfoLinkBean bean);
void delete(CpzTerminfoLinkBean bean);
}

