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

import com.cpz.pojo.BuyerProductGuessyoulikeBean;
import com.cpz.service.impl.BuyerProductGuessyoulikeService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**4.2.2.4	猜你喜欢菜品查询*/
@Controller
@Scope("prototype")
@RequestMapping("/buyerproductguessyoulike")
public class BuyerProductGuessyoulikeController extends BaseController {
@Autowired
private BuyerProductGuessyoulikeService buyerProductGuessyoulikeService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
Map paraMap=new HashMap();
		int productID = reqMap.get("productID") == null ? 0 :Integer.valueOf( reqMap.get("productID").toString());
paraMap.put("productID",productID);
List<BuyerProductGuessyoulikeBean> buyerproductguessyoulikeBeans=null;
try {
buyerproductguessyoulikeBeans=buyerProductGuessyoulikeService.get(paraMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",buyerproductguessyoulikeBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
}

