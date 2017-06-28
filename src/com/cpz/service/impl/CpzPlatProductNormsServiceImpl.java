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
//平台商品规格表
@Service("CpzPlatProductNormsService")
public class CpzPlatProductNormsServiceImpl implements CpzPlatProductNormsService {
	private final static Logger logger = LoggerFactory.getLogger(CpzPlatProductNormsServiceImpl.class);
	
	@Resource
	private CpzPlatProductNormsMapper mapper;
	
	@Override
	public List<CpzPlatProductNormsBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzPlatProductNormsSelect(para);
	}

	@Override
public void  insert(CpzPlatProductNormsBean bean){
 mapper.CpzPlatProductNormsInsert(bean);
	}
	@Override
public void update(CpzPlatProductNormsBean bean){
 mapper.CpzPlatProductNormsUpdate(bean);
	}

	@Override
public void   delete(CpzPlatProductNormsBean bean){
 mapper.CpzPlatProductNormsDelete(bean);
	}
}

