package com.company.service.impl;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.framework.dao.BaseDao;
import com.framework.dao.common.DaoTools;
import com.framework.exception.CommonException;
//销量统计表
@Service("GspSalesReportService")
public class GspSalesReportServiceImpl implements GspSalesReportService {
	private final static Logger logger = LoggerFactory.getLogger(GspSalesReportServiceImpl.class);
	
	@Resource
	private GspSalesReportMapper mapper;
	
	@Override
	public List<GspSalesReportBean> get(Map para) throws Exception {
		// TODO Auto-generated method stub
		Map<String,Object> m = new HashMap();
return mapper.GspSalesReportSelect(para);
	}

	@Override
public void  insert(GspSalesReportBean bean){
 mapper.GspSalesReportInsert(bean);
	}
	@Override
public void update(GspSalesReportBean bean){
 mapper.GspSalesReportUpdate(bean);
	}

	@Override
public void   delete(GspSalesReportBean bean){
 mapper.GspSalesReportDelete(bean);
	}
}

