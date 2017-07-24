package com.hb.bm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TestMemberVO implements Externalizable {
	private int idx;
	private String id = null;
	private String password = null;
	
	public TestMemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	public TestMemberVO(int idx, String id, String password, String phone) {
		super();
		this.idx = idx;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		idx = (int)in.readObject();
		id = (String)in.readObject();
		password = (String)in.readObject();
		phone = (String)in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(idx);
		out.writeObject(id);
		out.writeObject(password);
		out.writeObject(phone);
	}
	
	private String phone = null;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
