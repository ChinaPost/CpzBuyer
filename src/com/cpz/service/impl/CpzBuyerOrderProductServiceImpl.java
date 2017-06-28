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
//订单关联商品表
@Service("CpzBuyerOrderProductService")
public class CpzBuyerOrderProductServiceImpl implements CpzBuyerOrderProductService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerOrderProductServiceImpl.class);
	
	@Resource
	private CpzBuyerOrderProductMapper mapper;
	
	@Override
	public List<CpzBuyerOrderProductBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerOrderProductSelect(para);
	}

	@Override
public void  insert(CpzBuyerOrderProductBean bean){
 mapper.CpzBuyerOrderProductInsert(bean);
	}
	@Override
public void update(CpzBuyerOrderProductBean bean){
 mapper.CpzBuyerOrderProductUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerOrderProductBean bean){
 mapper.CpzBuyerOrderProductDelete(bean);
	}
}

