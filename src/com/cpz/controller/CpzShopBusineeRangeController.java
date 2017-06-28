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

/**店铺经营范围表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzshopbusineerange")
public class CpzShopBusineeRangeController extends BaseController {
@Autowired
private CpzShopBusineeRangeService cpzShopBusineeRangeService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzShopBusineeRangeBean> cpzshopbusineerangeBeans=null;
try {
cpzshopbusineerangeBeans=cpzShopBusineeRangeService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzshopbusineerangeBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopBusineeRangeId = reqMap.get("shopBusineeRangeId") == null ? 0 :Integer.valueOf( reqMap.get("shopBusineeRangeId").toString());
		String busiName = reqMap.get("busiName") == null ? null : reqMap.get("busiName").toString();
CpzShopBusineeRangeBean cpzshopbusineerangeBean=new CpzShopBusineeRangeBean();
cpzshopbusineerangeBean.shopBusineeRangeId=shopBusineeRangeId;
cpzshopbusineerangeBean.busiName=busiName;
try {
cpzShopBusineeRangeService.insert(cpzshopbusineerangeBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopBusineeRangeId = reqMap.get("shopBusineeRangeId") == null ? 0 :Integer.valueOf( reqMap.get("shopBusineeRangeId").toString());
		String busiName = reqMap.get("busiName") == null ? null : reqMap.get("busiName").toString();
CpzShopBusineeRangeBean cpzshopbusineerangeBean=new CpzShopBusineeRangeBean();
cpzshopbusineerangeBean.shopBusineeRangeId=shopBusineeRangeId;
cpzshopbusineerangeBean.busiName=busiName;
try {
cpzShopBusineeRangeService.update(cpzshopbusineerangeBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopBusineeRangeId = reqMap.get("shopBusineeRangeId") == null ? 0 :Integer.valueOf( reqMap.get("shopBusineeRangeId").toString());
CpzShopBusineeRangeBean cpzshopbusineerangeBean=new CpzShopBusineeRangeBean();
cpzshopbusineerangeBean.shopBusineeRangeId=shopBusineeRangeId;
try {
cpzShopBusineeRangeService.delete(cpzshopbusineerangeBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

