package com.setter;

public class Person {

	private String name;
	private int age;
	private Address homeAdd;
	private Address companyAdd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getHomeAdd() {
		return homeAdd;
	}
	public void setHomeAdd(Address homeAdd) {
		this.homeAdd = homeAdd;
	}
	public Address getCompanyAdd() {
		return companyAdd;
	}
	public void setCompanyAdd(Address companyAdd) {
		this.companyAdd = companyAdd;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", homeAdd=" + homeAdd + ", companyAdd=" + companyAdd + "]";
	}

	
}
