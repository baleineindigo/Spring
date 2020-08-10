package ibatis.services.user.impl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ibatis.services.domain.User;
import ibatis.services.user.UserDAO;

@Repository

public class MyBatisUserDAOImpl13 implements UserDAO{
	/*
	 * 클래스에서 가장 중요한게 필드! 필드에 값을 주입하는 방법은 setter/getter 
	 * 그런데 setter/getter 때문에 재사용성이 급격히 저하된다.
	 * 따라서 setter/getter 대신 @Autowired로 값 주입
	 */
	@Autowired
	private SqlSession sqlSession;	
	// SqlSession은 DAO에서 필드로 선언되어 있으므로 Autowired 설정하고 설정문서에서 MyBatisUserDAOImpl13 지우기
	
	@Override
	public int addUser(User user) throws Exception {
		int result=sqlSession.insert("UserMapper10.addUser",user);
		return result;
	}
	
	@Override
	public int updateUser(User user) throws Exception {
		int result=sqlSession.update("UserMapper10.updateUser",user);
		return result;
	}
	@Override
	public int removeUser(String userId) throws Exception {
		int result=sqlSession.delete("UserMapper10.removeUser",userId);
		return result;
	}
	@Override
	public User getUser(String str) throws Exception {
		return sqlSession.selectOne("UserMapper10.getUser",str);
	}
	@Override
	public List<User> getUserList(User user) throws Exception {
		return sqlSession.selectList("UserMapper10.getUserList",user);
	}
}