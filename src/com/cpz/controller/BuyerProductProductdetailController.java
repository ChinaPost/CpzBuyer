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

import com.cpz.pojo.BuyerProductProductdetailBean;
import com.cpz.service.impl.BuyerProductProductdetailService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/** 4.2.2.3菜品详情或者套餐详情查询*/
@Controller
@Scope("prototype")
@RequestMapping("/buyerproductproductdetail")
public class BuyerProductProductdetailController extends BaseController {
@Autowired
private BuyerProductProductdetailService buyerProductProductdetailService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
Map paraMap=new HashMap();
		int productID = reqMap.get("productID") == null ? 0 :Integer.valueOf( reqMap.get("productID").toString());
paraMap.put("productID",productID);
List<BuyerProductProductdetailBean> buyerproductproductdetailBeans=null;
try {
buyerproductproductdetailBeans=buyerProductProductdetailService.get(paraMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",buyerproductproductdetailBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
}

