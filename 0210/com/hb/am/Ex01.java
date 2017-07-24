package com.hb.am;
class Ex01
{
	private boolean live = true;
	private int age = 3;
	private String name= "큰뿔소";

	// get (정보전달) : 자료형

	public String getName(){
		return name;
	}

	public boolean getLive(){
		return live;
	}

	public int getAge(){
		return age;
	}

	// set (정보를 받아서 수정) : void

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
