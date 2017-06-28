package com.company.service.impl;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.framework.dao.BaseDao;
import com.framework.dao.common.DaoTools;
import com.framework.exception.CommonException;
//买家退款表
@Service("CpzBuyerRefundService")
public class CpzBuyerRefundServiceImpl implements CpzBuyerRefundService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerRefundServiceImpl.class);
	
	@Resource
	private CpzBuyerRefundMapper mapper;
	
	@Override
	public List<CpzBuyerRefundBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerRefundSelect(para);
	}

	@Override
public void  insert(CpzBuyerRefundBean bean){
 mapper.CpzBuyerRefundInsert(bean);
	}
	@Override
public void update(CpzBuyerRefundBean bean){
 mapper.CpzBuyerRefundUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerRefundBean bean){
 mapper.CpzBuyerRefundDelete(bean);
	}
}

