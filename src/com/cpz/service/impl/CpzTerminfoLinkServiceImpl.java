package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzTerminfoLinkMapper;
import com.cpz.pojo.CpzTerminfoLinkBean;
//买家或者卖家关联第三方信息表
@Service("CpzTerminfoLinkService")
public class CpzTerminfoLinkServiceImpl implements CpzTerminfoLinkService {
	private final static Logger logger = LoggerFactory.getLogger(CpzTerminfoLinkServiceImpl.class);
	
	@Resource
	private CpzTerminfoLinkMapper mapper;
	
	@Override
	public List<CpzTerminfoLinkBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.CpzTerminfoLinkSelect(para);
	}

	@Override
public void  insert(CpzTerminfoLinkBean bean){
 mapper.CpzTerminfoLinkInsert(bean);
	}
	@Override
public void update(CpzTerminfoLinkBean bean){
 mapper.CpzTerminfoLinkUpdate(bean);
	}

	@Override
public void   delete(CpzTerminfoLinkBean bean){
 mapper.CpzTerminfoLinkDelete(bean);
	}
}

