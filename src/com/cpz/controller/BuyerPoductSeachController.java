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

import com.cpz.pojo.BuyerPoductSeachBean;
import com.cpz.service.impl.BuyerPoductSeachService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**菜品搜索查询*/
@Controller
@Scope("prototype")
@RequestMapping("/buyerpoductseach")
public class BuyerPoductSeachController extends BaseController {
@Autowired
private BuyerPoductSeachService buyerPoductSeachService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String productName = reqMap.get("productName") == null ? null : reqMap.get("productName").toString();
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
List<BuyerPoductSeachBean> buyerpoductseachBeans=null;
try {
buyerpoductseachBeans=buyerPoductSeachService.get(productName,productType);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",buyerpoductseachBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
}

