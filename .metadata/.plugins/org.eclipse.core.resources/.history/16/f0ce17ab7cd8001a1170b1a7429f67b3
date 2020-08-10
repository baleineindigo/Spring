package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.Item;
import com.encore.spring.model.ItemService;

@Controller
public class FruitsController{
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("detail.do")
	public ModelAndView detail(int itemnumber) {
		Item item=itemService.getItem(itemnumber);
		return new ModelAndView("WEB-INF/views/detail.jsp", "item", item);
	}	
	
	@RequestMapping("index.do")
	public ModelAndView index() {
		List<Item> itemList=itemService.getItemList();
		return new ModelAndView("WEB-INF/views/itemList.jsp","itemList",itemList);	
	}
}
