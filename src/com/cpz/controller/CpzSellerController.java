package com.cpz.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cpz.pojo.CpzSellerBean;
import com.cpz.service.impl.CpzSellerService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;

/**卖家表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzseller")
public class CpzSellerController extends BaseController {
@Autowired
private CpzSellerService cpzSellerService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzSellerBean> cpzsellerBeans=null;
try {
cpzsellerBeans=cpzSellerService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzsellerBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int sellerId = reqMap.get("sellerId") == null ? 0 :Integer.valueOf( reqMap.get("sellerId").toString());
		String account = reqMap.get("account") == null ? null : reqMap.get("account").toString();
		String mobile = reqMap.get("mobile") == null ? null : reqMap.get("mobile").toString();
		String password = reqMap.get("password") == null ? null : reqMap.get("password").toString();
		int status = reqMap.get("status") == null ? 0 :Integer.valueOf( reqMap.get("status").toString());
CpzSellerBean cpzsellerBean=new CpzSellerBean();
cpzsellerBean.sellerId=sellerId;
cpzsellerBean.account=account;
cpzsellerBean.mobile=mobile;
cpzsellerBean.password=password;
cpzsellerBean.status=status;
try {
cpzSellerService.insert(cpzsellerBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int sellerId = reqMap.get("sellerId") == null ? 0 :Integer.valueOf( reqMap.get("sellerId").toString());
		String account = reqMap.get("account") == null ? null : reqMap.get("account").toString();
		String mobile = reqMap.get("mobile") == null ? null : reqMap.get("mobile").toString();
		String password = reqMap.get("password") == null ? null : reqMap.get("password").toString();
		int status = reqMap.get("status") == null ? 0 :Integer.valueOf( reqMap.get("status").toString());
CpzSellerBean cpzsellerBean=new CpzSellerBean();
cpzsellerBean.sellerId=sellerId;
cpzsellerBean.account=account;
cpzsellerBean.mobile=mobile;
cpzsellerBean.password=password;
cpzsellerBean.status=status;
try {
cpzSellerService.update(cpzsellerBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int sellerId = reqMap.get("sellerId") == null ? 0 :Integer.valueOf( reqMap.get("sellerId").toString());
CpzSellerBean cpzsellerBean=new CpzSellerBean();
cpzsellerBean.sellerId=sellerId;
try {
cpzSellerService.delete(cpzsellerBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

