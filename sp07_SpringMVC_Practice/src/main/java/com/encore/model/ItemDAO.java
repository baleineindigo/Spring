package com.encore.model;

import java.util.List;

import com.encore.spring.domain.Item;

public interface ItemDAO {
	public Item getItem(int itemId);
	public List<Item> getItemList();
	public void addItem(Item item);
	public void updateItem(Item item);
	public void removeItem(int itemId);
}
