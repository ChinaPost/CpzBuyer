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
//消息表
@Service("CpzMessageService")
public class CpzMessageServiceImpl implements CpzMessageService {
	private final static Logger logger = LoggerFactory.getLogger(CpzMessageServiceImpl.class);
	
	@Resource
	private CpzMessageMapper mapper;
	
	@Override
	public List<CpzMessageBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzMessageSelect(para);
	}

	@Override
public void  insert(CpzMessageBean bean){
 mapper.CpzMessageInsert(bean);
	}
	@Override
public void update(CpzMessageBean bean){
 mapper.CpzMessageUpdate(bean);
	}

	@Override
public void   delete(CpzMessageBean bean){
 mapper.CpzMessageDelete(bean);
	}
}

