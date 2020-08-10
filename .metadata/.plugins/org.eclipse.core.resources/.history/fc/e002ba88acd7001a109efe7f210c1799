package com.encore.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.spring.domain.MyProduct;

public interface MyProductDAO {
	void addProduct(MyProduct myProduct);
	List<MyProduct> findProductByName(String name);
	List<MyProduct> findProducts();
}
