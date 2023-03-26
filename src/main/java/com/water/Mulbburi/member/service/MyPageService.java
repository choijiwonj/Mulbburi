package com.water.Mulbburi.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.water.Mulbburi.common.paging.Pagenation;
import com.water.Mulbburi.common.paging.SelectCriteria;
import com.water.Mulbburi.member.dao.MyPageMapper;
import com.water.Mulbburi.member.dto.MemberDTO;
import com.water.Mulbburi.member.dto.MemberOrderDTO;


@Service
@Transactional
public class MyPageService {
	
	private final MyPageMapper mapper;

    public MyPageService(MyPageMapper mapper) {
        this.mapper = mapper;
    }
	
    /* 주문내역 조회하기 */
	public Map<String, Object> selectOrderList(Map<String, String> searchMap, int page, MemberDTO member) {
		
		int totalCount = mapper.selectTotalCount(searchMap);
		
		int limit = 5;
		int buttonAmount = 3;
		
		SelectCriteria selectCriteria = Pagenation.getSelectCriteria(page, totalCount, limit, buttonAmount);
		
		List<MemberOrderDTO> orderList = mapper.selectOrderList(selectCriteria, member);
		
		Map<String, Object> orderListAndPaging = new HashMap<>();
		orderListAndPaging.put("paging", selectCriteria);
		orderListAndPaging.put("orderList", orderList);
		
		return orderListAndPaging;
	}
	
}
