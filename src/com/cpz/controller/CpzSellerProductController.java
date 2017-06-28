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

/**卖家商品信息表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzsellerproduct")
public class CpzSellerProductController extends BaseController {
@Autowired
private CpzSellerProductService cpzSellerProductService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzSellerProductBean> cpzsellerproductBeans=null;
try {
cpzsellerproductBeans=cpzSellerProductService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzsellerproductBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String productName = reqMap.get("productName") == null ? null : reqMap.get("productName").toString();
		String productPic = reqMap.get("productPic") == null ? null : reqMap.get("productPic").toString();
		String merchIntro = reqMap.get("merchIntro") == null ? null : reqMap.get("merchIntro").toString();
		String description = reqMap.get("description") == null ? null : reqMap.get("description").toString();
		String productStatus = reqMap.get("productStatus") == null ? null : reqMap.get("productStatus").toString();
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String startTime = reqMap.get("startTime") == null ? null : reqMap.get("startTime").toString();
		String endTime = reqMap.get("endTime") == null ? null : reqMap.get("endTime").toString();
		String remakr1 = reqMap.get("remakr1") == null ? null : reqMap.get("remakr1").toString();
		int levelId = reqMap.get("levelId") == null ? 0 :Integer.valueOf( reqMap.get("levelId").toString());
CpzSellerProductBean cpzsellerproductBean=new CpzSellerProductBean();
cpzsellerproductBean.shopProductId=shopProductId;
cpzsellerproductBean.productName=productName;
cpzsellerproductBean.productPic=productPic;
cpzsellerproductBean.merchIntro=merchIntro;
cpzsellerproductBean.description=description;
cpzsellerproductBean.productStatus=productStatus;
cpzsellerproductBean.productId=productId;
cpzsellerproductBean.shopId=shopId;
cpzsellerproductBean.orderNo=orderNo;
cpzsellerproductBean.startTime=startTime;
cpzsellerproductBean.endTime=endTime;
cpzsellerproductBean.remakr1=remakr1;
cpzsellerproductBean.levelId=levelId;
try {
cpzSellerProductService.insert(cpzsellerproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		String productName = reqMap.get("productName") == null ? null : reqMap.get("productName").toString();
		String productPic = reqMap.get("productPic") == null ? null : reqMap.get("productPic").toString();
		String merchIntro = reqMap.get("merchIntro") == null ? null : reqMap.get("merchIntro").toString();
		String description = reqMap.get("description") == null ? null : reqMap.get("description").toString();
		String productStatus = reqMap.get("productStatus") == null ? null : reqMap.get("productStatus").toString();
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		String startTime = reqMap.get("startTime") == null ? null : reqMap.get("startTime").toString();
		String endTime = reqMap.get("endTime") == null ? null : reqMap.get("endTime").toString();
		String remakr1 = reqMap.get("remakr1") == null ? null : reqMap.get("remakr1").toString();
		int levelId = reqMap.get("levelId") == null ? 0 :Integer.valueOf( reqMap.get("levelId").toString());
CpzSellerProductBean cpzsellerproductBean=new CpzSellerProductBean();
cpzsellerproductBean.shopProductId=shopProductId;
cpzsellerproductBean.productName=productName;
cpzsellerproductBean.productPic=productPic;
cpzsellerproductBean.merchIntro=merchIntro;
cpzsellerproductBean.description=description;
cpzsellerproductBean.productStatus=productStatus;
cpzsellerproductBean.productId=productId;
cpzsellerproductBean.shopId=shopId;
cpzsellerproductBean.orderNo=orderNo;
cpzsellerproductBean.startTime=startTime;
cpzsellerproductBean.endTime=endTime;
cpzsellerproductBean.remakr1=remakr1;
cpzsellerproductBean.levelId=levelId;
try {
cpzSellerProductService.update(cpzsellerproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
CpzSellerProductBean cpzsellerproductBean=new CpzSellerProductBean();
cpzsellerproductBean.shopProductId=shopProductId;
try {
cpzSellerProductService.delete(cpzsellerproductBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

