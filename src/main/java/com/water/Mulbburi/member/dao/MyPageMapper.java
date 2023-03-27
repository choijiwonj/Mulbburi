package com.water.Mulbburi.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.member.dto.MemberOrderDTO;



@Mapper
public interface MyPageMapper {

	int selectTotalCount(Map<String, String> searchMap);

	List<MemberOrderDTO> selectOrderList(Long memberNo);

	MemberOrderDTO selectOrderDetail(Long orderNo);
	
	
	
	
}
