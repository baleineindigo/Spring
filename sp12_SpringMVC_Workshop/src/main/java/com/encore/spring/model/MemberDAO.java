package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Member;

public interface MemberDAO {
	Member getMember(String id);
	List<Member> getMemberList();
	int addMember(Member member);
	int updateMember(Member member);
	Member loginMember(Member member);
}