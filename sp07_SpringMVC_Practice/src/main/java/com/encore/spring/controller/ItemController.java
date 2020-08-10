package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.model.ItemService;
import com.encore.spring.domain.Item;

@Controller
public class ItemController{
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("itemView.do")
	public ModelAndView itemView(int itemid) {
		Item item=itemService.getItem(itemid);		
		return new ModelAndView("item_view","item",item);
	}

	@RequestMapping("index.do")
	public ModelAndView itemList() {
		List<Item> itemList=itemService.getItemList();
		return new ModelAndView("item_list","itemList",itemList);
	}
	
}
