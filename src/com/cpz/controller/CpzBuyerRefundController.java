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

import com.cpz.pojo.CpzBuyerRefundBean;
import com.cpz.service.impl.CpzBuyerRefundService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**买家退款表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyerrefund")
public class CpzBuyerRefundController extends BaseController {
@Autowired
private CpzBuyerRefundService cpzBuyerRefundService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerRefundBean> cpzbuyerrefundBeans=null;
try {
cpzbuyerrefundBeans=cpzBuyerRefundService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyerrefundBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int refundId = reqMap.get("refundId") == null ? 0 :Integer.valueOf( reqMap.get("refundId").toString());
		String userId = reqMap.get("userId") == null ? null : reqMap.get("userId").toString();
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String refundReason = reqMap.get("refundReason") == null ? null : reqMap.get("refundReason").toString();
		String isConsultSeller = reqMap.get("isConsultSeller") == null ? null : reqMap.get("isConsultSeller").toString();
		String refundStyle = reqMap.get("refundStyle") == null ? null : reqMap.get("refundStyle").toString();
		String orderMoney = reqMap.get("orderMoney") == null ? null : reqMap.get("orderMoney").toString();
		String applyMoney = reqMap.get("applyMoney") == null ? null : reqMap.get("applyMoney").toString();
		String applyTime = reqMap.get("applyTime") == null ? null : reqMap.get("applyTime").toString();
		String refundTime = reqMap.get("refundTime") == null ? null : reqMap.get("refundTime").toString();
CpzBuyerRefundBean cpzbuyerrefundBean=new CpzBuyerRefundBean();
cpzbuyerrefundBean.refundId=refundId;
cpzbuyerrefundBean.userId=userId;
cpzbuyerrefundBean.orderNo=orderNo;
cpzbuyerrefundBean.refundReason=refundReason;
cpzbuyerrefundBean.isConsultSeller=isConsultSeller;
cpzbuyerrefundBean.refundStyle=refundStyle;
cpzbuyerrefundBean.orderMoney=orderMoney;
cpzbuyerrefundBean.applyMoney=applyMoney;
cpzbuyerrefundBean.applyTime=applyTime;
cpzbuyerrefundBean.refundTime=refundTime;
try {
cpzBuyerRefundService.insert(cpzbuyerrefundBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int refundId = reqMap.get("refundId") == null ? 0 :Integer.valueOf( reqMap.get("refundId").toString());
		String userId = reqMap.get("userId") == null ? null : reqMap.get("userId").toString();
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String refundReason = reqMap.get("refundReason") == null ? null : reqMap.get("refundReason").toString();
		String isConsultSeller = reqMap.get("isConsultSeller") == null ? null : reqMap.get("isConsultSeller").toString();
		String refundStyle = reqMap.get("refundStyle") == null ? null : reqMap.get("refundStyle").toString();
		String orderMoney = reqMap.get("orderMoney") == null ? null : reqMap.get("orderMoney").toString();
		String applyMoney = reqMap.get("applyMoney") == null ? null : reqMap.get("applyMoney").toString();
		String applyTime = reqMap.get("applyTime") == null ? null : reqMap.get("applyTime").toString();
		String refundTime = reqMap.get("refundTime") == null ? null : reqMap.get("refundTime").toString();
CpzBuyerRefundBean cpzbuyerrefundBean=new CpzBuyerRefundBean();
cpzbuyerrefundBean.refundId=refundId;
cpzbuyerrefundBean.userId=userId;
cpzbuyerrefundBean.orderNo=orderNo;
cpzbuyerrefundBean.refundReason=refundReason;
cpzbuyerrefundBean.isConsultSeller=isConsultSeller;
cpzbuyerrefundBean.refundStyle=refundStyle;
cpzbuyerrefundBean.orderMoney=orderMoney;
cpzbuyerrefundBean.applyMoney=applyMoney;
cpzbuyerrefundBean.applyTime=applyTime;
cpzbuyerrefundBean.refundTime=refundTime;
try {
cpzBuyerRefundService.update(cpzbuyerrefundBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int refundId = reqMap.get("refundId") == null ? 0 :Integer.valueOf( reqMap.get("refundId").toString());
CpzBuyerRefundBean cpzbuyerrefundBean=new CpzBuyerRefundBean();
cpzbuyerrefundBean.refundId=refundId;
try {
cpzBuyerRefundService.delete(cpzbuyerrefundBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

