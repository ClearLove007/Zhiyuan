package ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssm.mapper.UserMapper;
import ssm.po.User;
import ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findUserById(int id) throws Exception {
		// TODO 自动生成的方法存根
		return userMapper.findUserById(id);
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		// TODO 自动生成的方法存根
		return userMapper.findUserByName(name);
	}

	@Override
	public void insertUsers(User user) throws Exception {
		// TODO 自动生成的方法存根
		userMapper.insertUsers(user);
	}

	@Override
	public void deleteUsers(int id) throws Exception {
		// TODO 自动生成的方法存根
		userMapper.deleteUsers(id);
	}

}
