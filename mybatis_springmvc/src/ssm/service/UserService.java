package ssm.service;

import java.util.List;

import ssm.po.User;

public interface UserService {
	public User findUserById(int id) throws Exception;
	
	public List<User> findUserByName(String name) throws Exception;
	
	public void insertUsers(User user) throws Exception;
	
	public void deleteUsers(int id) throws Exception;
}
