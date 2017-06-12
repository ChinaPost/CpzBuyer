package com.cpz.dao.impl;

import java.util.List;

import com.cpz.pojo.CpzBuyerCollectShopBean;

public interface CpzBuyerCollectShopMapper {
	List<CpzBuyerCollectShopBean> CpzBuyerCollectShopSelect();

	void CpzBuyerCollectShopInsert(CpzBuyerCollectShopBean bean);

	void CpzBuyerCollectShopUpdate(CpzBuyerCollectShopBean bean);

	void CpzBuyerCollectShopDelete(Integer id);
}
