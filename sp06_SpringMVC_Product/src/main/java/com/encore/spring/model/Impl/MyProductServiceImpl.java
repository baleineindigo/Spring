package com.encore.spring.model.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.spring.domain.MyProduct;
import com.encore.spring.model.MyProductDAO;
import com.encore.spring.model.MyProductService;

@Service
public class MyProductServiceImpl implements MyProductService {
	@Autowired
	MyProductDAO myProductDAO;

	@Override
	public void addProduct(MyProduct myProduct) {
		myProductDAO.addProduct(myProduct);
	}

	@Override
	public List<MyProduct> findProductByName(String name) {	
		return myProductDAO.findProductByName(name);
	}

	@Override
	public List<MyProduct> findProducts() {
		return myProductDAO.findProducts();
	}
}
