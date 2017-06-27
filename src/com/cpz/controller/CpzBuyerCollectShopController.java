package com.cpz.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import com.cpz.pojo.CpzBuyerCollectShopBean;
import com.cpz.service.impl.CpzBuyerCollectShopService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;
import com.framework.utils.SpringBeanManger;

/**买家店铺收藏信息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyercollectshop")
public class CpzBuyerCollectShopController extends BaseController {
@Autowired
private CpzBuyerCollectShopService cpzBuyerCollectShopService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerCollectShopBean> cpzbuyercollectshopBeans=null;
try {
cpzbuyercollectshopBeans=cpzBuyerCollectShopService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyercollectshopBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		int shopBusineeRangeId = reqMap.get("shopBusineeRangeId") == null ? 0 :Integer.valueOf( reqMap.get("shopBusineeRangeId").toString());
		String isDefaultShop = reqMap.get("isDefaultShop") == null ? null : reqMap.get("isDefaultShop").toString();
		String colletcTime = reqMap.get("colletcTime") == null ? null : reqMap.get("colletcTime").toString();
CpzBuyerCollectShopBean cpzbuyercollectshopBean=new CpzBuyerCollectShopBean();
cpzbuyercollectshopBean.userId=userId;
cpzbuyercollectshopBean.shopId=shopId;
cpzbuyercollectshopBean.marketId=marketId;
cpzbuyercollectshopBean.shopBusineeRangeId=shopBusineeRangeId;
cpzbuyercollectshopBean.isDefaultShop=isDefaultShop;
cpzbuyercollectshopBean.colletcTime=colletcTime;
try {
cpzBuyerCollectShopService.insert(cpzbuyercollectshopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		int shopBusineeRangeId = reqMap.get("shopBusineeRangeId") == null ? 0 :Integer.valueOf( reqMap.get("shopBusineeRangeId").toString());
		String isDefaultShop = reqMap.get("isDefaultShop") == null ? null : reqMap.get("isDefaultShop").toString();
		String colletcTime = reqMap.get("colletcTime") == null ? null : reqMap.get("colletcTime").toString();
CpzBuyerCollectShopBean cpzbuyercollectshopBean=new CpzBuyerCollectShopBean();
cpzbuyercollectshopBean.userId=userId;
cpzbuyercollectshopBean.shopId=shopId;
cpzbuyercollectshopBean.marketId=marketId;
cpzbuyercollectshopBean.shopBusineeRangeId=shopBusineeRangeId;
cpzbuyercollectshopBean.isDefaultShop=isDefaultShop;
cpzbuyercollectshopBean.colletcTime=colletcTime;
try {
cpzBuyerCollectShopService.update(cpzbuyercollectshopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
CpzBuyerCollectShopBean cpzbuyercollectshopBean=new CpzBuyerCollectShopBean();
cpzbuyercollectshopBean.userId=userId;
cpzbuyercollectshopBean.shopId=shopId;
try {
cpzBuyerCollectShopService.delete(cpzbuyercollectshopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

