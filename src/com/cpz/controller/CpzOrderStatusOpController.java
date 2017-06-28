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

/**订单状态操作表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzorderstatusop")
public class CpzOrderStatusOpController extends BaseController {
@Autowired
private CpzOrderStatusOpService cpzOrderStatusOpService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzOrderStatusOpBean> cpzorderstatusopBeans=null;
try {
cpzorderstatusopBeans=cpzOrderStatusOpService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzorderstatusopBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderNo = reqMap.get("orderNo") == null ? 0 :Integer.valueOf( reqMap.get("orderNo").toString());
		String orderStatus = reqMap.get("orderStatus") == null ? null : reqMap.get("orderStatus").toString();
		String opFalg = reqMap.get("opFalg") == null ? null : reqMap.get("opFalg").toString();
CpzOrderStatusOpBean cpzorderstatusopBean=new CpzOrderStatusOpBean();
cpzorderstatusopBean.orderNo=orderNo;
cpzorderstatusopBean.orderStatus=orderStatus;
cpzorderstatusopBean.opFalg=opFalg;
try {
cpzOrderStatusOpService.insert(cpzorderstatusopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderNo = reqMap.get("orderNo") == null ? 0 :Integer.valueOf( reqMap.get("orderNo").toString());
		String orderStatus = reqMap.get("orderStatus") == null ? null : reqMap.get("orderStatus").toString();
		String opFalg = reqMap.get("opFalg") == null ? null : reqMap.get("opFalg").toString();
CpzOrderStatusOpBean cpzorderstatusopBean=new CpzOrderStatusOpBean();
cpzorderstatusopBean.orderNo=orderNo;
cpzorderstatusopBean.orderStatus=orderStatus;
cpzorderstatusopBean.opFalg=opFalg;
try {
cpzOrderStatusOpService.update(cpzorderstatusopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int orderNo = reqMap.get("orderNo") == null ? 0 :Integer.valueOf( reqMap.get("orderNo").toString());
CpzOrderStatusOpBean cpzorderstatusopBean=new CpzOrderStatusOpBean();
cpzorderstatusopBean.orderNo=orderNo;
try {
cpzOrderStatusOpService.delete(cpzorderstatusopBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

