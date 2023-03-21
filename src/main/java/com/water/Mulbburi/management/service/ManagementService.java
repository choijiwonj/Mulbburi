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
package com.water.Mulbburi.management.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.management.dao.ManagementMapper;

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
		
//		SelectCriteria selectCriteria =
		
		return null;
	}
	
}
>>>>>>> 41ac649f624e75228a47e9e506a339d25199d482
