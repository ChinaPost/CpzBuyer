package com.cpz.service.impl;
import java.util.List;
import java.util.Map;

import com.cpz.pojo.BuyerProductGuessyoulikeBean;
//4.2.2.4	猜你喜欢菜品查询
public interface BuyerProductGuessyoulikeService {
	List<BuyerProductGuessyoulikeBean> get(Map para) throws Exception;
}

