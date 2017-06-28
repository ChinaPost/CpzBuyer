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

/**卖家商品规格表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzshopproductnorms")
public class CpzShopProductNormsController extends BaseController {
@Autowired
private CpzShopProductNormsService cpzShopProductNormsService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzShopProductNormsBean> cpzshopproductnormsBeans=null;
try {
cpzshopproductnormsBeans=cpzShopProductNormsService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzshopproductnormsBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopNormsId = reqMap.get("shopNormsId") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsId").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String normsName = reqMap.get("normsName") == null ? null : reqMap.get("normsName").toString();
		String normsPrice = reqMap.get("normsPrice") == null ? null : reqMap.get("normsPrice").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzShopProductNormsBean cpzshopproductnormsBean=new CpzShopProductNormsBean();
cpzshopproductnormsBean.shopNormsId=shopNormsId;
cpzshopproductnormsBean.shopProductId=shopProductId;
cpzshopproductnormsBean.normsName=normsName;
cpzshopproductnormsBean.normsPrice=normsPrice;
cpzshopproductnormsBean.remark1=remark1;
try {
cpzShopProductNormsService.insert(cpzshopproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopNormsId = reqMap.get("shopNormsId") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsId").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String normsName = reqMap.get("normsName") == null ? null : reqMap.get("normsName").toString();
		String normsPrice = reqMap.get("normsPrice") == null ? null : reqMap.get("normsPrice").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzShopProductNormsBean cpzshopproductnormsBean=new CpzShopProductNormsBean();
cpzshopproductnormsBean.shopNormsId=shopNormsId;
cpzshopproductnormsBean.shopProductId=shopProductId;
cpzshopproductnormsBean.normsName=normsName;
cpzshopproductnormsBean.normsPrice=normsPrice;
cpzshopproductnormsBean.remark1=remark1;
try {
cpzShopProductNormsService.update(cpzshopproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopNormsId = reqMap.get("shopNormsId") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsId").toString());
CpzShopProductNormsBean cpzshopproductnormsBean=new CpzShopProductNormsBean();
cpzshopproductnormsBean.shopNormsId=shopNormsId;
try {
cpzShopProductNormsService.delete(cpzshopproductnormsBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

