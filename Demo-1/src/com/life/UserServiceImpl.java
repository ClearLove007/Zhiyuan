package com.life;

public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		System.out.println("������");
	}
	
	@Override
	public void addUser() {
		// TODO �Զ����ɵķ������
		System.out.println("addUser");
	}

	public void init() {
		System.out.println("��ʼ��");
	}
	
	public void destory() {
		System.out.println("������");
	}
}
