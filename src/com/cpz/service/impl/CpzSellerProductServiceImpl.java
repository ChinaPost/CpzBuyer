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
//卖家商品信息表
@Service("CpzSellerProductService")
public class CpzSellerProductServiceImpl implements CpzSellerProductService {
	private final static Logger logger = LoggerFactory.getLogger(CpzSellerProductServiceImpl.class);
	
	@Resource
	private CpzSellerProductMapper mapper;
	
	@Override
	public List<CpzSellerProductBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzSellerProductSelect(para);
	}

	@Override
public void  insert(CpzSellerProductBean bean){
 mapper.CpzSellerProductInsert(bean);
	}
	@Override
public void update(CpzSellerProductBean bean){
 mapper.CpzSellerProductUpdate(bean);
	}

	@Override
public void   delete(CpzSellerProductBean bean){
 mapper.CpzSellerProductDelete(bean);
	}
}

