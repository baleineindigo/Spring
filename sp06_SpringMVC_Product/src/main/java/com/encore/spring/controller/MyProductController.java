package com.encore.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.encore.spring.domain.MyProduct;
import com.encore.spring.model.MyProductService;

@Controller
public class MyProductController{
	@Autowired
	private MyProductService myProductService;
	
	@RequestMapping(value="myProduct.do", method=RequestMethod.POST)
	public ModelAndView insert(MyProduct pvo) {//폼에 입력된 값을 자동으로 바인딩 해서 넘어옴
		myProductService.addProduct(pvo); // 폼의 name과 필드명이 일치해야함
		return new ModelAndView("itemList","info",pvo);	
	}
	
	@RequestMapping("mySearch.do")
	public ModelAndView getProducts(String word) {
		List<MyProduct> list=myProductService.findProductByName(word); // 폼의 name과 필드명이 일치해야함
		return new ModelAndView("","list",list);	
	}
}
