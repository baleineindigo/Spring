package com.encore.spring.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.encore.model.ItemService;
import com.encore.spring.domain.Item;

public class MyBatisTest1 {

	@Test
	public void unit() throws IOException {
//		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
//		SqlSession session = factory.openSession();
//
//		String NS = "ItemMapper.";
//		Item item = new Item(5, "딸기", 500, "베리베리 스트로우베리~~!!", "berry.jpg", 3);
//
//		int result=session.insert(NS+"addItem",item);
//		System.out.println("=================Insert VO=================");
//		System.out.println(item);
//		System.out.println(result);
//		
//		 List<Item> list=session.selectList(NS+"getItemList");
//		 for(Item it : list) {
//			System.out.println("=================selectList=================");
//		 	System.out.println(it);
//		 }
//		 
//		 item=new Item(4,"포도", 300, "폴리페놀을 다량 함유하고 있어 항산화작용을 합니다","podo.jpg",5);
//		 int result=session.update(NS+"updateItem",item);
//		 System.out.println("=================Update VO=================");
//		 System.out.println(result);
//		 
//		 Item vo=session.selectOne(NS+"getItem",item.getItemId());
//		 System.out.println("=================select One=================");
//		 System.out.println(vo);
//		 
//		 int result=session.delete(NS+"removeItem",item.getItemId());
//		 System.out.println("=================Delete One=================");
//		 System.out.println(result);
//		 
//		//////////////////DAO & Service Unit Test/////////////////////
//		ApplicationContext context =new ClassPathXmlApplicationContext("/beans/applicationBean.xml");
//		//spring beans,context,core,expression 라이브러리 삽입 필요
//		ItemService itemService = (ItemService) context.getBean("ItemServiceImpl");
//		
//		System.out.println("=================1. Insert VO=================");
//		itemService.addItem(item);
//		
//		System.out.println("=================2. selectOne VO=================");
//		Item item=new Item(4,"포도", 300, "폴리페놀을 다량 함유하고 있어 항산화작용을 합니다","podo.jpg",5);
//		System.out.println(itemService.getItem(item.getItemId()));
//
//		System.out.println("=================3. update VO=================");
//		Item item=new Item(4,"포도", 300, "폴리페놀을 다량 함유하고 있어 항산화작용을 합니다","podo.jpg",5);
//		itemService.updateItem(item);
//
//		System.out.println("=================3. delete VO=================");
//		Item item=new Item(4,"포도", 300, "폴리페놀을 다량 함유하고 있어 항산화작용을 합니다","podo.jpg",5);
//		itemService.removeItem(item.getItemId());
//
//		System.out.println("=================3. SelectAll VO=================");
//		System.out.println(itemService.getItemList());
		
	}
}
