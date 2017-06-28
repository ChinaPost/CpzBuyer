package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzPlatProductRecommendMapper;
import com.cpz.pojo.CpzPlatProductRecommendBean;
//平台商品推荐表
@Service("CpzPlatProductRecommendService")
public class CpzPlatProductRecommendServiceImpl implements CpzPlatProductRecommendService {
	private final static Logger logger = LoggerFactory.getLogger(CpzPlatProductRecommendServiceImpl.class);
	
	@Resource
	private CpzPlatProductRecommendMapper mapper;
	
	@Override
	public List<CpzPlatProductRecommendBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzPlatProductRecommendSelect(para);
	}

	@Override
public void  insert(CpzPlatProductRecommendBean bean){
 mapper.CpzPlatProductRecommendInsert(bean);
	}
	@Override
public void update(CpzPlatProductRecommendBean bean){
 mapper.CpzPlatProductRecommendUpdate(bean);
	}

	@Override
public void   delete(CpzPlatProductRecommendBean bean){
 mapper.CpzPlatProductRecommendDelete(bean);
	}
}

