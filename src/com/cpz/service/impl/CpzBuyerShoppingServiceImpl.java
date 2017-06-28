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
//买家购物车表
@Service("CpzBuyerShoppingService")
public class CpzBuyerShoppingServiceImpl implements CpzBuyerShoppingService {
	private final static Logger logger = LoggerFactory.getLogger(CpzBuyerShoppingServiceImpl.class);
	
	@Resource
	private CpzBuyerShoppingMapper mapper;
	
	@Override
	public List<CpzBuyerShoppingBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzBuyerShoppingSelect(para);
	}

	@Override
public void  insert(CpzBuyerShoppingBean bean){
 mapper.CpzBuyerShoppingInsert(bean);
	}
	@Override
public void update(CpzBuyerShoppingBean bean){
 mapper.CpzBuyerShoppingUpdate(bean);
	}

	@Override
public void   delete(CpzBuyerShoppingBean bean){
 mapper.CpzBuyerShoppingDelete(bean);
	}
}

