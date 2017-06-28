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

import com.cpz.pojo.CpzMessageSetBean;
import com.cpz.service.impl.CpzMessageSetService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**消息设置表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzmessageset")
public class CpzMessageSetController extends BaseController {
@Autowired
private CpzMessageSetService cpzMessageSetService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzMessageSetBean> cpzmessagesetBeans=null;
try {
cpzmessagesetBeans=cpzMessageSetService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzmessagesetBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageSetId = reqMap.get("messageSetId") == null ? 0 :Integer.valueOf( reqMap.get("messageSetId").toString());
		int messageType = reqMap.get("messageType") == null ? 0 :Integer.valueOf( reqMap.get("messageType").toString());
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
CpzMessageSetBean cpzmessagesetBean=new CpzMessageSetBean();
cpzmessagesetBean.messageSetId=messageSetId;
cpzmessagesetBean.messageType=messageType;
cpzmessagesetBean.systemNo=systemNo;
try {
cpzMessageSetService.insert(cpzmessagesetBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageSetId = reqMap.get("messageSetId") == null ? 0 :Integer.valueOf( reqMap.get("messageSetId").toString());
		int messageType = reqMap.get("messageType") == null ? 0 :Integer.valueOf( reqMap.get("messageType").toString());
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
CpzMessageSetBean cpzmessagesetBean=new CpzMessageSetBean();
cpzmessagesetBean.messageSetId=messageSetId;
cpzmessagesetBean.messageType=messageType;
cpzmessagesetBean.systemNo=systemNo;
try {
cpzMessageSetService.update(cpzmessagesetBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageSetId = reqMap.get("messageSetId") == null ? 0 :Integer.valueOf( reqMap.get("messageSetId").toString());
CpzMessageSetBean cpzmessagesetBean=new CpzMessageSetBean();
cpzmessagesetBean.messageSetId=messageSetId;
try {
cpzMessageSetService.delete(cpzmessagesetBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

