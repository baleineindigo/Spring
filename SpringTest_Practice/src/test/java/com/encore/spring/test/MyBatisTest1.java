package com.encore.spring.test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.encore.spring.domain.Phone;
import com.encore.spring.domain.UserInfo;

public class MyBatisTest1 {

//	@Test
//	public void unit() throws IOException {
//		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
//		SqlSession session = factory.openSession();
//		
//		String NS = "spring.sql.mapper.";
//		Phone phone= new Phone("V100Q","LG V50 ThinQ",999000,"20");
//		System.out.println(phone);
//		int result=session.insert(NS+"insert",phone);
//		System.out.println("=================Insert VO=================");	
//		System.out.println(result);
//		
//		 List<Phone> item=session.selectList(NS+"select",phone);
//		 for(Phone it : item) {
//			System.out.println("=================selectList=================");
//		 	System.out.println(item);
//		 }
//		 
//		 UserInfo user=new UserInfo("admin","admin"); 
//		 UserInfo vo=session.selectOne(NS+"selectUser",user);
//		 System.out.println("=================select One=================");
//		 System.out.println(vo);
//		List<String> list=new ArrayList<String>();
//		list.add("S100G");
//		list.add("S105G");
//		 int result=session.delete(NS+"delete",list);
//		 System.out.println("=================Delete One=================");
//		 System.out.println(result);
		 
//		//////////////////DAO & Service Unit Test/////////////////////
//		ApplicationContext context =new ClassPathXmlApplicationContext("/beans/applicationBean.xml");
//		//spring beans,context,core,expression 라이브러리 삽입 필요
//		MemberService MemberService = (MemberService) context.getBean("MemberServiceImpl");
//		
//		
//		Member member= new Member("123456","임채은7","123","회기동");
//		System.out.println("=================1. Insert VO=================");
//		MemberService.addMember(member);
//		
//		System.out.println("=================2. selectOne VO=================");		
//		System.out.println(MemberService.getMember(member.getId()));
//
//		System.out.println("=================3. update VO=================");
//		MemberService.updateMember(member);

//		System.out.println("=================3. delete VO=================");
//		MemberService.removeMember(member.getId());
//
//		System.out.println("=================3. SelectAll VO=================");
//		System.out.println(MemberService.getMemberList());
		
	}
//}
