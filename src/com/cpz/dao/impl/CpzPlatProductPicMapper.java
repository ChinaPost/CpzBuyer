package com.company.dao.impl;
//平台商品图片表
public interface CpzPlatProductPicMapper {
List<CpzPlatProductPicBean> CpzPlatProductPicSelect(Map para);
void CpzPlatProductPicInsert(CpzPlatProductPicBean bean);
void CpzPlatProductPicUpdate(CpzPlatProductPicBean bean);
void CpzPlatProductPicDelete(CpzPlatProductPicBean bean);
}

