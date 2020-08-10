package ibatis.services.user;

import java.util.List;

import ibatis.services.domain.User;

/*
 * DAO 비지니스 로직의 템플릿 포함.
 * - mybatis-userservice-mapping10.xml...에 있는 로직 개수만큼 5개
 * - mapping10의 쿼리문 id값이 비즈니스 로직의 이름이 됨
 * - 비즈니스 로직의 인자값은  parameterType을 참조
 * - 비즈니스 로직의 리턴값은 resultType을 참조
 */

public interface UserDAO {
	int addUser(User user) throws Exception;
	int updateUser(User user) throws Exception;
	int removeUser(String userId) throws Exception;	
	User getUser(String userId) throws Exception;
	List<User> getUserList(User user) throws Exception;
}
