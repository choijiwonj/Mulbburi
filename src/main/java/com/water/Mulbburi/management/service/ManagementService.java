<<<<<<< HEAD
<<<<<<< HEAD
/*
 * package com.water.Mulbburi.management.service;
 * 
 * import java.util.Map;
 * 
package com.water.Mulbburi.management.service;

import java.util.HashMap;
import java.util.List;
=======

package com.water.Mulbburi.management.service;

>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

<<<<<<< HEAD
import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.management.dao.ManagementMapper;
import com.water.Mulbburi.management.dto.ManagementDTO;
=======
import com.water.Mulbburi.management.dao.ManagementMapper;
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class ManagementService {

	private final ManagementMapper managementMapper;
<<<<<<< HEAD

=======
	
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
	public ManagementService(ManagementMapper managementMapper) {
		this.managementMapper = managementMapper;
	}

	public Map<String, Object> checkOrderAll(int page) {
<<<<<<< HEAD

		int totalCount = managementMapper.checkTotalCount();
		log.info("[ManagementService] totalCount : {}", totalCount);

		int limit = 1;
		int buttonAmount = 3;

		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
		log.info("[ManagementService] selectCriteria : {}", selectCriteria);

		List<ManagementDTO> orderAll = managementMapper.checkorderAllList(selectCriteria);
		log.info("[ManagementService] orderAll : {}", orderAll);

		Map<String, Object> orderAllAndPaging = new HashMap<>();
		orderAllAndPaging.put("paging", selectCriteria);
		orderAllAndPaging.put("orderAll", orderAll);
		
		return orderAllAndPaging;

	}
=======
		
		int totalCount = managementMapper.checkTotalCount();
		log.info("[ManagementService] totalCount : {}", totalCount);
		
		int limit = 1;
		int buttonAmount = 3;
		
//		SelectCriteria selectCriteria =
		
		return null;
	}
	
>>>>>>> d4d2e193517ba0a5342894b3e67a892cac5ba8f6
}

