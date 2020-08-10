package com.encore.spring.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.encore.spring.domain.MyProduct;

public class MyBatisUnitTest2 {

	@Test
	public void unit() throws Exception {
	Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
	SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
	SqlSession session = factory.openSession();
	
	MyProduct vo =new MyProduct("듀얼버블세탁기","삼성",950000);
	System.out.println("db 들어가기 전"+vo.getId());
	
//		session.insert("ProductMapper.addProduct",vo);
	System.out.println("Insert OK!!");
	System.out.println("db 들어간 후"+vo.getId());
	
	session.commit();
	
	List<MyProduct> rvo=session.selectList("ProductMapper.findProductByName","버블");
	for (MyProduct v :rvo) {
		System.out.println(v);
		}
	}

}
