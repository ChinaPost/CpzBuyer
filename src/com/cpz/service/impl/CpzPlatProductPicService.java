package com.company.service.impl;
//平台商品图片表
public interface CpzPlatProductPicService {
	List<CpzPlatProductPicBean> get(Map para) throws Exception;
void insert(CpzPlatProductPicBean bean);
void update(CpzPlatProductPicBean bean);
void delete(CpzPlatProductPicBean bean);
}

