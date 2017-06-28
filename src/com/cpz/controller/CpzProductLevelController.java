package com.cpz.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cpz.pojo.CpzProductLevelBean;
import com.cpz.service.impl.CpzProductLevelService;
import com.framework.controller.BaseController;
import com.framework.utils.CommonUtil;
import com.framework.utils.Constant;

/**商品分类表*/
@Controller
@Scope("prototype")
@RequestMapping("/cpzproductlevel")
public class CpzProductLevelController extends BaseController {
@Autowired
private CpzProductLevelService cpzProductLevelService;
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
List<CpzProductLevelBean> cpzproductlevelBeans=null;
try {
cpzproductlevelBeans=cpzProductLevelService.get(reqMap);
} catch (Exception e) {
	e.printStackTrace();
}
Map r=new HashMap();
r.put("returnData",cpzproductlevelBeans);
	  return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE,"",r);
	}
	@RequestMapping("/insert.do")
	public @ResponseBody Map<String, Object> insert(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
		String productCategoryName = reqMap.get("productCategoryName") == null ? null : reqMap.get("productCategoryName").toString();
		int parentId = reqMap.get("parentId") == null ? 0 :Integer.valueOf( reqMap.get("parentId").toString());
		String parentName = reqMap.get("parentName") == null ? null : reqMap.get("parentName").toString();
		String productCategoryGrade = reqMap.get("productCategoryGrade") == null ? null : reqMap.get("productCategoryGrade").toString();
		String path = reqMap.get("path") == null ? null : reqMap.get("path").toString();
CpzProductLevelBean cpzproductlevelBean=new CpzProductLevelBean();
cpzproductlevelBean.productCategoryId=productCategoryId;
cpzproductlevelBean.productCategoryName=productCategoryName;
cpzproductlevelBean.parentId=parentId;
cpzproductlevelBean.parentName=parentName;
cpzproductlevelBean.productCategoryGrade=productCategoryGrade;
cpzproductlevelBean.path=path;
try {
cpzProductLevelService.insert(cpzproductlevelBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/update.do")
	public @ResponseBody Map<String, Object> update(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
		String productCategoryName = reqMap.get("productCategoryName") == null ? null : reqMap.get("productCategoryName").toString();
		int parentId = reqMap.get("parentId") == null ? 0 :Integer.valueOf( reqMap.get("parentId").toString());
		String parentName = reqMap.get("parentName") == null ? null : reqMap.get("parentName").toString();
		String productCategoryGrade = reqMap.get("productCategoryGrade") == null ? null : reqMap.get("productCategoryGrade").toString();
		String path = reqMap.get("path") == null ? null : reqMap.get("path").toString();
CpzProductLevelBean cpzproductlevelBean=new CpzProductLevelBean();
cpzproductlevelBean.productCategoryId=productCategoryId;
cpzproductlevelBean.productCategoryName=productCategoryName;
cpzproductlevelBean.parentId=parentId;
cpzproductlevelBean.parentName=parentName;
cpzproductlevelBean.productCategoryGrade=productCategoryGrade;
cpzproductlevelBean.path=path;
try {
cpzProductLevelService.update(cpzproductlevelBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
	@RequestMapping("/delete.do")
	public @ResponseBody Map<String, Object> delete(@RequestParam Map reqMap) {
		if (null == reqMap || reqMap.isEmpty())
			return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		int productCategoryId = reqMap.get("productCategoryId") == null ? 0 :Integer.valueOf( reqMap.get("productCategoryId").toString());
CpzProductLevelBean cpzproductlevelBean=new CpzProductLevelBean();
cpzproductlevelBean.productCategoryId=productCategoryId;
try {
cpzProductLevelService.delete(cpzproductlevelBean);
} catch (Exception e) {
	e.printStackTrace();
}
		return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

