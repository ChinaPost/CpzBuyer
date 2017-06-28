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

/**商品规格关联表*/
@Controller
@Scope("prototype")
@RequestMapping("/gspproductnormsmap")
public class GspProductNormsMapController extends BaseController {
@Autowired
private GspProductNormsMapService gspProductNormsMapService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<GspProductNormsMapBean> gspproductnormsmapBeans=null;
try {
gspproductnormsmapBeans=gspProductNormsMapService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",gspproductnormsmapBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		int shopNormsId = reqMap.get("shopNormsId") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsId").toString());
GspProductNormsMapBean gspproductnormsmapBean=new GspProductNormsMapBean();
gspproductnormsmapBean.Id=Id;
gspproductnormsmapBean.shopProductId=shopProductId;
gspproductnormsmapBean.shopNormsId=shopNormsId;
try {
gspProductNormsMapService.insert(gspproductnormsmapBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		int shopNormsId = reqMap.get("shopNormsId") == null ? 0 :Integer.valueOf( reqMap.get("shopNormsId").toString());
GspProductNormsMapBean gspproductnormsmapBean=new GspProductNormsMapBean();
gspproductnormsmapBean.Id=Id;
gspproductnormsmapBean.shopProductId=shopProductId;
gspproductnormsmapBean.shopNormsId=shopNormsId;
try {
gspProductNormsMapService.update(gspproductnormsmapBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int Id = reqMap.get("Id") == null ? 0 :Integer.valueOf( reqMap.get("Id").toString());
GspProductNormsMapBean gspproductnormsmapBean=new GspProductNormsMapBean();
gspproductnormsmapBean.Id=Id;
try {
gspProductNormsMapService.delete(gspproductnormsmapBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

