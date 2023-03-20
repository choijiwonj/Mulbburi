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
		
		/* 전체 주문 조회 */
		
		int totalCount = managementMapper.checkTotalCount;
		log.info("[ManagementService] totalCount : {}", totalCount);
		
		return null;
	}
	
}
