package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzBuyerCollectShopMapper;
import com.cpz.pojo.CpzBuyerCollectShopBean;
//买家店铺收藏信息表
@Service("CpzBuyerCollectShopService")
public class CpzBuyerCollectShopServiceImpl implements CpzBuyerCollectShopService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerCollectShopServiceImpl.class);
	
	@Resource
	private CpzBuyerCollectShopMapper mapper;
	
	@Override
	public List<CpzBuyerCollectShopBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerCollectShopSelect(para);
	}

	@Override
public void  insert(CpzBuyerCollectShopBean bean){
 mapper.CpzBuyerCollectShopInsert(bean);
	}
	@Override
public void update(CpzBuyerCollectShopBean bean){
 mapper.CpzBuyerCollectShopUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerCollectShopBean bean){
 mapper.CpzBuyerCollectShopDelete(bean);
	}
}

