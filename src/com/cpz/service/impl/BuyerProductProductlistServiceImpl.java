package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.BuyerProductProductlistMapper;
import com.cpz.pojo.BuyerProductProductlistBean;
//菜品或者套餐列表查询（菜品分类点更多）
@Service("BuyerProductProductlistService")
public class BuyerProductProductlistServiceImpl implements BuyerProductProductlistService {
	private final static Logger logger = LoggerFactory.getLogger(BuyerProductProductlistServiceImpl.class);
	
	@Resource
	private BuyerProductProductlistMapper mapper;
	
	@Override
	public List<BuyerProductProductlistBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
//m.put("productCategoryId", productCategoryId);
//m.put("productType", productType);

return mapper.BuyerProductProductlistSelect(para);
	}
}

