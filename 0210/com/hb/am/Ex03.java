package com.hb.am;
class Ex03 
{
	private String name = "일지매";	// 생성자에 있는 초기값이 무조건 우선된다.
	private int age = 15;			// 그러므로 여기에서 준 변수값은 getter에서 반영하지 않는다.
	private String addr = "전라도";

	// 생성자 : 멤버변수를 초기화하는 역할
	// 1. return type 없음
	// 2. 클래스 이름과 같다
	// 3. 오버로딩 가능
	// 4. 생성자는 다른 생성자를 호출할 수 있다.

	public Ex03(String n){
//		name = "홍길동";
//		age = 12;
//		addr = "충청도";
		name = n;
	}

	public Ex03(String n, int k){
		name = n;
		age = k;
	}

	public Ex03(int k, String n){
		name = n;
		age = k;
	}

	public Ex03(String n,int k, String a){
		name = n;
		age = k;
		addr = a;
	}


	// getter

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddr(){
		return addr;
	}


}
