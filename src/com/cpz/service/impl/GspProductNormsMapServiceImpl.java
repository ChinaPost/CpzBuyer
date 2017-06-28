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
//商品规格关联表
@Service("GspProductNormsMapService")
public class GspProductNormsMapServiceImpl implements GspProductNormsMapService {
	private final static Logger logger = LoggerFactory.getLogger(GspProductNormsMapServiceImpl.class);
	
	@Resource
	private GspProductNormsMapMapper mapper;
	
	@Override
	public List<GspProductNormsMapBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.GspProductNormsMapSelect(para);
	}

	@Override
public void  insert(GspProductNormsMapBean bean){
 mapper.GspProductNormsMapInsert(bean);
	}
	@Override
public void update(GspProductNormsMapBean bean){
 mapper.GspProductNormsMapUpdate(bean);
	}

	@Override
public void   delete(GspProductNormsMapBean bean){
 mapper.GspProductNormsMapDelete(bean);
	}
}

