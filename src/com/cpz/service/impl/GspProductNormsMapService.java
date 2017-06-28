package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.GspProductNormsMapBean;
//商品规格关联表
public interface GspProductNormsMapService {
	List<GspProductNormsMapBean> get(Map para) throws Exception;
void insert(GspProductNormsMapBean bean);
void update(GspProductNormsMapBean bean);
void delete(GspProductNormsMapBean bean);
}

