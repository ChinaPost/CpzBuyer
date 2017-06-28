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

import com.cpz.pojo.CpzPlatProductBean;
import com.cpz.service.impl.CpzPlatProductService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**平台商品信息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzplatproduct")
public class CpzPlatProductController extends BaseController {
@Autowired
private CpzPlatProductService cpzPlatProductService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzPlatProductBean> cpzplatproductBeans=null;
try {
cpzplatproductBeans=cpzPlatProductService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzplatproductBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productID = reqMap.get("productID") == null ? 0 :Integer.valueOf( reqMap.get("productID").toString());
		String productName = reqMap.get("productName") == null ? null : reqMap.get("productName").toString();
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
		String productStatus = reqMap.get("productStatus") == null ? null : reqMap.get("productStatus").toString();
		String tradingUnit = reqMap.get("tradingUnit") == null ? null : reqMap.get("tradingUnit").toString();
		String productColor = reqMap.get("productColor") == null ? null : reqMap.get("productColor").toString();
		String isFresh = reqMap.get("isFresh") == null ? null : reqMap.get("isFresh").toString();
		String sourceArea = reqMap.get("sourceArea") == null ? null : reqMap.get("sourceArea").toString();
		String isCanRefund = reqMap.get("isCanRefund") == null ? null : reqMap.get("isCanRefund").toString();
		String isNeedSpot = reqMap.get("isNeedSpot") == null ? null : reqMap.get("isNeedSpot").toString();
		String productDetail = reqMap.get("productDetail") == null ? null : reqMap.get("productDetail").toString();
		int supportDay = reqMap.get("supportDay") == null ? 0 :Integer.valueOf( reqMap.get("supportDay").toString());
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String remakr1 = reqMap.get("remakr1") == null ? null : reqMap.get("remakr1").toString();
		String remakr2 = reqMap.get("remakr2") == null ? null : reqMap.get("remakr2").toString();
CpzPlatProductBean cpzplatproductBean=new CpzPlatProductBean();
cpzplatproductBean.productID=productID;
cpzplatproductBean.productName=productName;
cpzplatproductBean.productCategoryId=productCategoryId;
cpzplatproductBean.productType=productType;
cpzplatproductBean.productStatus=productStatus;
cpzplatproductBean.tradingUnit=tradingUnit;
cpzplatproductBean.productColor=productColor;
cpzplatproductBean.isFresh=isFresh;
cpzplatproductBean.sourceArea=sourceArea;
cpzplatproductBean.isCanRefund=isCanRefund;
cpzplatproductBean.isNeedSpot=isNeedSpot;
cpzplatproductBean.productDetail=productDetail;
cpzplatproductBean.supportDay=supportDay;
cpzplatproductBean.channelNo=channelNo;
cpzplatproductBean.remakr1=remakr1;
cpzplatproductBean.remakr2=remakr2;
try {
cpzPlatProductService.insert(cpzplatproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productID = reqMap.get("productID") == null ? 0 :Integer.valueOf( reqMap.get("productID").toString());
		String productName = reqMap.get("productName") == null ? null : reqMap.get("productName").toString();
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
		String productType = reqMap.get("productType") == null ? null : reqMap.get("productType").toString();
		String productStatus = reqMap.get("productStatus") == null ? null : reqMap.get("productStatus").toString();
		String tradingUnit = reqMap.get("tradingUnit") == null ? null : reqMap.get("tradingUnit").toString();
		String productColor = reqMap.get("productColor") == null ? null : reqMap.get("productColor").toString();
		String isFresh = reqMap.get("isFresh") == null ? null : reqMap.get("isFresh").toString();
		String sourceArea = reqMap.get("sourceArea") == null ? null : reqMap.get("sourceArea").toString();
		String isCanRefund = reqMap.get("isCanRefund") == null ? null : reqMap.get("isCanRefund").toString();
		String isNeedSpot = reqMap.get("isNeedSpot") == null ? null : reqMap.get("isNeedSpot").toString();
		String productDetail = reqMap.get("productDetail") == null ? null : reqMap.get("productDetail").toString();
		int supportDay = reqMap.get("supportDay") == null ? 0 :Integer.valueOf( reqMap.get("supportDay").toString());
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String remakr1 = reqMap.get("remakr1") == null ? null : reqMap.get("remakr1").toString();
		String remakr2 = reqMap.get("remakr2") == null ? null : reqMap.get("remakr2").toString();
CpzPlatProductBean cpzplatproductBean=new CpzPlatProductBean();
cpzplatproductBean.productID=productID;
cpzplatproductBean.productName=productName;
cpzplatproductBean.productCategoryId=productCategoryId;
cpzplatproductBean.productType=productType;
cpzplatproductBean.productStatus=productStatus;
cpzplatproductBean.tradingUnit=tradingUnit;
cpzplatproductBean.productColor=productColor;
cpzplatproductBean.isFresh=isFresh;
cpzplatproductBean.sourceArea=sourceArea;
cpzplatproductBean.isCanRefund=isCanRefund;
cpzplatproductBean.isNeedSpot=isNeedSpot;
cpzplatproductBean.productDetail=productDetail;
cpzplatproductBean.supportDay=supportDay;
cpzplatproductBean.channelNo=channelNo;
cpzplatproductBean.remakr1=remakr1;
cpzplatproductBean.remakr2=remakr2;
try {
cpzPlatProductService.update(cpzplatproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productID = reqMap.get("productID") == null ? 0 :Integer.valueOf( reqMap.get("productID").toString());
CpzPlatProductBean cpzplatproductBean=new CpzPlatProductBean();
cpzplatproductBean.productID=productID;
try {
cpzPlatProductService.delete(cpzplatproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

