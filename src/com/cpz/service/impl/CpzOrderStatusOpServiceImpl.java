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
//订单状态操作表
@Service("CpzOrderStatusOpService")
public class CpzOrderStatusOpServiceImpl implements CpzOrderStatusOpService {
	private final static Logger logger = LoggerFactory.getLogger(CpzOrderStatusOpServiceImpl.class);
	
	@Resource
	private CpzOrderStatusOpMapper mapper;
	
	@Override
	public List<CpzOrderStatusOpBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzOrderStatusOpSelect(para);
	}

	@Override
public void  insert(CpzOrderStatusOpBean bean){
 mapper.CpzOrderStatusOpInsert(bean);
	}
	@Override
public void update(CpzOrderStatusOpBean bean){
 mapper.CpzOrderStatusOpUpdate(bean);
	}

	@Override
public void   delete(CpzOrderStatusOpBean bean){
 mapper.CpzOrderStatusOpDelete(bean);
	}
}

