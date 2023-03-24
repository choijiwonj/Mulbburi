package com.water.Mulbburi.member.dao;
import org.apache.ibatis.annotations.Mapper;

import com.water.Mulbburi.file.FileDTO;
import com.water.Mulbburi.member.dto.MemberDTO;



@Mapper
public interface MemberMapper {
	
	MemberDTO findByMemberId(String memberId);
	
    String selectMemberById(String memberId);

    int insertConMember(MemberDTO member);
    
    int insertSelMember(MemberDTO member);
    
    int insertFile(FileDTO fileDTO);
    
    int insertConMemberRole();
    
    int insertSelMemberRole();

    int updateMember(MemberDTO member);

    int deleteMember(MemberDTO member);
    
    String findLoginId(MemberDTO member);

	String findLoginPwd(MemberDTO member);

	String findPwd(MemberDTO member);

	int pwdModifyMember(MemberDTO member);


	
    
//    int idCheck(String memberId);

	
}
