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

/**销量统计表*/
@Controller
@Scope("prototype")
@RequestMapping("/gspsalesreport")
public class GspSalesReportController extends BaseController {
@Autowired
private GspSalesReportService gspSalesReportService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<GspSalesReportBean> gspsalesreportBeans=null;
try {
gspsalesreportBeans=gspSalesReportService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",gspsalesreportBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int salesReportId = reqMap.get("salesReportId") == null ? 0 :Integer.valueOf( reqMap.get("salesReportId").toString());
		String dateStr = reqMap.get("dateStr") == null ? null : reqMap.get("dateStr").toString();
		String merchName = reqMap.get("merchName") == null ? null : reqMap.get("merchName").toString();
		String weight = reqMap.get("weight") == null ? null : reqMap.get("weight").toString();
		String settSumPrice = reqMap.get("settSumPrice") == null ? null : reqMap.get("settSumPrice").toString();
GspSalesReportBean gspsalesreportBean=new GspSalesReportBean();
gspsalesreportBean.salesReportId=salesReportId;
gspsalesreportBean.dateStr=dateStr;
gspsalesreportBean.merchName=merchName;
gspsalesreportBean.weight=weight;
gspsalesreportBean.settSumPrice=settSumPrice;
try {
gspSalesReportService.insert(gspsalesreportBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int salesReportId = reqMap.get("salesReportId") == null ? 0 :Integer.valueOf( reqMap.get("salesReportId").toString());
		String dateStr = reqMap.get("dateStr") == null ? null : reqMap.get("dateStr").toString();
		String merchName = reqMap.get("merchName") == null ? null : reqMap.get("merchName").toString();
		String weight = reqMap.get("weight") == null ? null : reqMap.get("weight").toString();
		String settSumPrice = reqMap.get("settSumPrice") == null ? null : reqMap.get("settSumPrice").toString();
GspSalesReportBean gspsalesreportBean=new GspSalesReportBean();
gspsalesreportBean.salesReportId=salesReportId;
gspsalesreportBean.dateStr=dateStr;
gspsalesreportBean.merchName=merchName;
gspsalesreportBean.weight=weight;
gspsalesreportBean.settSumPrice=settSumPrice;
try {
gspSalesReportService.update(gspsalesreportBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int salesReportId = reqMap.get("salesReportId") == null ? 0 :Integer.valueOf( reqMap.get("salesReportId").toString());
GspSalesReportBean gspsalesreportBean=new GspSalesReportBean();
gspsalesreportBean.salesReportId=salesReportId;
try {
gspSalesReportService.delete(gspsalesreportBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

