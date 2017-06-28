package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzShopProductNormsMapper;
import com.cpz.pojo.CpzShopProductNormsBean;
//卖家商品规格表
@Service("CpzShopProductNormsService")
public class CpzShopProductNormsServiceImpl implements CpzShopProductNormsService {
	private final static Logger logger = LoggerFactory.getLogger(CpzShopProductNormsServiceImpl.class);
	
	@Resource
	private CpzShopProductNormsMapper mapper;
	
	@Override
	public List<CpzShopProductNormsBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzShopProductNormsSelect(para);
	}

	@Override
public void  insert(CpzShopProductNormsBean bean){
 mapper.CpzShopProductNormsInsert(bean);
	}
	@Override
public void update(CpzShopProductNormsBean bean){
 mapper.CpzShopProductNormsUpdate(bean);
	}

	@Override
public void   delete(CpzShopProductNormsBean bean){
 mapper.CpzShopProductNormsDelete(bean);
	}
}

