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

import com.cpz.pojo.CpzBuyerMsgBean;
import com.cpz.service.impl.CpzBuyerMsgService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**买家基本信息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyermsg")
public class CpzBuyerMsgController extends BaseController {
@Autowired
private CpzBuyerMsgService cpzBuyerMsgService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerMsgBean> cpzbuyermsgBeans=null;
try {
cpzbuyermsgBeans=cpzBuyerMsgService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyermsgBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		String moileNo = reqMap.get("moileNo") == null ? null : reqMap.get("moileNo").toString();
		String nickName = reqMap.get("nickName") == null ? null : reqMap.get("nickName").toString();
		String sex = reqMap.get("sex") == null ? null : reqMap.get("sex").toString();
		String headUrl = reqMap.get("headUrl") == null ? null : reqMap.get("headUrl").toString();
		String cstmLevel = reqMap.get("cstmLevel") == null ? null : reqMap.get("cstmLevel").toString();
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
CpzBuyerMsgBean cpzbuyermsgBean=new CpzBuyerMsgBean();
cpzbuyermsgBean.userId=userId;
cpzbuyermsgBean.moileNo=moileNo;
cpzbuyermsgBean.nickName=nickName;
cpzbuyermsgBean.sex=sex;
cpzbuyermsgBean.headUrl=headUrl;
cpzbuyermsgBean.cstmLevel=cstmLevel;
cpzbuyermsgBean.lonValue=lonValue;
cpzbuyermsgBean.latValue=latValue;
cpzbuyermsgBean.createTime=createTime;
try {
cpzBuyerMsgService.insert(cpzbuyermsgBean);
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
		String moileNo = reqMap.get("moileNo") == null ? null : reqMap.get("moileNo").toString();
		String nickName = reqMap.get("nickName") == null ? null : reqMap.get("nickName").toString();
		String sex = reqMap.get("sex") == null ? null : reqMap.get("sex").toString();
		String headUrl = reqMap.get("headUrl") == null ? null : reqMap.get("headUrl").toString();
		String cstmLevel = reqMap.get("cstmLevel") == null ? null : reqMap.get("cstmLevel").toString();
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
CpzBuyerMsgBean cpzbuyermsgBean=new CpzBuyerMsgBean();
cpzbuyermsgBean.userId=userId;
cpzbuyermsgBean.moileNo=moileNo;
cpzbuyermsgBean.nickName=nickName;
cpzbuyermsgBean.sex=sex;
cpzbuyermsgBean.headUrl=headUrl;
cpzbuyermsgBean.cstmLevel=cstmLevel;
cpzbuyermsgBean.lonValue=lonValue;
cpzbuyermsgBean.latValue=latValue;
cpzbuyermsgBean.createTime=createTime;
try {
cpzBuyerMsgService.update(cpzbuyermsgBean);
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
CpzBuyerMsgBean cpzbuyermsgBean=new CpzBuyerMsgBean();
cpzbuyermsgBean.userId=userId;
try {
cpzBuyerMsgService.delete(cpzbuyermsgBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

