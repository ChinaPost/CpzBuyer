package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzBuyerMsgMapper;
import com.cpz.pojo.CpzBuyerMsgBean;
//买家基本信息表
@Service("CpzBuyerMsgService")
public class CpzBuyerMsgServiceImpl implements CpzBuyerMsgService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerMsgServiceImpl.class);
	
	@Resource
	private CpzBuyerMsgMapper mapper;
	
	@Override
	public List<CpzBuyerMsgBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerMsgSelect(para);
	}

	@Override
public void  insert(CpzBuyerMsgBean bean){
 mapper.CpzBuyerMsgInsert(bean);
	}
	@Override
public void update(CpzBuyerMsgBean bean){
 mapper.CpzBuyerMsgUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerMsgBean bean){
 mapper.CpzBuyerMsgDelete(bean);
	}
}

