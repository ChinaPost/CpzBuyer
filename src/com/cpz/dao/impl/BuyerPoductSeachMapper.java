package com.cpz.dao.impl;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cpz.pojo.BuyerPoductSeachBean;

public interface BuyerPoductSeachMapper {
List<BuyerPoductSeachBean> BuyerPoductSeachSelect(@Param("productName")String productName,@Param("productType")String productType);
}

