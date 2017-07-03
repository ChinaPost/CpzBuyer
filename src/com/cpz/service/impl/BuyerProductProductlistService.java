package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.BuyerProductProductlistBean;
//菜品或者套餐列表查询（菜品分类点更多）
public interface BuyerProductProductlistService {
	List<BuyerProductProductlistBean> get(Map para) throws Exception;
}

