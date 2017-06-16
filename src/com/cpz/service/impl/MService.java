<<<<<<< .mine
package com.cpz.service.impl;
import java.util.List;

import com.cpz.pojo.CpzBuyerCollectShopBean;

public interface MService {
	List<CpzBuyerCollectShopBean> get(int shopBusineeRangeId) throws Exception;
void insert(CpzBuyerCollectShopBean bean);
void update(CpzBuyerCollectShopBean bean);
void delete(CpzBuyerCollectShopBean bean);
}

=======
package com.cpz.service.impl;
import java.util.List;

import com.cpz.pojo.CpzBuyerCollectShopBean;

public interface MService {
	List<CpzBuyerCollectShopBean> get() throws Exception;
void insert(CpzBuyerCollectShopBean bean);
void update(CpzBuyerCollectShopBean bean);
void delete(Integer id);
}

>>>>>>> .theirs
