package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Item;

public interface ItemService {
	Item getItem(int itemNumber);
	List<Item> getItemList();
	void addItem(Item item);
	void updateItem(Item item);
	void removeItem(String itemNumber);

}
