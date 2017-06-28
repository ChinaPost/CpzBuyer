package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzMessageSetMapper;
import com.cpz.pojo.CpzMessageSetBean;
//消息设置表
@Service("CpzMessageSetService")
public class CpzMessageSetServiceImpl implements CpzMessageSetService {
	private final static Logger logger = LoggerFactory.getLogger(CpzMessageSetServiceImpl.class);
	
	@Resource
	private CpzMessageSetMapper mapper;
	
	@Override
	public List<CpzMessageSetBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzMessageSetSelect(para);
	}

	@Override
public void  insert(CpzMessageSetBean bean){
 mapper.CpzMessageSetInsert(bean);
	}
	@Override
public void update(CpzMessageSetBean bean){
 mapper.CpzMessageSetUpdate(bean);
	}

	@Override
public void   delete(CpzMessageSetBean bean){
 mapper.CpzMessageSetDelete(bean);
	}
}

