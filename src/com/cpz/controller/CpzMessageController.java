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

import com.cpz.pojo.CpzMessageBean;
import com.cpz.service.impl.CpzMessageService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**消息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzmessage")
public class CpzMessageController extends BaseController {
@Autowired
private CpzMessageService cpzMessageService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzMessageBean> cpzmessageBeans=null;
try {
cpzmessageBeans=cpzMessageService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzmessageBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageId = reqMap.get("messageId") == null ? 0 :Integer.valueOf( reqMap.get("messageId").toString());
		String messageDetail = reqMap.get("messageDetail") == null ? null : reqMap.get("messageDetail").toString();
		String messageType = reqMap.get("messageType") == null ? null : reqMap.get("messageType").toString();
		int readMessageFlag = reqMap.get("readMessageFlag") == null ? 0 :Integer.valueOf( reqMap.get("readMessageFlag").toString());
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
		String messageChannel = reqMap.get("messageChannel") == null ? null : reqMap.get("messageChannel").toString();
		String messageLinkType = reqMap.get("messageLinkType") == null ? null : reqMap.get("messageLinkType").toString();
		String messageLinkPara = reqMap.get("messageLinkPara") == null ? null : reqMap.get("messageLinkPara").toString();
CpzMessageBean cpzmessageBean=new CpzMessageBean();
cpzmessageBean.messageId=messageId;
cpzmessageBean.messageDetail=messageDetail;
cpzmessageBean.messageType=messageType;
cpzmessageBean.readMessageFlag=readMessageFlag;
cpzmessageBean.systemNo=systemNo;
cpzmessageBean.messageChannel=messageChannel;
cpzmessageBean.messageLinkType=messageLinkType;
cpzmessageBean.messageLinkPara=messageLinkPara;
try {
cpzMessageService.insert(cpzmessageBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageId = reqMap.get("messageId") == null ? 0 :Integer.valueOf( reqMap.get("messageId").toString());
		String messageDetail = reqMap.get("messageDetail") == null ? null : reqMap.get("messageDetail").toString();
		String messageType = reqMap.get("messageType") == null ? null : reqMap.get("messageType").toString();
		int readMessageFlag = reqMap.get("readMessageFlag") == null ? 0 :Integer.valueOf( reqMap.get("readMessageFlag").toString());
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
		String messageChannel = reqMap.get("messageChannel") == null ? null : reqMap.get("messageChannel").toString();
		String messageLinkType = reqMap.get("messageLinkType") == null ? null : reqMap.get("messageLinkType").toString();
		String messageLinkPara = reqMap.get("messageLinkPara") == null ? null : reqMap.get("messageLinkPara").toString();
CpzMessageBean cpzmessageBean=new CpzMessageBean();
cpzmessageBean.messageId=messageId;
cpzmessageBean.messageDetail=messageDetail;
cpzmessageBean.messageType=messageType;
cpzmessageBean.readMessageFlag=readMessageFlag;
cpzmessageBean.systemNo=systemNo;
cpzmessageBean.messageChannel=messageChannel;
cpzmessageBean.messageLinkType=messageLinkType;
cpzmessageBean.messageLinkPara=messageLinkPara;
try {
cpzMessageService.update(cpzmessageBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int messageId = reqMap.get("messageId") == null ? 0 :Integer.valueOf( reqMap.get("messageId").toString());
CpzMessageBean cpzmessageBean=new CpzMessageBean();
cpzmessageBean.messageId=messageId;
try {
cpzMessageService.delete(cpzmessageBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

