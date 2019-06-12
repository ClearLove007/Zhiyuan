package com.statc.factory;

public class MyBeanFactory {

	
	/*
	 * ´´½¨ÊµÀý
	 */
	public static UserService createService() {
		return new UserServiceImpl();
	}
	
	public static Object createObject() {
		return new Object();
	}
}
