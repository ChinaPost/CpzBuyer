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

/**订单或者退款单日志表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyerlog")
public class CpzBuyerLogController extends BaseController {
@Autowired
private CpzBuyerLogService cpzBuyerLogService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerLogBean> cpzbuyerlogBeans=null;
try {
cpzbuyerlogBeans=cpzBuyerLogService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyerlogBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderLogId = reqMap.get("orderLogId") == null ? 0 :Integer.valueOf( reqMap.get("orderLogId").toString());
		int dealTime = reqMap.get("dealTime") == null ? 0 :Integer.valueOf( reqMap.get("dealTime").toString());
		String dealType = reqMap.get("dealType") == null ? null : reqMap.get("dealType").toString();
		String dealContent = reqMap.get("dealContent") == null ? null : reqMap.get("dealContent").toString();
		int dealPerson = reqMap.get("dealPerson") == null ? 0 :Integer.valueOf( reqMap.get("dealPerson").toString());
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
CpzBuyerLogBean cpzbuyerlogBean=new CpzBuyerLogBean();
cpzbuyerlogBean.orderLogId=orderLogId;
cpzbuyerlogBean.dealTime=dealTime;
cpzbuyerlogBean.dealType=dealType;
cpzbuyerlogBean.dealContent=dealContent;
cpzbuyerlogBean.dealPerson=dealPerson;
cpzbuyerlogBean.lonValue=lonValue;
cpzbuyerlogBean.latValue=latValue;
try {
cpzBuyerLogService.insert(cpzbuyerlogBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderLogId = reqMap.get("orderLogId") == null ? 0 :Integer.valueOf( reqMap.get("orderLogId").toString());
		int dealTime = reqMap.get("dealTime") == null ? 0 :Integer.valueOf( reqMap.get("dealTime").toString());
		String dealType = reqMap.get("dealType") == null ? null : reqMap.get("dealType").toString();
		String dealContent = reqMap.get("dealContent") == null ? null : reqMap.get("dealContent").toString();
		int dealPerson = reqMap.get("dealPerson") == null ? 0 :Integer.valueOf( reqMap.get("dealPerson").toString());
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
CpzBuyerLogBean cpzbuyerlogBean=new CpzBuyerLogBean();
cpzbuyerlogBean.orderLogId=orderLogId;
cpzbuyerlogBean.dealTime=dealTime;
cpzbuyerlogBean.dealType=dealType;
cpzbuyerlogBean.dealContent=dealContent;
cpzbuyerlogBean.dealPerson=dealPerson;
cpzbuyerlogBean.lonValue=lonValue;
cpzbuyerlogBean.latValue=latValue;
try {
cpzBuyerLogService.update(cpzbuyerlogBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderLogId = reqMap.get("orderLogId") == null ? 0 :Integer.valueOf( reqMap.get("orderLogId").toString());
CpzBuyerLogBean cpzbuyerlogBean=new CpzBuyerLogBean();
cpzbuyerlogBean.orderLogId=orderLogId;
try {
cpzBuyerLogService.delete(cpzbuyerlogBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

