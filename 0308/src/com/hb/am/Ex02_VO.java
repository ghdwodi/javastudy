package com.hb.am;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ex02_VO  implements Externalizable  {
	private String name;
	private int age;
//	transient private int age;	// transient ����� �⺻�� 0���θ� ����
	private String addr;
	private boolean gender;
	
	public Ex02_VO() {}
	
	public Ex02_VO(String name, int age, String addr, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}

	// ������ȭ �޼ҵ�
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String)in.readObject();
//		age = (int)in.readObject();		// �̷��� �� �÷��� ��������� ������ �⺻���� ��ȯ�Ѵ�.
		addr = (String)in.readObject();
		gender = (boolean)in.readObject();
	}
	
	// ����ȭ �޼ҵ�
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
//		out.writeObject(age);
		out.writeObject(addr);
		out.writeObject(gender);
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
