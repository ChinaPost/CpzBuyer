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

import com.cpz.pojo.CpzBuyerOrderProductBean;
import com.cpz.service.impl.CpzBuyerOrderProductService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**订单关联商品表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyerorderproduct")
public class CpzBuyerOrderProductController extends BaseController {
@Autowired
private CpzBuyerOrderProductService cpzBuyerOrderProductService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerOrderProductBean> cpzbuyerorderproductBeans=null;
try {
cpzbuyerorderproductBeans=cpzBuyerOrderProductService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyerorderproductBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String shopProductName = reqMap.get("shopProductName") == null ? null : reqMap.get("shopProductName").toString();
		int levelId = reqMap.get("levelId") == null ? 0 :Integer.valueOf( reqMap.get("levelId").toString());
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
		String shopNormsId = reqMap.get("shopNormsId") == null ? null : reqMap.get("shopNormsId").toString();
		int shopNormsNum = reqMap.get("shopNormsNum") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsNum").toString());
		String shopNormsPrice = reqMap.get("shopNormsPrice") == null ? null : reqMap.get("shopNormsPrice").toString();
CpzBuyerOrderProductBean cpzbuyerorderproductBean=new CpzBuyerOrderProductBean();
cpzbuyerorderproductBean.orderNo=orderNo;
cpzbuyerorderproductBean.shopProductId=shopProductId;
cpzbuyerorderproductBean.shopProductName=shopProductName;
cpzbuyerorderproductBean.levelId=levelId;
cpzbuyerorderproductBean.productType=productType;
cpzbuyerorderproductBean.shopNormsId=shopNormsId;
cpzbuyerorderproductBean.shopNormsNum=shopNormsNum;
cpzbuyerorderproductBean.shopNormsPrice=shopNormsPrice;
try {
cpzBuyerOrderProductService.insert(cpzbuyerorderproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String shopProductName = reqMap.get("shopProductName") == null ? null : reqMap.get("shopProductName").toString();
		int levelId = reqMap.get("levelId") == null ? 0 :Integer.valueOf( reqMap.get("levelId").toString());
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
		String shopNormsId = reqMap.get("shopNormsId") == null ? null : reqMap.get("shopNormsId").toString();
		int shopNormsNum = reqMap.get("shopNormsNum") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsNum").toString());
		String shopNormsPrice = reqMap.get("shopNormsPrice") == null ? null : reqMap.get("shopNormsPrice").toString();
CpzBuyerOrderProductBean cpzbuyerorderproductBean=new CpzBuyerOrderProductBean();
cpzbuyerorderproductBean.orderNo=orderNo;
cpzbuyerorderproductBean.shopProductId=shopProductId;
cpzbuyerorderproductBean.shopProductName=shopProductName;
cpzbuyerorderproductBean.levelId=levelId;
cpzbuyerorderproductBean.productType=productType;
cpzbuyerorderproductBean.shopNormsId=shopNormsId;
cpzbuyerorderproductBean.shopNormsNum=shopNormsNum;
cpzbuyerorderproductBean.shopNormsPrice=shopNormsPrice;
try {
cpzBuyerOrderProductService.update(cpzbuyerorderproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
CpzBuyerOrderProductBean cpzbuyerorderproductBean=new CpzBuyerOrderProductBean();
cpzbuyerorderproductBean.orderNo=orderNo;
cpzbuyerorderproductBean.shopProductId=shopProductId;
try {
cpzBuyerOrderProductService.delete(cpzbuyerorderproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

