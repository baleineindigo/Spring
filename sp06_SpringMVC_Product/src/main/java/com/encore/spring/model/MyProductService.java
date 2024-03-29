package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.MyProduct;

public interface MyProductService {
	void addProduct(MyProduct myProduct);
	List<MyProduct> findProductByName(String name);
	List<MyProduct> findProducts();
}