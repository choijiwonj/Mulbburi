package com.water.Mulbburi.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.management.dto.ManagementDTO;

@Mapper
public interface ManagementMapper {

	int checkTotalCount();

	List<ManagementDTO> checkorderAllList(SelectCriteria selectCriteria);

}
