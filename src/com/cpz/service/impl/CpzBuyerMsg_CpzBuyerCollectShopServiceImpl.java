package com.cpz.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.pojo.CpzBuyerMsgBean;
import com.framework.dao.BaseDao;
import com.framework.dao.common.DaoTools;
import com.framework.exception.CommonException;
@Service("CpzBuyerMsg_CpzBuyerCollectShopService")
public class CpzBuyerMsg_CpzBuyerCollectShopServiceImpl implements CpzBuyerMsg_CpzBuyerCollectShopService {
	//private final static Logger logger = LoggerFactory.getLogger(ErrorServiceImpl.class);
	
	@Resource
	private BaseDao baseDao;
	
	@Override
	public CpzBuyerMsgBean get() throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
		
		Object obj = baseDao.selectOne(DaoTools.getMapperNamespace(CpzBuyerMsgBean.class, "CpzBuyerMsgSelect"), m);
		return obj == null ? null : (CpzBuyerMsgBean)obj;
	}
}

