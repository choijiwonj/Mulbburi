package com.water.Mulbburi.member.dao;
import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.member.dto.MemberDTO;



@Mapper
public interface MemberMapper {
	
	MemberDTO findByMemberId(String memberId);
	
    String selectMemberById(String memberId);

    int insertMember(MemberDTO member);
    
    int insertMemberRole();

    int updateMember(MemberDTO member);

    int deleteMember(MemberDTO member);

	
}
