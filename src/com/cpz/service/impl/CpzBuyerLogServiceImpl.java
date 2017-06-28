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
//订单或者退款单日志表
@Service("CpzBuyerLogService")
public class CpzBuyerLogServiceImpl implements CpzBuyerLogService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerLogServiceImpl.class);
	
	@Resource
	private CpzBuyerLogMapper mapper;
	
	@Override
	public List<CpzBuyerLogBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerLogSelect(para);
	}

	@Override
public void  insert(CpzBuyerLogBean bean){
 mapper.CpzBuyerLogInsert(bean);
	}
	@Override
public void update(CpzBuyerLogBean bean){
 mapper.CpzBuyerLogUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerLogBean bean){
 mapper.CpzBuyerLogDelete(bean);
	}
}

