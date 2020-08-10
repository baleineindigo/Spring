package com.encore.spring.model.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.Member;
import com.encore.spring.model.MemberDAO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	private SqlSession sqlSession;
	private String NS="MemberMapper."; 

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Member getMember(String id) {
		return sqlSession.selectOne(NS+"getMember",id);
	}

	@Override
	public List<Member> getMemberList() {
		return sqlSession.selectList(NS+"getMemberList");	
	}

	@Override
	public int addMember(Member member) {
		int result = sqlSession.insert(NS+"addMember",member);
		return result;
	}

	@Override
	public int updateMember(Member member) {
		int result = sqlSession.update(NS+"updateMember",member);
		return result;
	}

	@Override
	public Member loginMember(Member member){
		return sqlSession.selectOne(NS+"loginMember",member);
	}
	
}
