package com.cpz.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cpz.pojo.BuyerProductProductlistBean;
import com.cpz.service.impl.BuyerProductProductlistService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**菜品或者套餐列表查询（菜品分类点更多）*/
@Controller
@Scope("prototype")
@RequestMapping("/buyerproductproductlist")
public class BuyerProductProductlistController extends BaseController {
@Autowired
private BuyerProductProductlistService buyerProductProductlistService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
Map paraMap=new HashMap();
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
paraMap.put("productCategoryId",productCategoryId);
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
paraMap.put("productType",productType);
List<BuyerProductProductlistBean> buyerproductproductlistBeans=null;
try {
buyerproductproductlistBeans=buyerProductProductlistService.get(paraMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",buyerproductproductlistBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
}

