package com.cpz.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.BuyerProductGuessyoulikeMapper;
import com.cpz.pojo.BuyerProductGuessyoulikeBean;
//4.2.2.4	猜你喜欢菜品查询
@Service("BuyerProductGuessyoulikeService")
public class BuyerProductGuessyoulikeServiceImpl implements BuyerProductGuessyoulikeService {
	private final static Logger logger = LoggerFactory.getLogger(BuyerProductGuessyoulikeServiceImpl.class);
	
	@Resource
	private BuyerProductGuessyoulikeMapper mapper;
	
	@Override
	public List<BuyerProductGuessyoulikeBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
//m.put("productID", productID);
return mapper.BuyerProductGuessyoulikeSelect(para);
	}
}

