package com.instance.factory;

public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		System.out.println("被加载");
	}
	
	@Override
	public void addUser() {
		// TODO 自动生成的方法存根
		System.out.println("addUser");
	}

}
