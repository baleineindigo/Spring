package com.encore.spring.model.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.spring.domain.Item;
import com.encore.spring.model.ItemDAO;
import com.encore.spring.model.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired
	ItemDAO itemDao;
	
	@Override
	public Item getItem(int itemNumber) {
		return itemDao.getItem(itemNumber);
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
	public void removeItem(String itemNumber) {
		itemDao.removeItem(itemNumber);
	}

}
