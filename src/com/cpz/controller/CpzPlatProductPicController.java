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

/**平台商品图片表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzplatproductpic")
public class CpzPlatProductPicController extends BaseController {
@Autowired
private CpzPlatProductPicService cpzPlatProductPicService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzPlatProductPicBean> cpzplatproductpicBeans=null;
try {
cpzplatproductpicBeans=cpzPlatProductPicService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzplatproductpicBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String picName = reqMap.get("picName") == null ? null : reqMap.get("picName").toString();
		int picShowNo = reqMap.get("picShowNo") == null ? 0 :Integer.valueOf( reqMap.get("picShowNo").toString());
		String picNorms = reqMap.get("picNorms") == null ? null : reqMap.get("picNorms").toString();
		String picUrl = reqMap.get("picUrl") == null ? null : reqMap.get("picUrl").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductPicBean cpzplatproductpicBean=new CpzPlatProductPicBean();
cpzplatproductpicBean.productId=productId;
cpzplatproductpicBean.picName=picName;
cpzplatproductpicBean.picShowNo=picShowNo;
cpzplatproductpicBean.picNorms=picNorms;
cpzplatproductpicBean.picUrl=picUrl;
cpzplatproductpicBean.remark1=remark1;
try {
cpzPlatProductPicService.insert(cpzplatproductpicBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
		String picName = reqMap.get("picName") == null ? null : reqMap.get("picName").toString();
		int picShowNo = reqMap.get("picShowNo") == null ? 0 :Integer.valueOf( reqMap.get("picShowNo").toString());
		String picNorms = reqMap.get("picNorms") == null ? null : reqMap.get("picNorms").toString();
		String picUrl = reqMap.get("picUrl") == null ? null : reqMap.get("picUrl").toString();
		String remark1 = reqMap.get("remark1") == null ? null : reqMap.get("remark1").toString();
CpzPlatProductPicBean cpzplatproductpicBean=new CpzPlatProductPicBean();
cpzplatproductpicBean.productId=productId;
cpzplatproductpicBean.picName=picName;
cpzplatproductpicBean.picShowNo=picShowNo;
cpzplatproductpicBean.picNorms=picNorms;
cpzplatproductpicBean.picUrl=picUrl;
cpzplatproductpicBean.remark1=remark1;
try {
cpzPlatProductPicService.update(cpzplatproductpicBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productId = reqMap.get("productId") == null ? 0 :Integer.valueOf( reqMap.get("productId").toString());
CpzPlatProductPicBean cpzplatproductpicBean=new CpzPlatProductPicBean();
cpzplatproductpicBean.productId=productId;
try {
cpzPlatProductPicService.delete(cpzplatproductpicBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

