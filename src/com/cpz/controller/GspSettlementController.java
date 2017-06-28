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

/**结算表*/
@Controller
@Scope("prototype")
@RequestMapping("/gspsettlement")
public class GspSettlementController extends BaseController {
@Autowired
private GspSettlementService gspSettlementService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<GspSettlementBean> gspsettlementBeans=null;
try {
gspsettlementBeans=gspSettlementService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",gspsettlementBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int settId = reqMap.get("settId") == null ? 0 :Integer.valueOf( reqMap.get("settId").toString());
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String settSn = reqMap.get("settSn") == null ? null : reqMap.get("settSn").toString();
		int status = reqMap.get("status") == null ? 0 :Integer.valueOf( reqMap.get("status").toString());
		String sumPrice = reqMap.get("sumPrice") == null ? null : reqMap.get("sumPrice").toString();
		int sellerId = reqMap.get("sellerId") == null ? 0 :Integer.valueOf( reqMap.get("sellerId").toString());
GspSettlementBean gspsettlementBean=new GspSettlementBean();
gspsettlementBean.settId=settId;
gspsettlementBean.orderNo=orderNo;
gspsettlementBean.settSn=settSn;
gspsettlementBean.status=status;
gspsettlementBean.sumPrice=sumPrice;
gspsettlementBean.sellerId=sellerId;
try {
gspSettlementService.insert(gspsettlementBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int settId = reqMap.get("settId") == null ? 0 :Integer.valueOf( reqMap.get("settId").toString());
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String settSn = reqMap.get("settSn") == null ? null : reqMap.get("settSn").toString();
		int status = reqMap.get("status") == null ? 0 :Integer.valueOf( reqMap.get("status").toString());
		String sumPrice = reqMap.get("sumPrice") == null ? null : reqMap.get("sumPrice").toString();
		int sellerId = reqMap.get("sellerId") == null ? 0 :Integer.valueOf( reqMap.get("sellerId").toString());
GspSettlementBean gspsettlementBean=new GspSettlementBean();
gspsettlementBean.settId=settId;
gspsettlementBean.orderNo=orderNo;
gspsettlementBean.settSn=settSn;
gspsettlementBean.status=status;
gspsettlementBean.sumPrice=sumPrice;
gspsettlementBean.sellerId=sellerId;
try {
gspSettlementService.update(gspsettlementBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int settId = reqMap.get("settId") == null ? 0 :Integer.valueOf( reqMap.get("settId").toString());
GspSettlementBean gspsettlementBean=new GspSettlementBean();
gspsettlementBean.settId=settId;
try {
gspSettlementService.delete(gspsettlementBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

