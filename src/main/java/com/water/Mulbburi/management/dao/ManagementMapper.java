package com.water.Mulbburi.management.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.management.dto.ManagementDTO;

@Mapper
public interface ManagementMapper {

	int checkTotalCount(Map<String, String> searchMap);

	List<ManagementDTO> checkorderAllList(SelectCriteria selectCriteria);

	List<ManagementDTO> checkorderDetail();

	ManagementDTO checkOrderDetail(Long orderNo);
	
}
