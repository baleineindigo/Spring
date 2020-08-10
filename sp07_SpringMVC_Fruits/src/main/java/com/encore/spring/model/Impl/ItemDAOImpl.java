package com.encore.spring.model.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.Item;
import com.encore.spring.model.ItemDAO;

@Repository
public class ItemDAOImpl implements ItemDAO{
	
	@Autowired
	SqlSession sqlSession;
	private final String NS="ItemMapper.";
	@Override
	public Item getItem(Integer itemNumber) {
		return sqlSession.selectOne(NS+"getItem", itemNumber);
	}

	@Override
	public List<Item> getItemList() {
		return sqlSession.selectList(NS+"getItemList");
	}

	@Override
	public void addItem(Item item) {
		sqlSession.insert("ItemMapper.addItem",item);
	}

	@Override
	public void updateItem(Item item) {
		sqlSession.update("ItemMapper.updateItem",item);
		
	}

	@Override
	public void removeItem(String itemNumber) {
		sqlSession.delete("ItemMapper.removeItem",itemNumber);
		
	}

}