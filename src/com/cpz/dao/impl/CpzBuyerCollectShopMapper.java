
package com.cpz.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cpz.pojo.CpzBuyerCollectShopBean;

public interface CpzBuyerCollectShopMapper {
List<CpzBuyerCollectShopBean> CpzBuyerCollectShopSelect(@Param("shopBusineeRangeId")int shopBusineeRangeId);
void CpzBuyerCollectShopInsert(CpzBuyerCollectShopBean bean);
void CpzBuyerCollectShopUpdate(CpzBuyerCollectShopBean bean);
void CpzBuyerCollectShopDelete(CpzBuyerCollectShopBean bean);
}

