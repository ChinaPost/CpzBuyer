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

/**买家购物车表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyershopping")
public class CpzBuyerShoppingController extends BaseController {
@Autowired
private CpzBuyerShoppingService cpzBuyerShoppingService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerShoppingBean> cpzbuyershoppingBeans=null;
try {
cpzbuyershoppingBeans=cpzBuyerShoppingService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyershoppingBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopCarId = reqMap.get("shopCarId") == null ? 0 :Integer.valueOf( reqMap.get("shopCarId").toString());
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		int normsId = reqMap.get("normsId") == null ? 0 :Integer.valueOf( reqMap.get("normsId").toString());
		int buyNum = reqMap.get("buyNum") == null ? 0 :Integer.valueOf( reqMap.get("buyNum").toString());
		String normsPrice = reqMap.get("normsPrice") == null ? null : reqMap.get("normsPrice").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
		String remark = reqMap.get("remark") == null ? null : reqMap.get("remark").toString();
CpzBuyerShoppingBean cpzbuyershoppingBean=new CpzBuyerShoppingBean();
cpzbuyershoppingBean.shopCarId=shopCarId;
cpzbuyershoppingBean.userId=userId;
cpzbuyershoppingBean.shopProductId=shopProductId;
cpzbuyershoppingBean.shopId=shopId;
cpzbuyershoppingBean.marketId=marketId;
cpzbuyershoppingBean.normsId=normsId;
cpzbuyershoppingBean.buyNum=buyNum;
cpzbuyershoppingBean.normsPrice=normsPrice;
cpzbuyershoppingBean.createTime=createTime;
cpzbuyershoppingBean.remark=remark;
try {
cpzBuyerShoppingService.insert(cpzbuyershoppingBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopCarId = reqMap.get("shopCarId") == null ? 0 :Integer.valueOf( reqMap.get("shopCarId").toString());
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		int shopProductId = reqMap.get("shopProductId") == null ? 0 :Integer.valueOf( reqMap.get("shopProductId").toString());
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		int normsId = reqMap.get("normsId") == null ? 0 :Integer.valueOf( reqMap.get("normsId").toString());
		int buyNum = reqMap.get("buyNum") == null ? 0 :Integer.valueOf( reqMap.get("buyNum").toString());
		String normsPrice = reqMap.get("normsPrice") == null ? null : reqMap.get("normsPrice").toString();
		String createTime = reqMap.get("createTime") == null ? null : reqMap.get("createTime").toString();
		String remark = reqMap.get("remark") == null ? null : reqMap.get("remark").toString();
CpzBuyerShoppingBean cpzbuyershoppingBean=new CpzBuyerShoppingBean();
cpzbuyershoppingBean.shopCarId=shopCarId;
cpzbuyershoppingBean.userId=userId;
cpzbuyershoppingBean.shopProductId=shopProductId;
cpzbuyershoppingBean.shopId=shopId;
cpzbuyershoppingBean.marketId=marketId;
cpzbuyershoppingBean.normsId=normsId;
cpzbuyershoppingBean.buyNum=buyNum;
cpzbuyershoppingBean.normsPrice=normsPrice;
cpzbuyershoppingBean.createTime=createTime;
cpzbuyershoppingBean.remark=remark;
try {
cpzBuyerShoppingService.update(cpzbuyershoppingBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int shopCarId = reqMap.get("shopCarId") == null ? 0 :Integer.valueOf( reqMap.get("shopCarId").toString());
CpzBuyerShoppingBean cpzbuyershoppingBean=new CpzBuyerShoppingBean();
cpzbuyershoppingBean.shopCarId=shopCarId;
try {
cpzBuyerShoppingService.delete(cpzbuyershoppingBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

