package com.encore.spring.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.encore.spring.domain.Phone;
import com.encore.spring.domain.UserInfo;
import com.encore.spring.model.IPhoneDAO;
import com.encore.spring.model.IPhoneService;

@Service
public class IPhoneServiceImple implements IPhoneService{
	@Autowired
	private IPhoneDAO iPhoneDAO;
	
	@Transactional
	public int insert(Phone phone) {
		return iPhoneDAO.insert(phone);
	}

	@Transactional
	public int delete(List<String> list) {
		return iPhoneDAO.delete(list);
	}

	@Override
	public Phone select(Phone phone) {
		return iPhoneDAO.select(phone);
	}

	@Override
	public List<Phone> select() {
		return iPhoneDAO.select();
	}

	@Override
	public UserInfo select(UserInfo user) {
		return iPhoneDAO.select(user);
	}

}
