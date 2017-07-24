package com.hb.am;
class Ex02 
{
	// 오버로딩 : 이름만 같고 매개변수, 인자가 다른 메소드가 여러 개 존재하는 것

	public void getLength(boolean n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(int n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(long n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(float n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(double n){
		String str = n+"";
		getLength(str);
	}
	public void getLength(String n){
		System.out.println("입력한 값 : "+n);
		System.out.println("입력한 값의 길이 : "+n.length());
	}
}
