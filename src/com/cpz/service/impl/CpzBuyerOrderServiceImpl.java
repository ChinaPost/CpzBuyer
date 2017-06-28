package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzBuyerOrderMapper;
import com.cpz.pojo.CpzBuyerOrderBean;
//买家订单表
@Service("CpzBuyerOrderService")
public class CpzBuyerOrderServiceImpl implements CpzBuyerOrderService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerOrderServiceImpl.class);
	
	@Resource
	private CpzBuyerOrderMapper mapper;
	
	@Override
	public List<CpzBuyerOrderBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerOrderSelect(para);
	}

	@Override
public void  insert(CpzBuyerOrderBean bean){
 mapper.CpzBuyerOrderInsert(bean);
	}
	@Override
public void update(CpzBuyerOrderBean bean){
 mapper.CpzBuyerOrderUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerOrderBean bean){
 mapper.CpzBuyerOrderDelete(bean);
	}
}

