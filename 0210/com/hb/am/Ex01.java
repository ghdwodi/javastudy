package com.hb.am;
class Ex01
{
	private boolean live = true;
	private int age = 3;
	private String name= "ū�Լ�";

	// get (��������) : �ڷ���

	public String getName(){
		return name;
	}

	public boolean getLive(){
		return live;
	}

	public int getAge(){
		return age;
	}

	// set (������ �޾Ƽ� ����) : void

	public void setName(String n_Name){
		name = n_Name;
	}

	public void setAge(int n_Age){
		age = n_Age;
	}

	public void setLive(boolean n_Live){
		live = n_Live;
	}
}
