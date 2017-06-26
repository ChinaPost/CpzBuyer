package com.cpz.service.impl;
import java.util.List;

import com.cpz.pojo.BuyerPoductSeachBean;

public interface BuyerPoductSeachService {
	List<BuyerPoductSeachBean> get(String productName,String productType) throws Exception;
}

