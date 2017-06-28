package com.cpz.controller;
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
import com.framework.controller.BaseController;
import com.framework.utils.SpringBeanManger;

/**买家或者卖家关联第三方信息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzterminfolink")
public class CpzTerminfoLinkController extends BaseController {
@Autowired
private CpzTerminfoLinkService cpzTerminfoLinkService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzTerminfoLinkBean> cpzterminfolinkBeans=null;
try {
cpzterminfolinkBeans=cpzTerminfoLinkService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzterminfolinkBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
		String systemTyoe = reqMap.get("systemTyoe") == null ? null : reqMap.get("systemTyoe").toString();
		String linkType = reqMap.get("linkType") == null ? null : reqMap.get("linkType").toString();
		String linkNo = reqMap.get("linkNo") == null ? null : reqMap.get("linkNo").toString();
		String linkTime = reqMap.get("linkTime") == null ? null : reqMap.get("linkTime").toString();
CpzTerminfoLinkBean cpzterminfolinkBean=new CpzTerminfoLinkBean();
cpzterminfolinkBean.systemNo=systemNo;
cpzterminfolinkBean.systemTyoe=systemTyoe;
cpzterminfolinkBean.linkType=linkType;
cpzterminfolinkBean.linkNo=linkNo;
cpzterminfolinkBean.linkTime=linkTime;
try {
cpzTerminfoLinkService.insert(cpzterminfolinkBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
		String systemTyoe = reqMap.get("systemTyoe") == null ? null : reqMap.get("systemTyoe").toString();
		String linkType = reqMap.get("linkType") == null ? null : reqMap.get("linkType").toString();
		String linkNo = reqMap.get("linkNo") == null ? null : reqMap.get("linkNo").toString();
		String linkTime = reqMap.get("linkTime") == null ? null : reqMap.get("linkTime").toString();
CpzTerminfoLinkBean cpzterminfolinkBean=new CpzTerminfoLinkBean();
cpzterminfolinkBean.systemNo=systemNo;
cpzterminfolinkBean.systemTyoe=systemTyoe;
cpzterminfolinkBean.linkType=linkType;
cpzterminfolinkBean.linkNo=linkNo;
cpzterminfolinkBean.linkTime=linkTime;
try {
cpzTerminfoLinkService.update(cpzterminfolinkBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int systemNo = reqMap.get("systemNo") == null ? 0 :Integer.valueOf( reqMap.get("systemNo").toString());
CpzTerminfoLinkBean cpzterminfolinkBean=new CpzTerminfoLinkBean();
cpzterminfolinkBean.systemNo=systemNo;
try {
cpzTerminfoLinkService.delete(cpzterminfolinkBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

