package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.GspSettlementMapper;
import com.cpz.pojo.GspSettlementBean;
//结算表
@Service("GspSettlementService")
public class GspSettlementServiceImpl implements GspSettlementService {
	private final static Logger logger = LoggerFactory.getLogger(GspSettlementServiceImpl.class);
	
	@Resource
	private GspSettlementMapper mapper;
	
	@Override
	public List<GspSettlementBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.GspSettlementSelect(para);
	}

	@Override
public void  insert(GspSettlementBean bean){
 mapper.GspSettlementInsert(bean);
	}
	@Override
public void update(GspSettlementBean bean){
 mapper.GspSettlementUpdate(bean);
	}

	@Override
public void   delete(GspSettlementBean bean){
 mapper.GspSettlementDelete(bean);
	}
}

