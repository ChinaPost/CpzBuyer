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

/**市场表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzmarket")
public class CpzMarketController extends BaseController {
@Autowired
private CpzMarketService cpzMarketService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzMarketBean> cpzmarketBeans=null;
try {
cpzmarketBeans=cpzMarketService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzmarketBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		String marketName = reqMap.get("marketName") == null ? null : reqMap.get("marketName").toString();
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
		String provCode = reqMap.get("provCode") == null ? null : reqMap.get("provCode").toString();
		String cityCode = reqMap.get("cityCode") == null ? null : reqMap.get("cityCode").toString();
		String countyCode = reqMap.get("countyCode") == null ? null : reqMap.get("countyCode").toString();
		String marketArea = reqMap.get("marketArea") == null ? null : reqMap.get("marketArea").toString();
		String marketAddr = reqMap.get("marketAddr") == null ? null : reqMap.get("marketAddr").toString();
CpzMarketBean cpzmarketBean=new CpzMarketBean();
cpzmarketBean.marketId=marketId;
cpzmarketBean.marketName=marketName;
cpzmarketBean.lonValue=lonValue;
cpzmarketBean.latValue=latValue;
cpzmarketBean.provCode=provCode;
cpzmarketBean.cityCode=cityCode;
cpzmarketBean.countyCode=countyCode;
cpzmarketBean.marketArea=marketArea;
cpzmarketBean.marketAddr=marketAddr;
try {
cpzMarketService.insert(cpzmarketBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		String marketName = reqMap.get("marketName") == null ? null : reqMap.get("marketName").toString();
		String lonValue = reqMap.get("lonValue") == null ? null : reqMap.get("lonValue").toString();
		String latValue = reqMap.get("latValue") == null ? null : reqMap.get("latValue").toString();
		String provCode = reqMap.get("provCode") == null ? null : reqMap.get("provCode").toString();
		String cityCode = reqMap.get("cityCode") == null ? null : reqMap.get("cityCode").toString();
		String countyCode = reqMap.get("countyCode") == null ? null : reqMap.get("countyCode").toString();
		String marketArea = reqMap.get("marketArea") == null ? null : reqMap.get("marketArea").toString();
		String marketAddr = reqMap.get("marketAddr") == null ? null : reqMap.get("marketAddr").toString();
CpzMarketBean cpzmarketBean=new CpzMarketBean();
cpzmarketBean.marketId=marketId;
cpzmarketBean.marketName=marketName;
cpzmarketBean.lonValue=lonValue;
cpzmarketBean.latValue=latValue;
cpzmarketBean.provCode=provCode;
cpzmarketBean.cityCode=cityCode;
cpzmarketBean.countyCode=countyCode;
cpzmarketBean.marketArea=marketArea;
cpzmarketBean.marketAddr=marketAddr;
try {
cpzMarketService.update(cpzmarketBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
CpzMarketBean cpzmarketBean=new CpzMarketBean();
cpzmarketBean.marketId=marketId;
try {
cpzMarketService.delete(cpzmarketBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

