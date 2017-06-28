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
//平台商品图片表
@Service("CpzPlatProductPicService")
public class CpzPlatProductPicServiceImpl implements CpzPlatProductPicService {
	private final static Logger logger = LoggerFactory.getLogger(CpzPlatProductPicServiceImpl.class);
	
	@Resource
	private CpzPlatProductPicMapper mapper;
	
	@Override
	public List<CpzPlatProductPicBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzPlatProductPicSelect(para);
	}

	@Override
public void  insert(CpzPlatProductPicBean bean){
 mapper.CpzPlatProductPicInsert(bean);
	}
	@Override
public void update(CpzPlatProductPicBean bean){
 mapper.CpzPlatProductPicUpdate(bean);
	}

	@Override
public void   delete(CpzPlatProductPicBean bean){
 mapper.CpzPlatProductPicDelete(bean);
	}
}

