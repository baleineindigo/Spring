package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Item;

public interface ItemDAO {
	Item getItem(Integer itemNumber);
	List<Item> getItemList();
	void addItem(Item item);
	void updateItem(Item item);
	void removeItem(String itemNumber);
}
