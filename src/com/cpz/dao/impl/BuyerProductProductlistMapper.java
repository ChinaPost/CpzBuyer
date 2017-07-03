package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.BuyerProductProductlistBean;
//菜品或者套餐列表查询（菜品分类点更多）
public interface BuyerProductProductlistMapper {
List<BuyerProductProductlistBean> BuyerProductProductlistSelect(Map para);
}

