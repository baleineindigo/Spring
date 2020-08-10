package com.encore.spring.model.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.MyProduct;
import com.encore.spring.model.MyProductDAO;

@Repository
public class MyProductDAOImpl implements MyProductDAO{
	@Autowired
	SqlSession sqlSession;
	private final String ns="ProductMapper.";
	@Override
	public void addProduct(MyProduct myProduct) {
		sqlSession.insert(ns+"addProduct",myProduct);
	}

	@Override
	public List<MyProduct> findProductByName(String name) {
		return sqlSession.selectList(ns+"findProductByName", name);
	}

	@Override
	public List<MyProduct> findProducts() {
		return sqlSession.selectList("ProductMapper.findProducts");	
		}
	
	
}