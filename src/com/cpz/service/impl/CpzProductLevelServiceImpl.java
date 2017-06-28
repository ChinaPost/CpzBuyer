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
//商品分类表
@Service("CpzProductLevelService")
public class CpzProductLevelServiceImpl implements CpzProductLevelService {
	private final static Logger logger = LoggerFactory.getLogger(CpzProductLevelServiceImpl.class);
	
	@Resource
	private CpzProductLevelMapper mapper;
	
	@Override
	public List<CpzProductLevelBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzProductLevelSelect(para);
	}

	@Override
public void  insert(CpzProductLevelBean bean){
 mapper.CpzProductLevelInsert(bean);
	}
	@Override
public void update(CpzProductLevelBean bean){
 mapper.CpzProductLevelUpdate(bean);
	}

	@Override
public void   delete(CpzProductLevelBean bean){
 mapper.CpzProductLevelDelete(bean);
	}
}

