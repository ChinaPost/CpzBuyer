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
//店铺经营范围表
@Service("CpzShopBusineeRangeService")
public class CpzShopBusineeRangeServiceImpl implements CpzShopBusineeRangeService {
	private final static Logger logger = LoggerFactory.getLogger(CpzShopBusineeRangeServiceImpl.class);
	
	@Resource
	private CpzShopBusineeRangeMapper mapper;
	
	@Override
	public List<CpzShopBusineeRangeBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzShopBusineeRangeSelect(para);
	}

	@Override
public void  insert(CpzShopBusineeRangeBean bean){
 mapper.CpzShopBusineeRangeInsert(bean);
	}
	@Override
public void update(CpzShopBusineeRangeBean bean){
 mapper.CpzShopBusineeRangeUpdate(bean);
	}

	@Override
public void   delete(CpzShopBusineeRangeBean bean){
 mapper.CpzShopBusineeRangeDelete(bean);
	}
}

