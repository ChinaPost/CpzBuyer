package com.cpz.dao.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.BuyerProductProductdetailBean;
// 4.2.2.3菜品详情或者套餐详情查询
public interface BuyerProductProductdetailMapper {
List<BuyerProductProductdetailBean> BuyerProductProductdetailSelect(Map para);
}

