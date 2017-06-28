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

/**买家订单表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzbuyerorder")
public class CpzBuyerOrderController extends BaseController {
@Autowired
private CpzBuyerOrderService cpzBuyerOrderService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzBuyerOrderBean> cpzbuyerorderBeans=null;
try {
cpzbuyerorderBeans=cpzBuyerOrderService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzbuyerorderBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		String userName = reqMap.get("userName") == null ? null : reqMap.get("userName").toString();
		String userPhone = reqMap.get("userPhone") == null ? null : reqMap.get("userPhone").toString();
		String orderStatus = reqMap.get("orderStatus") == null ? null : reqMap.get("orderStatus").toString();
		String totalMoney = reqMap.get("totalMoney") == null ? null : reqMap.get("totalMoney").toString();
		String payMoney = reqMap.get("payMoney") == null ? null : reqMap.get("payMoney").toString();
		String payStatus = reqMap.get("payStatus") == null ? null : reqMap.get("payStatus").toString();
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		String shipType = reqMap.get("shipType") == null ? null : reqMap.get("shipType").toString();
		String provCode = reqMap.get("provCode") == null ? null : reqMap.get("provCode").toString();
		String cityCode = reqMap.get("cityCode") == null ? null : reqMap.get("cityCode").toString();
		String countyCode = reqMap.get("countyCode") == null ? null : reqMap.get("countyCode").toString();
		String detailAddr = reqMap.get("detailAddr") == null ? null : reqMap.get("detailAddr").toString();
		String invoiceType = reqMap.get("invoiceType") == null ? null : reqMap.get("invoiceType").toString();
		String invoiceTitle = reqMap.get("invoiceTitle") == null ? null : reqMap.get("invoiceTitle").toString();
		String orderRemark = reqMap.get("orderRemark") == null ? null : reqMap.get("orderRemark").toString();
		String getProductTime = reqMap.get("getProductTime") == null ? null : reqMap.get("getProductTime").toString();
		String bookTime = reqMap.get("bookTime") == null ? null : reqMap.get("bookTime").toString();
		String payTime = reqMap.get("payTime") == null ? null : reqMap.get("payTime").toString();
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
		String remark2 = reqMap.get("remark2") == null ? null : reqMap.get("remark2").toString();
CpzBuyerOrderBean cpzbuyerorderBean=new CpzBuyerOrderBean();
cpzbuyerorderBean.orderNo=orderNo;
cpzbuyerorderBean.userId=userId;
cpzbuyerorderBean.userName=userName;
cpzbuyerorderBean.userPhone=userPhone;
cpzbuyerorderBean.orderStatus=orderStatus;
cpzbuyerorderBean.totalMoney=totalMoney;
cpzbuyerorderBean.payMoney=payMoney;
cpzbuyerorderBean.payStatus=payStatus;
cpzbuyerorderBean.shopId=shopId;
cpzbuyerorderBean.marketId=marketId;
cpzbuyerorderBean.shipType=shipType;
cpzbuyerorderBean.provCode=provCode;
cpzbuyerorderBean.cityCode=cityCode;
cpzbuyerorderBean.countyCode=countyCode;
cpzbuyerorderBean.detailAddr=detailAddr;
cpzbuyerorderBean.invoiceType=invoiceType;
cpzbuyerorderBean.invoiceTitle=invoiceTitle;
cpzbuyerorderBean.orderRemark=orderRemark;
cpzbuyerorderBean.getProductTime=getProductTime;
cpzbuyerorderBean.bookTime=bookTime;
cpzbuyerorderBean.payTime=payTime;
cpzbuyerorderBean.channelNo=channelNo;
cpzbuyerorderBean.remark1=remark1;
cpzbuyerorderBean.remark2=remark2;
try {
cpzBuyerOrderService.insert(cpzbuyerorderBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
		int userId = reqMap.get("userId") == null ? 0 :Integer.valueOf( reqMap.get("userId").toString());
		String userName = reqMap.get("userName") == null ? null : reqMap.get("userName").toString();
		String userPhone = reqMap.get("userPhone") == null ? null : reqMap.get("userPhone").toString();
		String orderStatus = reqMap.get("orderStatus") == null ? null : reqMap.get("orderStatus").toString();
		String totalMoney = reqMap.get("totalMoney") == null ? null : reqMap.get("totalMoney").toString();
		String payMoney = reqMap.get("payMoney") == null ? null : reqMap.get("payMoney").toString();
		String payStatus = reqMap.get("payStatus") == null ? null : reqMap.get("payStatus").toString();
		int shopId = reqMap.get("shopId") == null ? 0 :Integer.valueOf( reqMap.get("shopId").toString());
		int marketId = reqMap.get("marketId") == null ? 0 :Integer.valueOf( reqMap.get("marketId").toString());
		String shipType = reqMap.get("shipType") == null ? null : reqMap.get("shipType").toString();
		String provCode = reqMap.get("provCode") == null ? null : reqMap.get("provCode").toString();
		String cityCode = reqMap.get("cityCode") == null ? null : reqMap.get("cityCode").toString();
		String countyCode = reqMap.get("countyCode") == null ? null : reqMap.get("countyCode").toString();
		String detailAddr = reqMap.get("detailAddr") == null ? null : reqMap.get("detailAddr").toString();
		String invoiceType = reqMap.get("invoiceType") == null ? null : reqMap.get("invoiceType").toString();
		String invoiceTitle = reqMap.get("invoiceTitle") == null ? null : reqMap.get("invoiceTitle").toString();
		String orderRemark = reqMap.get("orderRemark") == null ? null : reqMap.get("orderRemark").toString();
		String getProductTime = reqMap.get("getProductTime") == null ? null : reqMap.get("getProductTime").toString();
		String bookTime = reqMap.get("bookTime") == null ? null : reqMap.get("bookTime").toString();
		String payTime = reqMap.get("payTime") == null ? null : reqMap.get("payTime").toString();
		String channelNo = reqMap.get("channelNo") == null ? null : reqMap.get("channelNo").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
		String remark2 = reqMap.get("remark2") == null ? null : reqMap.get("remark2").toString();
CpzBuyerOrderBean cpzbuyerorderBean=new CpzBuyerOrderBean();
cpzbuyerorderBean.orderNo=orderNo;
cpzbuyerorderBean.userId=userId;
cpzbuyerorderBean.userName=userName;
cpzbuyerorderBean.userPhone=userPhone;
cpzbuyerorderBean.orderStatus=orderStatus;
cpzbuyerorderBean.totalMoney=totalMoney;
cpzbuyerorderBean.payMoney=payMoney;
cpzbuyerorderBean.payStatus=payStatus;
cpzbuyerorderBean.shopId=shopId;
cpzbuyerorderBean.marketId=marketId;
cpzbuyerorderBean.shipType=shipType;
cpzbuyerorderBean.provCode=provCode;
cpzbuyerorderBean.cityCode=cityCode;
cpzbuyerorderBean.countyCode=countyCode;
cpzbuyerorderBean.detailAddr=detailAddr;
cpzbuyerorderBean.invoiceType=invoiceType;
cpzbuyerorderBean.invoiceTitle=invoiceTitle;
cpzbuyerorderBean.orderRemark=orderRemark;
cpzbuyerorderBean.getProductTime=getProductTime;
cpzbuyerorderBean.bookTime=bookTime;
cpzbuyerorderBean.payTime=payTime;
cpzbuyerorderBean.channelNo=channelNo;
cpzbuyerorderBean.remark1=remark1;
cpzbuyerorderBean.remark2=remark2;
try {
cpzBuyerOrderService.update(cpzbuyerorderBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		String orderNo = reqMap.get("orderNo") == null ? null : reqMap.get("orderNo").toString();
CpzBuyerOrderBean cpzbuyerorderBean=new CpzBuyerOrderBean();
cpzbuyerorderBean.orderNo=orderNo;
try {
cpzBuyerOrderService.delete(cpzbuyerorderBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

