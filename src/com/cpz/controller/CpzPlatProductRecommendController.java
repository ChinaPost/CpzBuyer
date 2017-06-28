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

import com.cpz.pojo.CpzPlatProductRecommendBean;
import com.cpz.service.impl.CpzPlatProductRecommendService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**平台商品推荐表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzplatproductrecommend")
public class CpzPlatProductRecommendController extends BaseController {
@Autowired
private CpzPlatProductRecommendService cpzPlatProductRecommendService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzPlatProductRecommendBean> cpzplatproductrecommendBeans=null;
try {
cpzplatproductrecommendBeans=cpzPlatProductRecommendService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzplatproductrecommendBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String saleType = reqMap.get("saleType") == null ? null : reqMap.get("saleType").toString();
		String startTime = reqMap.get("startTime") == null ? null : reqMap.get("startTime").toString();
		String endTime = reqMap.get("endTime") == null ? null : reqMap.get("endTime").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductRecommendBean cpzplatproductrecommendBean=new CpzPlatProductRecommendBean();
cpzplatproductrecommendBean.Id=Id;
cpzplatproductrecommendBean.productId=productId;
cpzplatproductrecommendBean.channelNo=channelNo;
cpzplatproductrecommendBean.saleType=saleType;
cpzplatproductrecommendBean.startTime=startTime;
cpzplatproductrecommendBean.endTime=endTime;
cpzplatproductrecommendBean.createTime=createTime;
cpzplatproductrecommendBean.remark1=remark1;
try {
cpzPlatProductRecommendService.insert(cpzplatproductrecommendBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String saleType = reqMap.get("saleType") == null ? null : reqMap.get("saleType").toString();
		String startTime = reqMap.get("startTime") == null ? null : reqMap.get("startTime").toString();
		String endTime = reqMap.get("endTime") == null ? null : reqMap.get("endTime").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductRecommendBean cpzplatproductrecommendBean=new CpzPlatProductRecommendBean();
cpzplatproductrecommendBean.Id=Id;
cpzplatproductrecommendBean.productId=productId;
cpzplatproductrecommendBean.channelNo=channelNo;
cpzplatproductrecommendBean.saleType=saleType;
cpzplatproductrecommendBean.startTime=startTime;
cpzplatproductrecommendBean.endTime=endTime;
cpzplatproductrecommendBean.createTime=createTime;
cpzplatproductrecommendBean.remark1=remark1;
try {
cpzPlatProductRecommendService.update(cpzplatproductrecommendBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
CpzPlatProductRecommendBean cpzplatproductrecommendBean=new CpzPlatProductRecommendBean();
cpzplatproductrecommendBean.Id=Id;
try {
cpzPlatProductRecommendService.delete(cpzplatproductrecommendBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

