package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.CpzBuyerCollectShopBean;

//买家店铺收藏信息表
public interface CpzBuyerCollectShopMapper {
List<CpzBuyerCollectShopBean> CpzBuyerCollectShopSelect(Map para);
void CpzBuyerCollectShopInsert(CpzBuyerCollectShopBean bean);
void CpzBuyerCollectShopUpdate(CpzBuyerCollectShopBean bean);
void CpzBuyerCollectShopDelete(CpzBuyerCollectShopBean bean);
}

