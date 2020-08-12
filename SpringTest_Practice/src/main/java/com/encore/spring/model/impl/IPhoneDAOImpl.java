package com.encore.spring.model.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.encore.spring.domain.Phone;
import com.encore.spring.domain.UserInfo;
import com.encore.spring.model.IPhoneDAO;

@Repository
public class IPhoneDAOImpl implements IPhoneDAO{
	@Autowired
	private SqlSession sqlSession;
	private String NS="spring.sql.mapper";
	
	
	@Override
	public int insert(Phone phone) {
		return sqlSession.insert(NS+"insert");
	}

	@Override
	public int delete(List<String> list) {
		return sqlSession.delete(NS+"delete", list);
	}

	@Override
	public Phone select(Phone phone) {
		return sqlSession.selectOne(NS+"select", phone);
	}

	@Override
	public List<Phone> select() {
		return sqlSession.selectList(NS+"select");
	}

	@Override
	public UserInfo select(UserInfo user) {
		return sqlSession.selectOne(NS+"select", user);
	}

}
