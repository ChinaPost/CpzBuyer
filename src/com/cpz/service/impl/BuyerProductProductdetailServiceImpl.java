package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.BuyerProductProductdetailMapper;
import com.cpz.pojo.BuyerProductProductdetailBean;
// 4.2.2.3菜品详情或者套餐详情查询
@Service("BuyerProductProductdetailService")
public class BuyerProductProductdetailServiceImpl implements BuyerProductProductdetailService {
	private final static Logger logger = LoggerFactory.getLogger(BuyerProductProductdetailServiceImpl.class);
	
	@Resource
	private BuyerProductProductdetailMapper mapper;
	
	@Override
	public List<BuyerProductProductdetailBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
//m.put("productID", productID);
return mapper.BuyerProductProductdetailSelect(para);
	}
}

