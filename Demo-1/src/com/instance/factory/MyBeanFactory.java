package com.instance.factory;

public class MyBeanFactory {

	
	/*
	 * ´´½¨ÊµÀý
	 */
	public UserService createService() {
		return new UserServiceImpl();
	}
	
	public Object createObject() {
		return new Object();
	}
}
