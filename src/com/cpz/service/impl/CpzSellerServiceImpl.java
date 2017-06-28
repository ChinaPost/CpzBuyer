package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzSellerMapper;
import com.cpz.pojo.CpzSellerBean;
//卖家表
@Service("CpzSellerService")
public class CpzSellerServiceImpl implements CpzSellerService {
	private final static Logger logger = LoggerFactory.getLogger(CpzSellerServiceImpl.class);
	
	@Resource
	private CpzSellerMapper mapper;
	
	@Override
	public List<CpzSellerBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzSellerSelect(para);
	}

	@Override
public void  insert(CpzSellerBean bean){
 mapper.CpzSellerInsert(bean);
	}
	@Override
public void update(CpzSellerBean bean){
 mapper.CpzSellerUpdate(bean);
	}

	@Override
public void   delete(CpzSellerBean bean){
 mapper.CpzSellerDelete(bean);
	}
}

