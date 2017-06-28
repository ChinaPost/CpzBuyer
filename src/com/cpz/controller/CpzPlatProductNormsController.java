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

/**平台商品规格表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzplatproductnorms")
public class CpzPlatProductNormsController extends BaseController {
@Autowired
private CpzPlatProductNormsService cpzPlatProductNormsService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzPlatProductNormsBean> cpzplatproductnormsBeans=null;
try {
cpzplatproductnormsBeans=cpzPlatProductNormsService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzplatproductnormsBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int normsId = reqMap.get("normsId") == null ? 0 :Integer.valueOf( reqMap.get("normsId").toString());
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String normsName = reqMap.get("normsName") == null ? null : reqMap.get("normsName").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductNormsBean cpzplatproductnormsBean=new CpzPlatProductNormsBean();
cpzplatproductnormsBean.normsId=normsId;
cpzplatproductnormsBean.productId=productId;
cpzplatproductnormsBean.normsName=normsName;
cpzplatproductnormsBean.remark1=remark1;
try {
cpzPlatProductNormsService.insert(cpzplatproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int normsId = reqMap.get("normsId") == null ? 0 :Integer.valueOf( reqMap.get("normsId").toString());
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String normsName = reqMap.get("normsName") == null ? null : reqMap.get("normsName").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductNormsBean cpzplatproductnormsBean=new CpzPlatProductNormsBean();
cpzplatproductnormsBean.normsId=normsId;
cpzplatproductnormsBean.productId=productId;
cpzplatproductnormsBean.normsName=normsName;
cpzplatproductnormsBean.remark1=remark1;
try {
cpzPlatProductNormsService.update(cpzplatproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int normsId = reqMap.get("normsId") == null ? 0 :Integer.valueOf( reqMap.get("normsId").toString());
CpzPlatProductNormsBean cpzplatproductnormsBean=new CpzPlatProductNormsBean();
cpzplatproductnormsBean.normsId=normsId;
try {
cpzPlatProductNormsService.delete(cpzplatproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

