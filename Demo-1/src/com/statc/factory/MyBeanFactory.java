package com.statc.factory;

public class MyBeanFactory {

	
	/*
	 * ����ʵ��
	 */
	public static UserService createService() {
		return new UserServiceImpl();
	}
	
	public static Object createObject() {
		return new Object();
	}
}
