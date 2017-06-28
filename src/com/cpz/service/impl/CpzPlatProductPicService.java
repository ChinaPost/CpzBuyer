package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductPicBean;
//平台商品图片表
public interface CpzPlatProductPicService {
	List<CpzPlatProductPicBean> get(Map para) throws Exception;
void insert(CpzPlatProductPicBean bean);
void update(CpzPlatProductPicBean bean);
void delete(CpzPlatProductPicBean bean);
}

