
package com.cpz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cpz.dao.impl.CpzBuyerCollectShopMapper;
import com.cpz.pojo.CpzBuyerCollectShopBean;
import com.framework.dao.BaseDao;
import com.framework.dao.common.DaoTools;
import com.framework.exception.CommonException;

@Service("MService")
public class MServiceImpl implements MService {
	private final static Logger logger = LoggerFactory
			.getLogger(MServiceImpl.class);

	@Resource
	private CpzBuyerCollectShopMapper mapper;

	@Override
	public List<CpzBuyerCollectShopBean> get(int shopBusineeRangeId)
			throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap();
		m.put("shopBusineeRangeId", shopBusineeRangeId);
		return mapper.CpzBuyerCollectShopSelect(shopBusineeRangeId);
	}

	@Override
	public void insert(CpzBuyerCollectShopBean bean) {
		mapper.CpzBuyerCollectShopInsert(bean);
	}

	@Override
	public void update(CpzBuyerCollectShopBean bean) {
		mapper.CpzBuyerCollectShopUpdate(bean);
	}

	@Override
	public void delete(CpzBuyerCollectShopBean bean) {
		mapper.CpzBuyerCollectShopDelete(bean);
	}
}
