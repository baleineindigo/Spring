package com.encore.spring.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.model.ItemDAO;
import com.encore.model.ItemService;
import com.encore.spring.domain.Item;

@Service
public class ItemServiceImpl implements ItemService{	
	@Autowired
	private ItemDAO itemDao;
	private final String NS="ItemMapper.";
	
	@Override
	public Item getItem(int itemId) {
		return itemDao.getItem(itemId);
	}

	@Override
	public List<Item> getItemList() {
		return itemDao.getItemList();
	}

	@Override
	public void addItem(Item item) {
		itemDao.addItem(item);
	}

	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}

	@Override
	public void removeItem(int itemId) {
		itemDao.removeItem(itemId);
	}

}