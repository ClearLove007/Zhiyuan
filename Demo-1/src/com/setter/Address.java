package com.setter;

public class Address {

	private String tel;
	private String address;
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [tel=" + tel + ", address=" + address + "]";
	}
}
