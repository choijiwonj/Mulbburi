package com.water.Mulbburi.management.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
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

	public Map<String, Object> checkOrderAll(Map<String, String> searchMap, int page) {

		int totalCount = managementMapper.checkTotalCount(searchMap);
		log.info("[ManagementService] totalCount : {}", totalCount);

		int limit = 2;
		int buttonAmount = 3;

		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount, searchMap);
		log.info("[ManagementService] selectCriteria : {}", selectCriteria);

		List<ManagementDTO> orderAll = managementMapper.checkorderAllList(selectCriteria);
		log.info("[ManagementService] orderAll : {}", orderAll);

		Map<String, Object> orderAllAndPaging = new HashMap<>();
		orderAllAndPaging.put("paging", selectCriteria);
		orderAllAndPaging.put("orderAll", orderAll);
		
		return orderAllAndPaging;

	}

	public ManagementDTO checkOrderDetail(Long orderNo) {
		
		return managementMapper.checkOrderDetail(orderNo);
	}
	
}

