package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzPlatProductPicBean;
//平台商品图片表
public interface CpzPlatProductPicMapper {
List<CpzPlatProductPicBean> CpzPlatProductPicSelect(Map para);
void CpzPlatProductPicInsert(CpzPlatProductPicBean bean);
void CpzPlatProductPicUpdate(CpzPlatProductPicBean bean);
void CpzPlatProductPicDelete(CpzPlatProductPicBean bean);
}

