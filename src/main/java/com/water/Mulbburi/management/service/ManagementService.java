<<<<<<< HEAD
<<<<<<< HEAD
/*
 * package com.water.Mulbburi.management.service;
 * 
 * import java.util.Map;
 * 
 * import org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.greedy.comprehensive.common.paging.SelectCriteria; import
 * com.water.Mulbburi.management.dao.ManagementMapper;
 * 
 * import lombok.extern.slf4j.Slf4j;
 * 
 * @Slf4j
 * 
 * @Service
 * 
 * @Transactional public class ManagementService {
 * 
 * private final ManagementMapper managementMapper;
 * 
 * public ManagementService(ManagementMapper managementMapper) {
 * this.managementMapper = managementMapper; }
 * 
 * public Map<String, Object> checkOrderAll(int page) {
 * 
 * int totalCount = managementMapper.checkTotalCount();
 * log.info("[ManagementService] totalCount : {}", totalCount);
 * 
 * int limit = 1; int buttonAmount = 3;
 * 
 * // SelectCriteria selectCriteria =
 * 
 * return null; }
 * 
 * }
 */
=======
>>>>>>> 813f13b2860fa12e9c68dafe9db21d4b5b78086c
=======
package com.water.Mulbburi.management.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.water.Mulbburi.management.dao.ManagementMapper;
import com.water.Mulbburi.management.dto.ManagementDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class ManagementService {

	private final ManagementMapper managementMapper;
	
	public ManagementService(ManagementMapper managementMapper) {
		this.managementMapper = managementMapper;
	}

	public Map<String, Object> checkOrderAll(int page) {
		
		int totalCount = managementMapper.checkTotalCount();
		log.info("[ManagementService] totalCount : {}", totalCount);
		
		int limit = 1;
		int buttonAmount = 3;
		

		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
		log.info("[ManagementService] selectCriteria : {}", selectCriteria);
		
//		List<ManagementDTO> orderAll = managementMapper.

//		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
//		log.info("[ManagementService] selectCriteria : {}", selectCriteria);
//		
//		List<ManagementDTO> orderAll = managementMapper.checkorderAllList(selectCriteria);
//		log.info("[ManagementService] orderAll : {}", orderAll);
		
		return null;
		
	}
	
}
>>>>>>> f190d67148c8716da2abe067e476aa2adb22ec5b
