package com.encore.spring.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.spring.domain.Member;
import com.encore.spring.model.MemberDAO;
import com.encore.spring.model.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO memberDao;

	@Override
	public Member getMember(String id) {
		return memberDao.getMember(id);
	}

	@Override
	public List<Member> getMemberList() {
		return memberDao.getMemberList();
	}

	@Override
	public int addMember(Member member) {
		int result = memberDao.addMember(member);
		return result;
	}

	@Override
	public int updateMember(Member member) {
		int result = memberDao.updateMember(member);
		return result;
	}

	@Override
	public Member loginMember(Member member) {
		return memberDao.loginMember(member);
	}

	
	
}
