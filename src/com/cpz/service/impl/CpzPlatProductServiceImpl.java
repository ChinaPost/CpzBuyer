package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzPlatProductMapper;
import com.cpz.pojo.CpzPlatProductBean;
//平台商品信息表
@Service("CpzPlatProductService")
public class CpzPlatProductServiceImpl implements CpzPlatProductService {
	private final static Logger logger = LoggerFactory.getLogger(CpzPlatProductServiceImpl.class);
	
	@Resource
	private CpzPlatProductMapper mapper;
	
	@Override
	public List<CpzPlatProductBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzPlatProductSelect(para);
	}

	@Override
public void  insert(CpzPlatProductBean bean){
 mapper.CpzPlatProductInsert(bean);
	}
	@Override
public void update(CpzPlatProductBean bean){
 mapper.CpzPlatProductUpdate(bean);
	}

	@Override
public void   delete(CpzPlatProductBean bean){
 mapper.CpzPlatProductDelete(bean);
	}
}

