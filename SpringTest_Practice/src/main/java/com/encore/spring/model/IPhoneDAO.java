package com.encore.spring.model;

import java.util.List;

import com.encore.spring.domain.Phone;
import com.encore.spring.domain.UserInfo;

public interface IPhoneDAO {
	int insert(Phone phone);

	int delete(List<String> list);

	Phone select(Phone phone);

	List<Phone> select();

	UserInfo select(UserInfo user);
}
