package com.instance.factory;

public class MyBeanFactory {

	
	/*
	 * ����ʵ��
	 */
	public UserService createService() {
		return new UserServiceImpl();
	}
	
	public Object createObject() {
		return new Object();
	}
}
