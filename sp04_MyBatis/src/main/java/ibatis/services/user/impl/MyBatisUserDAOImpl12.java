package ibatis.services.user.impl;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import ibatis.services.domain.User;
import ibatis.services.user.UserDAO;
/*
 * 	Persistence Layer Component(Bean)
 * 		SqlSession을 Hashing하는 클래스
 * 		1)필드에 SqlSession선언
 * 		2) setter로 주입
 */
public class MyBatisUserDAOImpl12 implements UserDAO{
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
		System.out.println("::"+getClass().getName()+".setSqlSession() call...");
	}
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