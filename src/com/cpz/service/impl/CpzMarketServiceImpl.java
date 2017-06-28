package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzMarketMapper;
import com.cpz.pojo.CpzMarketBean;
//市场表
@Service("CpzMarketService")
public class CpzMarketServiceImpl implements CpzMarketService {
	private final static Logger logger = LoggerFactory.getLogger(CpzMarketServiceImpl.class);
	
	@Resource
	private CpzMarketMapper mapper;
	
	@Override
	public List<CpzMarketBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzMarketSelect(para);
	}

	@Override
public void  insert(CpzMarketBean bean){
 mapper.CpzMarketInsert(bean);
	}
	@Override
public void update(CpzMarketBean bean){
 mapper.CpzMarketUpdate(bean);
	}

	@Override
public void   delete(CpzMarketBean bean){
 mapper.CpzMarketDelete(bean);
	}
}

