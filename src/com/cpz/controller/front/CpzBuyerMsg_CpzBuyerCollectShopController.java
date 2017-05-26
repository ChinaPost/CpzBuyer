package com.cpz.controller.front;

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

import com.cpz.pojo.CpzBuyerMsgBean;
import com.cpz.service.impl.CpzBuyerMsg_CpzBuyerCollectShopService;
import com.framework.controller.BaseController;
import com.framework.utils.SpringBeanManger;
import com.tccp.service.UserService;

@Controller
@Scope("prototype")
@RequestMapping("/front/cpzbuyermsg_cpzbuyercollectshop")
public class CpzBuyerMsg_CpzBuyerCollectShopController extends BaseController {
	// 买家基本信息表_买家店铺收藏信息表_
	
	@Autowired
	private CpzBuyerMsg_CpzBuyerCollectShopService cpzBuyerMsg_CpzBuyerCollectShopService;

	
	@RequestMapping("/query.do")
	public @ResponseBody Map<String, Object> query(@RequestParam Map reqMap) {
		
		CpzBuyerMsgBean cpzBuyerMsgBean=null;
		try {
			cpzBuyerMsgBean=cpzBuyerMsg_CpzBuyerCollectShopService.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		//if (null == reqMap || reqMap.isEmpty())
			//return CommonUtil.ReturnWarp(Constant.TRAN_PARAERCODE, Constant.ERRORTYPE);
		//return CommonUtil.ReturnWarp(Constant.TRAN_SUCCESS, Constant.ERRORTYPE);
	}
}

