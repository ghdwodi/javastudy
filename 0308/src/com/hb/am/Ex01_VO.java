package com.hb.am;

import java.io.Serializable;

// 하나의 객체의 정보를 갖고 있는 클래스 Value Object가 있다.
// 이 객체를 직렬화하기 위해 Serializable 인터페이스를 상속받는다.
// 모든 멤버변수가 객체 직렬화 대상이 된다.
// 해당 변수에 transient를 사용하면 직렬화 대상에서 제외된다.

public class Ex01_VO implements Serializable {
	private String name;
	private int age;
//	transient private int age;	// transient 적용시 기본값 0으로만 저장
	private String addr;
	private boolean gender;
	
	public Ex01_VO() {}
	
	public Ex01_VO(String name, int age, String addr, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}
	
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
